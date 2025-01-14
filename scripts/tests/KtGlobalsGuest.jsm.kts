import me.hellrevenger.library.api.KtGlobals

KtGlobals.getCallable<() -> Unit>("test")?.invoke()