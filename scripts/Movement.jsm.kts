
import net.minecraft.client.Minecraft
import net.minecraft.client.player.ClientInput
import net.minecraft.world.entity.player.Input
import net.minecraft.world.phys.Vec2
import xyz.wagyourtail.jsmacros.api.math.Pos3D
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.roundToInt
import kotlin.math.sin

val radian = Math.PI / 180
class MyInput : ClientInput() {
    var targetDirection = 0f
    var startPos = Pos3D.ZERO

    fun getMovementMultiplier(a: Boolean, b: Boolean) =
        if (a == b) 0.0f
        else if (a) 1.0f
        else -1.0f

    override fun tick() {
        val player = Player.player!!

        val mag = player.pos.toVector(startPos).magnitude + 1
        val dx = -sin(targetDirection * radian) * mag
        val dz = cos(targetDirection * radian) * mag
        val vec = player.pos.toReverseVector(startPos.x + dx, player.y, startPos.z + dz)
        val target = atan2(-vec.deltaX, vec.deltaZ) / radian
        val diff = (((player.yaw - target) - 22.5) / 45).roundToInt() * radian * 45
        moveVector = Vec2(cos(diff).toFloat(), sin(diff).toFloat())
        keyPresses = Input(
            moveVector.x > 0,
            moveVector.x < 0,
            moveVector.y > 0,
            moveVector.y < 0,
            false, false, false
        )

        moveVector = Vec2(
            getMovementMultiplier(keyPresses.left, keyPresses.right),
            getMovementMultiplier(keyPresses.forward, keyPresses.backward)
        )
    }
}
fun main() {
    val player = Player.player ?: return
    val myInput = MyInput()
    myInput.targetDirection = player.yaw
    myInput.startPos = player.pos

    val old = player.raw.input
    player.raw.input = myInput
    Client.waitTick(80)
    player.raw.input = old
}

main()

