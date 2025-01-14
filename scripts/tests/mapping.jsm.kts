import me.hellrevenger.library.api.RuntimeMixin
import net.bytebuddy.ByteBuddy
import net.bytebuddy.asm.Advice
import net.bytebuddy.description.method.MethodDescription
import net.bytebuddy.dynamic.VisibilityBridgeStrategy
import net.bytebuddy.dynamic.scaffold.TypeValidation
import net.bytebuddy.implementation.FixedValue
import net.bytebuddy.matcher.ElementMatchers
import org.jetbrains.kotlin.com.intellij.core.CoreApplicationEnvironment
import org.jetbrains.kotlin.com.intellij.mock.MockApplication
import org.jetbrains.kotlin.com.intellij.mock.MockProject
import org.jetbrains.kotlin.com.intellij.openapi.application.ApplicationManager
import org.jetbrains.kotlin.com.intellij.openapi.extensions.Extensions
import org.jetbrains.kotlin.com.intellij.openapi.util.UserDataHolderBase
import org.jetbrains.kotlin.com.intellij.pom.PomModel
import org.jetbrains.kotlin.com.intellij.pom.core.impl.PomModelImpl
import org.jetbrains.kotlin.com.intellij.psi.impl.source.codeStyle.IndentHelper
import org.jetbrains.kotlin.com.intellij.psi.impl.source.tree.TreeCopyHandler
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.resolve.BindingTraceContext
import org.jetbrains.kotlin.types.KotlinType
import xyz.wagyourtail.jsmacros.client.api.library.impl.FChat
import xyz.wagyourtail.jsmacros.core.service.EventService


object MixinBindingTraceContext {

    @Advice.OnMethodExit
    @JvmStatic
    fun recordType(
        @Advice.This this_: BindingTraceContext?,
        @Advice.Argument(0) expression: KtExpression?,
        @Advice.Argument(1) type: KotlinType?,
    ) {
        (expression as? KtCallExpression)?.let {

            (it.getCalleeExpression() as? KtNameReferenceExpression)?.let {
                FChat().log(it.text)

            }

            this_?.let { this_ ->
                if(ApplicationManager.getApplication().getService(IndentHelper::class.java) == null) {
//                (ApplicationManager.getApplication() as MockApplication).getPicoContainer().registerComponentInstance(IndentHelper::class.java.name, object :
//                    IndentHelper() {
//                    override fun getIndent(p0: PsiFile, p1: ASTNode) = 0
//
//                    override fun getIndent(p0: PsiFile, p1: ASTNode, p2: Boolean) = 0
//                })
                    val indentHelper = ByteBuddy()
                        .with(TypeValidation.DISABLED)
                        .with(VisibilityBridgeStrategy.Default.NEVER)
                        .subclass(IndentHelper::class.java)
                        .method(ElementMatchers.named("getIndent"))
                        .intercept(FixedValue.value(0))
                        .make().load(this_.javaClass.classLoader).loaded.getDeclaredConstructor().newInstance()
                    (ApplicationManager.getApplication() as MockApplication).getPicoContainer().registerComponentInstance(IndentHelper::class.java.name, indentHelper)

                }
                if(expression.project.getService(PomModel::class.java) == null) {
                    class MyPomModel : UserDataHolderBase() {

                    }

//                    val NewPomModelImpl= ByteBuddy()
//                        .with(TypeValidation.DISABLED)
//                        .with(VisibilityBridgeStrategy.Default.NEVER)
//                        .redefine(PomModelImpl::class.java, ClassFileLocator.ForInstrumentation.of(instrumentation, PomModelImpl::class.java))
//                        .defineConstructor(Visibility.PUBLIC)
//                        .intercept(MethodCall.invoke(UserDataHolderBase::class.java.getDeclaredConstructor()))
////                        .method(ElementMatchers.named("getModelAspect"))
////                        .intercept(FixedValue.nullValue())
////                        .method(ElementMatchers.named("runTransaction"))
////                        .intercept(StubMethod.INSTANCE)
//                        .make()
                    (expression.project as MockProject).registerService(PomModel::class.java,
                        PomModelImpl::class.java.getDeclaredConstructor().newInstance()
                    )
                }
            }


            //PomManager.getModel(expression.project)
            //FChat().log("pomModel: ${}")

            CoreApplicationEnvironment.registerExtensionPoint(Extensions.getRootArea(), TreeCopyHandler.EP_NAME, TreeCopyHandler::class.java)
            val log = KtPsiFactory(expression.project, true).createExpression("""Chat.log("test")""") as KtDotQualifiedExpression

//            org.jetbrains.kotlin.com.intellij.psi.impl.source.codeStyle.IndentHelper.getInstance()
//            org.jetbrains.kotlin.com.intellij.extapi.psi.ASTDelegatePsiElement

            //val log = JavaPsiFacade.getInstance(expression.project).elementFactory.createExpressionFromText("""log("test")""", null) as PsiElement
            FChat().log(it.parent.text + ": " + it.parent.javaClass)
            FChat().log("log: " + log.selectorExpression?.text + " -> " + log.selectorExpression?.javaClass)
            (it.parent as? KtDotQualifiedExpression)?.let {
                FChat().log("selector: " + it.selectorExpression?.text + " -> " + it.selectorExpression?.javaClass)
                log.selectorExpression?.let { it1 -> it.selectorExpression?.replace(it1) }
                //it.replace(log)
            }
            //it.parent.replace(log)
        }
        FChat().log("${expression?.javaClass} ${expression?.text}: ${type ?: "null"}")
    }
}

val matcher = ElementMatchers.named<MethodDescription>("recordType")

val mixinBindingTraceContext = Advice.to(MixinBindingTraceContext::class.java).on(matcher)

