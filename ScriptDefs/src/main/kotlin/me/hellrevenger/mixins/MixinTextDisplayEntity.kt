package me.hellrevenger.mixins

import me.hellrevenger.generated.DataTracker
import me.hellrevenger.generated.TrackedData
import me.hellrevenger.generated.get
import net.bytebuddy.asm.Advice
import net.bytebuddy.implementation.bytecode.assign.Assigner
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventNameChange

object MixinTextDisplayEntity {
    @JvmStatic
    @Advice.OnMethodEnter
    fun postSetText(
        @Advice.This thiz: net.minecraft.class_8113.class_8123?,
        @Advice.Argument(0) newName: net.minecraft.class_2561?,
        @Advice.FieldValue("field_42435", typing = Assigner.Typing.DYNAMIC) TEXT: TrackedData<net.minecraft.class_2561>?,
        @Advice.FieldValue("field_6011") dataTracker: DataTracker
    ) {
        TEXT?.let {
            val oldName = dataTracker.get(it)
            EventNameChange(thiz, oldName, newName).trigger()
        }
    }
}

