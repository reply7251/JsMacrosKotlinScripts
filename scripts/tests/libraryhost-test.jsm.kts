import io.github.gaming32.jsmacros.kotlin.language.impl.KotlinScriptContext
import io.github.gaming32.jsmacros.kotlin.library.impl.FWrapper
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.MethodWrapper
import xyz.wagyourtail.jsmacros.core.library.BaseLibrary
import xyz.wagyourtail.jsmacros.core.library.PerExecLibrary
import xyz.wagyourtail.jsmacros.core.library.impl.classes.ClassBuilder
import xyz.wagyourtail.jsmacros.core.library.impl.classes.LibraryBuilder
import xyz.wagyourtail.jsmacros.core.service.EventService

//JavaWrapper.methodToJava<Any, Any, Any>(fun(){} as Function0<*>)

try {
    Core.getInstance().libraryRegistry.addLibrary(Reflection.getClassFromClassBuilderResult("Test") as Class<out BaseLibrary>?)
} catch (e: Exception) {
    when (e) {
        is ClassNotFoundException -> {
            //e.printStackTrace()
            val hasConstructorSetField = Reflection.getDeclaredField(LibraryBuilder::class.java, "hasConstructorSet")
            hasConstructorSetField.trySetAccessible()

            val builder = Reflection.createLibraryBuilder("Test", true)
            hasConstructorSetField.set(builder, true)

            val identifier = "Test;test"
            ClassBuilder.methodWrappers.put(identifier, JavaWrapper.methodToJava<Any, Any, Any>(fun(){
                Chat.log("test!")
            }))

            builder
                .addConstructor(KotlinScriptContext::class.java)
                .makePublic()
                .body("{super($1);}")
                .addMethod(Void.TYPE, "test")
                .makePublic()
                .body("""
                        {
                            xyz.wagyourtail.jsmacros.core.library.impl.classes.ClassBuilder.methodWrappers.get(identifier).accept(this, new Object[]{});
                        }
                    """.trimIndent())
                .finishBuildAndFreeze()
        }
        else -> throw e
    }

}


(event as? EventService)?.stopListener = JavaWrapper.methodToJava<Any, Any, Any>(fun(){

})