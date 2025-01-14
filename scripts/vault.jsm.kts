import me.hellrevenger.generated.*
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.event.Event

typealias VaultBlock = net.minecraft.class_9197
typealias Items = net.minecraft.class_1802
typealias EnchantmentHelper = net.minecraft.class_1890



fun <T> registerEvent(event: Event<T>, callback: T) {
    val register = JsMacros.createCustomEvent("RegisterKtEvent")
    register.putObject("event", event)
    register.putObject("callback", callback)
    register.putObject("context", context.ctx)
    register.trigger()
}

registerEvent(ClientTickEvents.START_CLIENT_TICK, ClientTickEvents.StartTick {
    val interactions = Player.interactions() ?: return@StartTick
    val pos = interactions.targetedBlock ?: return@StartTick
    val block = World.getBlock(pos) ?: return@StartTick
    val rawBlock = block.rawBlock
    if (rawBlock is VaultBlock) {
        val blockEntity = block.rawBlockEntity as VaultBlockEntity
        val blockState = block.rawBlockState

        val item = blockEntity.getSharedData().getDisplayItem()

        if (item.isOf(Items::class.HEAVY_CORE)) {
            interactions.interact();
        }
        else if (blockState.method_11654(VaultBlock.field_50171)) {
            return@StartTick
        }
    }
})