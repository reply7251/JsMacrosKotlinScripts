@file:ImportJar("../libs/jars/wynntils.jar")

import com.google.gson.*
import com.google.gson.JsonArray
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.wynntils.core.components.Managers.Feature
import com.wynntils.features.map.MainMapFeature
import com.wynntils.screens.maps.AbstractMapScreen
import com.wynntils.services.map.pois.MarkerPoi
import com.wynntils.utils.mc.type.PoiLocation
import com.wynntils.utils.render.RenderUtils
import com.wynntils.utils.render.Texture
import com.wynntils.utils.type.BoundingBox
import me.hellrevenger.generated.*
import me.hellrevenger.generated.Map_DrawContext.getMatrices
import me.hellrevenger.generated.Map_Screen.height
import me.hellrevenger.generated.Map_Screen.renderBackground
import me.hellrevenger.generated.Map_Screen.width
import net.minecraft.class_332
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.io.File
import java.lang.reflect.Type
import kotlin.collections.map


interface Serializer<T> : JsonSerializer<T>, JsonDeserializer<T>


class Config {
    var nodeCounter = 0
    var nodes = mutableMapOf<Int, Node>()
    var paths = mutableSetOf<Path>()

    fun addNode(node: Node) {
        nodes[node.id] = node
    }
}
object ConfigSerializer : Serializer<Config> {
    var currentConfig: Config? = null
    override fun serialize(src: Config, typeOfSrc: Type, context: JsonSerializationContext): JsonElement {
        val obj = JsonObject()
        val nodes = JsonArray()
        src.nodes.values.forEach {
            nodes.add(NodeSerializer.serialize(it, it.javaClass, context))
        }
        obj.add("nodes", nodes)
        val paths = JsonArray()
        src.paths.forEach {
            paths.add(PathSerializer.serialize(it, it.javaClass, context))
        }
        obj.add("paths", paths)
        return obj
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Config {
        currentConfig = Config()
        (json as? JsonObject)?.let {
            val nodes = json.getAsJsonArray("nodes")
            currentConfig!!.nodes = nodes.map { NodeSerializer.deserialize(it, Node::class.java, context)}
                .associateBy { it.id }.toMutableMap()
            val paths = json.getAsJsonArray("paths")
            currentConfig!!.paths = paths.map { PathSerializer.deserialize(it, Path::class.java, context)}.toMutableSet()
        }
        return currentConfig!!
    }
}

class Node(val id: Int, val x: Int, val y: Int, val z: Int)
object NodeSerializer : Serializer<Node> {
    val NullNode = Node(0, 0, 0, 0)

    override fun serialize(src: Node, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        val obj = JsonObject()
        obj.addProperty("id", src.id)
        val pos = JsonArray()
        pos.add(src.x)
        pos.add(src.y)
        pos.add(src.z)
        obj.add("pos", pos)
        return obj
    }

    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext?): Node {
        (json as? JsonObject)?.let {
            val pos = it.getAsJsonArray("pos")
            val id = it.get("id").asInt
            ConfigSerializer.currentConfig!!.nodeCounter =
                ConfigSerializer.currentConfig!!.nodeCounter.coerceAtLeast(id + 1)
            return Node(id, pos[0].asInt, pos[1].asInt, pos[2].asInt)
        }
        return NullNode
    }
}

class Path(val node: Node) {
    val neighbors = mutableSetOf<Node>()
}

object PathSerializer : Serializer<Path> {
    val NullPath = Path(NodeSerializer.NullNode)

    val pois = Feature.getFeatureInstance(MainMapFeature::class.java).customPois.get()

    fun findNode(id: Int) = ConfigSerializer.currentConfig?.nodes?.get(id)

    override fun serialize(src: Path, typeOfSrc: Type, context: JsonSerializationContext): JsonElement {
        val obj = JsonObject()
        obj.addProperty("id", src.node.id)
        val neighbors = JsonArray()
        src.neighbors.forEach { neighbors.add(it.id) }
        obj.add("neighbors", neighbors)
        return obj
    }

    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext?): Path {
        (json as? JsonObject)?.let {  obj ->
            findNode(obj.get("id").asInt)?.let {
                val node = Path(it)
                node.neighbors.addAll(obj.getAsJsonArray("neighbors")
                    .mapNotNull { findNode(it.asInt) })
                return node
            }
        }
        return NullPath
    }
}

val file = File(context.containedFolder, "config/profession.json")
val GSON = GsonBuilder()
    .registerTypeAdapter(Config::class.java, ConfigSerializer)
    .enableComplexMapKeySerialization()
    .setPrettyPrinting()
    .serializeNulls()
    .create()

val config = GSON.fromJson(file.readText(), Config::class.java)

fun saveConfig() {
    file.writeText(GSON.toJson(config))
}

class PathMap : AbstractMapScreen() {
    val mainMapFeature = Feature.getFeatureInstance(MainMapFeature::class.java)

    override fun doInit() {
        super.doInit()

        (this as? IScreen)?.addButton(width / 2,
            (renderHeight - renderedBorderYOffset - 10).toInt(), 30, 10, "Add Node", JavaWrapper.methodToJava { a, b ->
                addNode()
            })

        centerMapAroundPlayer()
    }

    fun addNode() {
        val pos = Player.player?.blockPos ?: return
        addNodeAt(pos.x, pos.y, pos.z)
    }

    fun addNodeAt(x: Int, y: Int, z: Int) {
        val id = config.nodeCounter++
        config.addNode(Node(id, x, y, z))
    }

    override fun doRender(guiGraphics: class_332, mouseX: Int, mouseY: Int, partialTick: Float) {
        val stack = guiGraphics.getMatrices()
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f)
        RenderSystem.enableDepthTest()
        renderMap(stack)
        RenderUtils.enableScissor((renderX + renderedBorderXOffset).toInt(), (renderY + renderedBorderYOffset).toInt(),
            mapWidth.toInt(), mapHeight.toInt()
        )

        renderCursor(stack, mainMapFeature.playerPointerScale.get(), mainMapFeature.pointerColor.get(), mainMapFeature.pointerType.get())

        RenderUtils.disableScissor()

        renderBackground(guiGraphics, mouseX, mouseY, partialTick)
        renderNodes(stack, mouseX, mouseY)
        renderCoordinates(stack, mouseX, mouseY)
    }

    fun renderNodes(stack: net.minecraft.class_4587, mouseX: Int, mouseY: Int) {
        val pois = config.nodes.values.map {
            MarkerPoi(PoiLocation(it.x, it.y, it.z), it.id.toString(), Texture.SIGN) }
        renderPois(pois, stack,
            BoundingBox.centered(mapCenterX, mapCenterZ, width / zoomRenderScale, height / zoomRenderScale),
            mainMapFeature.poiScale.get(),
            mouseX, mouseY)
    }
}

object Control {
    fun gotoNode(node: Node) {

    }
}

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    saveConfig()
}