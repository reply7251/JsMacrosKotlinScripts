import me.hellrevenger.library.api.RuntimeMixin
import me.hellrevenger.library.api.instrumentation
import net.bytebuddy.ByteBuddy
import net.bytebuddy.asm.Advice
import net.bytebuddy.asm.MemberAttributeExtension
import net.bytebuddy.description.annotation.AnnotationDescription
import net.bytebuddy.description.modifier.Ownership
import net.bytebuddy.description.modifier.Visibility
import net.bytebuddy.dynamic.ClassFileLocator
import net.bytebuddy.implementation.MethodCall
import net.bytebuddy.implementation.SuperMethodCall
import net.bytebuddy.matcher.ElementMatchers
import net.bytebuddy.utility.RandomString
import xyz.wagyourtail.jsmacros.client.api.library.impl.FChat
import xyz.wagyourtail.jsmacros.core.service.EventService


var clazz1 = Reflection.createClassBuilder("MixinMinecraftClient6", Object::class.java)
    .addMethod(Void.TYPE, "method_1574").toggleStatic().makePublic()
    .body("{ new xyz.wagyourtail.jsmacros.client.api.library.impl.FChat().actionbar(\"test\"); }")
    .finishBuildAndFreeze()
var MixinMinecraftClient = ByteBuddy()
    .rebase(clazz1, ClassFileLocator.ForInstrumentation.of(instrumentation, clazz1))
.name("MixinMinecraftClient6\$\$${RandomString.hashOf(World.getTime())}")
    .visit(MemberAttributeExtension.ForMethod()
            .annotateMethod(AnnotationDescription.Builder.ofType(Advice.OnMethodEnter::class.java).build())
        .on(ElementMatchers.named("method_1574")))
        .make()
        .load(context.javaClass.classLoader).getLoaded()
var mixinMinecraftClient = Advice.to(MixinMinecraftClient, ClassFileLocator.ForInstrumentation.of(instrumentation, MixinMinecraftClient)).on(ElementMatchers.named("method_1574"))

//val className = "test7"
//val builder = Reflection.createClassBuilder(className, Object::class.java)
//val clazz1 = builder.addMethod(Void.TYPE, "test").toggleStatic().makePublic()
//    .body("{new xyz.wagyourtail.jsmacros.client.api.library.impl.FChat().actionbar(\"test\");}")
//    .finishBuildAndFreeze()
//
//val clazz2 = ByteBuddy()
//    .rebase(clazz1, ClassFileLocator.ForInstrumentation.of(instrumentation, clazz1))
//    .name(className + "$$" + RandomString.hashOf(World.time))
//    .visit(MemberAttributeExtension.ForMethod()
//        .annotateMethod(AnnotationDescription.Builder.ofType(Advice.OnMethodEnter::class.java).build())
//        .on(ElementMatchers.named("test")))
//    .make()
//    .load(this::class.java.classLoader).loaded
//
//RuntimeMixin.writeResult(context, clazz2)
//
//val visitor = Advice.to(clazz2, ClassFileLocator.ForInstrumentation.of(instrumentation, clazz2))
//    .on(ElementMatchers.named("method_1574"))
//try {
//    RuntimeMixin.addMixin(net.minecraft.class_310::class.java, visitor)
//    RuntimeMixin.doMixin(net.minecraft.class_310::class.java)
//} catch (e: Exception) {}
//
//(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
//    RuntimeMixin.removeMixin(net.minecraft.class_310::class.java, visitor)
//    RuntimeMixin.doMixin(net.minecraft.class_310::class.java)
//}

//val pool = ClassPool.getDefault()
//pool.insertClassPath(LoaderClassPath(ByteBuddy::class.java.classLoader))
//val MixinMinecraftClient = Reflection.createClassBuilder("MixinMinecraftClient", java.lang.Object::class.java)
//    .addMethod(Void.TYPE, "method_1574")
//    .addAnnotation(Advice.OnMethodEnter::class.java).finish()
//    .guestBody(JavaWrapper.methodToJava { self, args ->
//        FChat().actionbar("hi")
//    }).finishBuildAndFreeze()
//

//val implementation = MethodCall.invoke(FChat::class.java.getMethod("actionbar", Object::class.java)).with("tick!")
//    .andThen(MethodCall.invokeSelf())
//
//val matcher = ElementMatchers.named<MethodDescription>("method_1574")
//try {
//    RuntimeMixin.setIntercept(net.minecraft.class_310::class.java, matcher, implementation)
//    RuntimeMixin.doMixin(net.minecraft.class_310::class.java)
//} catch (_: Exception) {}
//
//RuntimeMixin.writeResult(context, net.minecraft.class_310::class.java)
//
//(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
//    RuntimeMixin.removeIntercept(net.minecraft.class_310::class.java, matcher)
//    RuntimeMixin.doMixin(net.minecraft.class_310::class.java)
//}

//
//
//object MixinClientWorld {
//
//    @Advice.OnMethodExit
//    @JvmStatic
//    fun getBlockParticle(
//        @Advice.FieldValue("field_35432", typing = Assigner.Typing.DYNAMIC) BLOCK_MARKER_ITEMS: Set<class_1792>,
//        @Advice.Return(readOnly = false, typing = Assigner.Typing.DYNAMIC) returnValue: Any?
//    ) {
//        var returnValue = returnValue
//        if(returnValue != null) return
//
//        val mc = class_310.method_1551()
//
//        val itemstack = mc.field_1724?.method_6047() ?: return
//        val item = itemstack.method_7909()
//        if(BLOCK_MARKER_ITEMS?.contains(item) == true)
//            returnValue = (item as? class_1747)?.method_7711()
//    }
//}
//RuntimeMixin.writeResult(context, MixinClientWorld::class.java)
//
//val matcher = ElementMatchers.named<MethodDescription>("method_35752")
//
//val mixinClientWorld = RuntimeMixin.getPatchedImplementation(MixinClientWorld::class.java).on(matcher)
//
////RuntimeMixin.writeResult(context, MixinClientWorld::class.java)
//
//RuntimeMixin.addMixin(net.minecraft.class_638::class.java, mixinClientWorld)
//RuntimeMixin.doMixin(net.minecraft.class_638::class.java)
//
//(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
//    RuntimeMixin.removeMixin(net.minecraft.class_638::class.java, mixinClientWorld)
//    RuntimeMixin.doMixin(net.minecraft.class_638::class.java)
//}



Chat.toast("MixinTest", "enabled")