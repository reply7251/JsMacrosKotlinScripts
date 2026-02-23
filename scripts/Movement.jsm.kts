
import me.hellrevenger.library.api._invokePrivate
import com.jsmacrosce.jsmacros.api.math.Pos3D
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.roundToInt
import kotlin.math.sin
import net.minecraft.class_744
import net.minecraft.class_10185
import net.minecraft.class_241
import net.minecraft.class_743
import net.minecraft.class_5611

val radian = Math.PI / 180
class MyInput : class_744() {
    var targetDirection = 0f
    var startPos = Pos3D.ZERO

    fun getMovementMultiplier(a: Boolean, b: Boolean) =
        if (a == b) 0.0f
        else if (a) 1.0f
        else -1.0f

    override fun method_3129() {
        val player = Player.player!!

        val mag = player.pos.toVector(startPos).magnitude + 1
        val dx = -sin(targetDirection * radian) * mag
        val dz = cos(targetDirection * radian) * mag
        val vec = player.pos.toReverseVector(startPos.x + dx, player.y, startPos.z + dz)
        val target = atan2(-vec.deltaX, vec.deltaZ) / radian
        val diff = (((player.yaw - target) - 22.5) / 45).roundToInt() * radian * 45
        player.raw.field_3913.field_54155
        this.field_55868 = class_241(cos(diff).toFloat(), sin(diff).toFloat())
        this.field_54155 = class_10185(
            this.field_55868.field_1342 > 0,
            this.field_55868.field_1342 < 0,
            this.field_55868.field_1343 > 0,
            this.field_55868.field_1343 < 0,
                false, false, false
        )
        this.field_55868 = class_241(
            getMovementMultiplier(this.field_54155.comp_3159(), this.field_54155.comp_3160()),
            getMovementMultiplier(this.field_54155.comp_3161(), this.field_54155.comp_3162())
        )


//        field_3905 = cos(diff).toFloat()
//        field_3907 = sin(diff).toFloat()

//        field_54155 = class_10185(
//            field_3905 > 0,
//            field_3905 < 0,
//            field_3907 > 0,
//            field_3907 < 0,
//            false, false, false
//        )

//        field_3905 = class_743::class.java._invokePrivate("method_40218", arrayOf(field_54155.comp_3159(), field_54155.comp_3160()), true)!!
//        field_3907 = class_743::class.java._invokePrivate("method_40218", arrayOf(field_54155.comp_3161(), field_54155.comp_3162()), true)!!
    }
}
fun main() {
    val player = Player.player ?: return
    val myInput = MyInput()
    myInput.targetDirection = player.yaw
    myInput.startPos = player.pos

    val old = player.raw.field_3913
    player.raw.field_3913 = myInput
    Client.waitTick(80)
    player.raw.field_3913 = old
}

main()

