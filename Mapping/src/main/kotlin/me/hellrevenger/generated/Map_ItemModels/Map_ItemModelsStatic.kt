package me.hellrevenger.generated.Map_ItemModels
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ItemModelsKt {
    /**
     * method_65496
     */
    fun <T>select(property: SelectProperty<T>?, cases: Array<net.minecraft.class_10451.class_10452<T>>) = ItemModels.method_65496<T>(property, *cases)
    /**
     * method_65486
     */
    fun rangeDispatchEntry(model: net.minecraft.class_10439.class_10441?, threshold: Float) = ItemModels.method_65486(model, threshold)
    /**
     * method_65481
     */
    fun basic(model: Identifier?) = ItemModels.method_65481(model)
    /**
     * method_65491
     */
    fun rangeDispatch(property: NumericProperty?, fallback: net.minecraft.class_10439.class_10441?, entries: Array<net.minecraft.class_10448.class_10449>) = ItemModels.method_65491(property, fallback, *entries)
    /**
     * method_65479
     */
    fun usingItemProperty() = ItemModels.method_65479()
    /**
     * method_65492
     */
    fun rangeDispatch(property: NumericProperty?, entries: MutableList<net.minecraft.class_10448.class_10449>?) = ItemModels.method_65492(property, entries)
    /**
     * method_65487
     */
    fun condition(property: bool_BooleanProperty?, onTrue: net.minecraft.class_10439.class_10441?, onFalse: net.minecraft.class_10439.class_10441?) = ItemModels.method_65487(property, onTrue, onFalse)
    /**
     * method_65909
     */
    fun overworldSelect(overworldModel: net.minecraft.class_10439.class_10441?, fallback: net.minecraft.class_10439.class_10441?) = ItemModels.method_65909(overworldModel, fallback)
    /**
     * method_65483
     */
    fun tinted(model: Identifier?, tints: Array<TintSource>) = ItemModels.method_65483(model, *tints)
    /**
     * method_65808
     */
    fun christmasSelect(regularModel: net.minecraft.class_10439.class_10441?, christmasModel: net.minecraft.class_10439.class_10441?) = ItemModels.method_65808(regularModel, christmasModel)
    /**
     * method_65484
     */
    fun <T>select(property: property_Property<T>?, fallback: net.minecraft.class_10439.class_10441?, valuesToModels: Map<T, net.minecraft.class_10439.class_10441>?) where T: Comparable<T> = ItemModels.method_65484<T>(property, fallback, valuesToModels)
    /**
     * method_65489
     */
    fun rangeDispatch(property: NumericProperty?, scale: Float, entries: MutableList<net.minecraft.class_10448.class_10449>?) = ItemModels.method_65489(property, scale, entries)
    /**
     * method_65494
     */
    fun <T>select(property: SelectProperty<T>?, fallback: net.minecraft.class_10439.class_10441?, cases: Array<net.minecraft.class_10451.class_10452<T>>) = ItemModels.method_65494<T>(property, fallback, *cases)
    /**
     * method_65482
     */
    fun special(base: Identifier?, specialModel: net.minecraft.class_10515.class_10516?) = ItemModels.method_65482(base, specialModel)
    /**
     * method_65488
     */
    fun rangeDispatch(property: NumericProperty?, scale: Float, fallback: net.minecraft.class_10439.class_10441?, entries: Array<net.minecraft.class_10448.class_10449>) = ItemModels.method_65488(property, scale, fallback, *entries)
    /**
     * method_65493
     */
    fun <T>select(property: SelectProperty<T>?, fallback: net.minecraft.class_10439.class_10441?, cases: MutableList<net.minecraft.class_10451.class_10452<T>>?) = ItemModels.method_65493<T>(property, fallback, cases)
    /**
     * method_65500
     */
    fun composite(models: Array<net.minecraft.class_10439.class_10441>) = ItemModels.method_65500(*models)
    /**
     * method_65490
     */
    fun rangeDispatch(property: NumericProperty?, fallback: net.minecraft.class_10439.class_10441?, entries: MutableList<net.minecraft.class_10448.class_10449>?) = ItemModels.method_65490(property, fallback, entries)
    /**
     * method_65495
     */
    fun <T>select(property: SelectProperty<T>?, cases: MutableList<net.minecraft.class_10451.class_10452<T>>?) = ItemModels.method_65495<T>(property, cases)
    /**
     * method_65480
     */
    fun constantTintSource(value: Int) = ItemModels.method_65480(value)
    /**
     * method_65497
     */
    fun <T>switchCase(value: T, model: net.minecraft.class_10439.class_10441?) = ItemModels.method_65497<T>(value, model)
    /**
     * method_65499
     */
    fun hasComponentProperty(component: ComponentType<*>?) = ItemModels.method_65499(component)
    /**
     * method_65498
     */
    fun <T>switchCase(values: MutableList<T>?, model: net.minecraft.class_10439.class_10441?) = ItemModels.method_65498<T>(values, model)
}