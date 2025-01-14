import me.hellrevenger.generated.*
import xyz.wagyourtail.jsmacros.core.Core

Core.getInstance().contexts.forEach {
    it.closeContext()
}

