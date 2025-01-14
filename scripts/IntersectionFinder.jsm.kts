import me.hellrevenger.library.api.EventListener
import xyz.wagyourtail.jsmacros.client.api.classes.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import kotlin.math.tan

var lastVec = Pos3D.ZERO
//z = ax + b
fun getEquation(vec: Pos3D): Pair<Double, Double> {
    val a = tan(vec.y * Math.PI / 180)
    val b = vec.z - a * vec.x
    return a to b
}

fun calculate(vec1: Pos3D, vec2: Pos3D) {
    val e1 = getEquation(vec1)
    val e2 = getEquation(vec2)
    if(e1.first == e2.first) {
        Chat.log("Please move and try again")
    } else {
        val x = (e2.second - e1.second) / (e1.first - e2.first)
        val z = x * e1.first + e1.second
        Chat.log("result: x:%.2f, z:%.2f".format(x, z))
    }
}

EventListener(context, EventKey::class.java, {
    if(it.action == 1 && it.key == "key.keyboard.c" && KeyBind.pressedKeys.contains("key.keyboard.f3")) {
        val player = Player.player ?: return@EventListener
        val currentVec = Pos3D(player.x, player.yaw.toDouble(), player.z)
        calculate(lastVec, currentVec)
        lastVec = currentVec
    }
})

Chat.toast("IntersectionFinder", "enabled")