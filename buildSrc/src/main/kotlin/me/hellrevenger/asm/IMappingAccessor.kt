package me.hellrevenger.asm

interface IMappingAccessor {
    fun accessClass(src: String?, dst: String?)

    fun accessField(src: Member, dst: String?)

    fun accessMethod(src: Member, dst: String?)

    fun accessMethodArg(src: Member, index: Int, dst: String?)

    open class Member(val owner: String?, val name: String?, val desc: String?)
}