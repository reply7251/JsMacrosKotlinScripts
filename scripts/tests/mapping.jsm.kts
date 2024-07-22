
import me.hellrevenger.generated.player
import me.hellrevenger.generated.sendMessage

val text = Chat.createTextBuilder().append("yeah").build().raw
try {
    Client.minecraft.player?.sendMessage(text)
    Client.minecraft.field_1724?.method_43496(text)

} catch(e: Exception){
    Chat.log(e)
}


Chat.log("test")