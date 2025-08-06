package me.hellrevenger.mixins

import net.bytebuddy.asm.Advice
import net.bytebuddy.implementation.bytecode.assign.Assigner
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventNameChange
import net.minecraft.class_8113
import net.minecraft.class_2561
import net.minecraft.class_2940
import net.minecraft.class_2945

object MixinTextDisplayEntity {
    @JvmStatic
    @Advice.OnMethodEnter
    fun postSetText(
        @Advice.This thiz: class_8113.class_8123?,
        @Advice.Argument(0) newName: class_2561?,
        @Advice.FieldValue("field_42435", typing = Assigner.Typing.DYNAMIC) TEXT: class_2940<class_2561>?,
        @Advice.FieldValue("field_6011") dataTracker: class_2945
    ) {
        TEXT?.let {
            val oldName = dataTracker.method_12789(it)
            EventNameChange(thiz, oldName, newName).trigger()
        }
    }
}

