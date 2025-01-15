package me.hellrevenger.generated.Map_SimpleOption
import kotlin.reflect.*
import me.hellrevenger.generated.*

val <T>KClass<SimpleOption<T>>.BOOLEAN by aliasStatic({SimpleOption.field_38278})
val <T>KClass<SimpleOption<T>>.BOOLEAN_TEXT_GETTER by aliasStatic({SimpleOption.field_41333})
fun <T>SimpleOption<T>.getCallbacks() = this.method_41754()
fun <T>SimpleOption<T>.createWidget(arg0: GameOptions) = this.method_57701(arg0)
fun <T>SimpleOption<T>.getCodec() = this.method_42404()
fun <T>SimpleOption<T>.getValue() = this.method_41753()
fun <T>KClass<SimpleOption<T>>.ofBoolean(arg0: String, arg1: net.minecraft.class_7172.class_7277<Boolean>, arg2: net.minecraft.class_7172.class_7303<Boolean>, arg3: Boolean, arg4: Consumer<Boolean>) = SimpleOption.method_47604(arg0, arg1, arg2, arg3, arg4)
fun <T>SimpleOption<T>.setValue(arg0: T) = this.method_41748(arg0)
fun <T>SimpleOption<T>.createWidget(arg0: GameOptions, arg1: Int, arg2: Int, arg3: Int, arg4: Consumer<T>) = this.method_47603(arg0, arg1, arg2, arg3, arg4)
fun <T>KClass<SimpleOption<T>>.emptyTooltip() = SimpleOption.method_42399<T>()
fun <T>KClass<SimpleOption<T>>.ofBoolean(arg0: String, arg1: net.minecraft.class_7172.class_7277<Boolean>, arg2: Boolean) = SimpleOption.method_41749(arg0, arg1, arg2)
fun <T>KClass<SimpleOption<T>>.ofBoolean(arg0: String, arg1: Boolean, arg2: Consumer<Boolean>) = SimpleOption.method_41751(arg0, arg1, arg2)
fun <T>KClass<SimpleOption<T>>.ofBoolean(arg0: String, arg1: Boolean) = SimpleOption.method_42402(arg0, arg1)
fun <T>SimpleOption<T>.createWidget(arg0: GameOptions, arg1: Int, arg2: Int, arg3: Int) = this.method_18520(arg0, arg1, arg2, arg3)
fun <T>KClass<SimpleOption<T>>.ofBoolean(arg0: String, arg1: net.minecraft.class_7172.class_7277<Boolean>, arg2: Boolean, arg3: Consumer<Boolean>) = SimpleOption.method_41750(arg0, arg1, arg2, arg3)
fun <T>KClass<SimpleOption<T>>.enumValueText() where T: TranslatableOption = SimpleOption.method_42720<T>()
fun <T>KClass<SimpleOption<T>>.constantTooltip(arg0: Text) = SimpleOption.method_42717<T>(arg0)
