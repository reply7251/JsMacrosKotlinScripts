
import me.hellrevenger.generated.player
import me.hellrevenger.generated.sendMessage


//val MinecraftClient.player by alias(MinecraftClient::field_1724)
try {
    Client.minecraft.player!!.sendMessage(Chat.createTextBuilder().append("yeah").build().raw)

} catch(e: Exception){
    Chat.log(e)
}


Chat.log("test")