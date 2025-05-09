package me.hellrevenger.generated.Map_SimpleOption
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SimpleOptionKt {
    /**
     * field_38278
     */
    val BOOLEAN by aliasStatic({SimpleOption.field_38278})
    /**
     * field_41333
     */
    val BOOLEAN_TEXT_GETTER by aliasStatic({SimpleOption.field_41333})
    /**
     * method_47604
     */
    fun <T>ofBoolean(key: String, tooltipFactory: net.minecraft.class_7172.class_7277<Boolean>, valueTextGetter: net.minecraft.class_7172.class_7303<Boolean>, defaultValue: Boolean, changeCallback: Consumer<Boolean>) = SimpleOption.method_47604(key, tooltipFactory, valueTextGetter, defaultValue, changeCallback)
    /**
     * method_42399
     */
    fun <T>emptyTooltip() = SimpleOption.method_42399<T>()
    /**
     * method_42720
     */
    fun <T>enumValueText() where T: TranslatableOption = SimpleOption.method_42720<T>()
    /**
     * method_42717
     */
    fun <T>constantTooltip(text: Text) = SimpleOption.method_42717<T>(text)
}