//RuntimeMixin.writeResult(context, MixinClientWorld::class.java)

RuntimeMixin.addMixin(BindingTraceContext::class.java, mixinBindingTraceContext)
RuntimeMixin.doMixin(BindingTraceContext::class.java)

//val MyPomModelImpl = ByteBuddy()
//    .with(TypeValidation.DISABLED)
//    .with(VisibilityBridgeStrategy.Default.NEVER)
//    .redefine(PomModelImpl::class.java, ClassFileLocator.ForInstrumentation.of(instrumentation, PomModelImpl::class.java))
//    .defineConstructor(Visibility.PUBLIC)
//    .intercept(MethodCall.invoke(UserDataHolderBase::class.java.getDeclaredConstructor()))
//    .make()
//instrumentation.redefineClasses(ClassDefinition(PomModelImpl::class.java, MyPomModelImpl.bytes))

//val originalBytes = RuntimeMixin.getOriginalByteCode(PomModelImpl::class.java)


(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    RuntimeMixin.removeMixin(BindingTraceContext::class.java, mixinBindingTraceContext)
    RuntimeMixin.doMixin(BindingTraceContext::class.java)
//    instrumentation.redefineClasses(ClassDefinition(PomModelImpl::class.java, originalBytes))
}

Chat.log("mixin finished")

//
//import org.jetbrains.kotlin.asJava.LightClassGenerationSupport
//import org.jetbrains.kotlin.com.intellij.openapi.util.Disposer
//import org.jetbrains.kotlin.com.intellij.psi.impl.PsiFileFactoryImpl
//import org.jetbrains.kotlin.com.intellij.psi.PsiFileFactory
//import org.jetbrains.kotlin.idea.KotlinLanguage
//import org.jetbrains.kotlin.idea.references.mainReference
//import org.jetbrains.kotlin.psi.*
//import org.jetbrains.kotlin.psi.psiUtil.getQualifiedElementSelector
//import org.jetbrains.kotlin.psi.stubs.elements.KtDotQualifiedExpressionElementType
//import org.jetbrains.kotlin.resolve.BindingContext
//import org.jetbrains.kotlin.resolve.DelegatingBindingTrace
//import org.jetbrains.kotlin.resolve.calls.util.getType
//import org.jetbrains.kotlin.scripting.compiler.plugin.impl.*
//import kotlin.script.experimental.api.ScriptCompilationConfiguration
//import kotlin.script.experimental.api.SourceCode
//import kotlin.script.experimental.host.withDefaultsFrom
//import kotlin.script.experimental.jvm.defaultJvmScriptingHostConfiguration
//import org.jetbrains.kotlin.scripting.resolve.ScriptLightVirtualFile
//import org.jetbrains.kotlin.scripting.scriptFileName
//import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull
//import kotlin.script.experimental.api.asSuccess
//import kotlin.script.experimental.host.FileBasedScriptSource
//import kotlin.script.experimental.host.getMergedScriptText
//import kotlin.script.experimental.host.toScriptSource
//import org.jetbrains.kotlin.scripting.compiler.plugin.impl.ScriptJvmCompilerIsolated
//import org.jetbrains.kotlin.scripting.compiler.plugin.impl.withMessageCollectorAndDisposable
//import org.jetbrains.kotlin.scripting.compiler.plugin.impl.ScriptDiagnosticsMessageCollector
//import org.jetbrains.kotlin.scripting.compiler.plugin.impl.failure
//import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull
//
//val hostConfiguration = defaultJvmScriptingHostConfiguration.withDefaultsFrom(defaultJvmScriptingHostConfiguration)
//val compilerProxy = ScriptJvmCompilerIsolated(hostConfiguration)
//val compConf = object : ScriptCompilationConfiguration({}) {}
//
//class MyKtVisitor<D> : KtTreeVisitor<D>() {
//    override fun visitCallExpression(expression: KtCallExpression, data: D): Void? {
//
//        (expression.parent as? KtDotQualifiedExpression)?.let {
//            Chat.log("visit Call: " + expression.text)
////            val generationSupport = LightClassGenerationSupport.getInstance(it.receiverExpression.project)
////            generationSupport.createConstantEvaluator(it.receiverExpression)
////
////            Chat.log(" receiver: " +  generationSupport.analyze(it.receiverExpression).getType(it.receiverExpression))
//            //Chat.log(it.receiverExpression)
//            (it.receiverExpression as? KtNameReferenceExpression)?.let {
//
//                Chat.log(" receiver: " +  it.getReferencedName())
//            }
//        }
//        return super.visitCallExpression(expression, data)
//    }
//}
//
//fun collectRefinedSourcesAndUpdateEnvironment() {
//
//}
//
//fun <T> getDisposable() = Disposer.newDisposable() as T
//fun compile(source: SourceCode) {
//    val messageCollector  = ScriptDiagnosticsMessageCollector(null)
//
//    val context = createIsolatedCompilationContext(compConf, hostConfiguration, messageCollector, getDisposable())
//
//    val psiFileFactory = PsiFileFactory.getInstance(context.environment.project) as PsiFileFactoryImpl
//
//    val scriptText = getMergedScriptText(source, compConf)
//    val virtualFile = ScriptLightVirtualFile(
//        source.scriptFileName(source, compConf),
//        (source as? FileBasedScriptSource)?.file?.path, // TODO: should be absolute path here
//        scriptText
//    )
//    val ktFile =
//        psiFileFactory.trySetupPsiForFile(virtualFile, KotlinLanguage.INSTANCE, true, false) as KtFile? ?: return
//
//
//
//    ktFile.accept(MyKtVisitor(), null)
//
//}
//Chat.log("start compile")
//compile(context.ctx.file!!.toScriptSource())
//Chat.log("compile finish")