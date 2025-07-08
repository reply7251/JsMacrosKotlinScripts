import me.hellrevenger.generated.Input
import me.hellrevenger.generated.KeyboardInput
import me.hellrevenger.generated.Map_ClientPlayerEntity.input
import me.hellrevenger.generated.Map_Input.movementForward
import me.hellrevenger.generated.Map_Input.movementSideways
import me.hellrevenger.generated.Map_Input.playerInput
import me.hellrevenger.generated.Map_PlayerInput.backward
import me.hellrevenger.generated.Map_PlayerInput.forward
import me.hellrevenger.generated.Map_PlayerInput.left
import me.hellrevenger.generated.Map_PlayerInput.right
import me.hellrevenger.generated.PlayerInput
import xyz.wagyourtail.jsmacros.api.math.Pos3D
import kotlin.math.cos
import kotlin.math.roundToInt
import kotlin.math.sin

val radian = Math.PI / 180
class MyInput : Input() {
    var targetDirection = 0f
    var startPos = Pos3D.ZERO

    override fun method_3129() {
        val player = Player.player!!

        val mag = player.pos.toVector(startPos).magnitude + 1
        val dx = -sin(targetDirection * radian) * mag
        val dz = cos(targetDirection * radian) * mag
        val vec = player.pos.toReverseVector(startPos.x + dx, player.y, startPos.z + dz)
        var target = Math.atan2(-vec.deltaX, vec.deltaZ) / radian
        val diff = (((player.yaw - target) - 22.5) / 45).roundToInt() * radian * 45

        movementForward = cos(diff).toFloat()
        movementSideways = sin(diff).toFloat()

        this.playerInput = PlayerInput(movementForward > 0, movementForward < 0, movementSideways > 0, movementSideways < 0, false, false, false)

        movementForward = KeyboardInput.method_40218(playerInput.forward(), playerInput.backward())
        movementSideways = KeyboardInput.method_40218(playerInput.left(), playerInput.right())
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

