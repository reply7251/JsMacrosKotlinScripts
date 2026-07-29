package me.hellrevenger.jsmacroskotlinscript.script.library.api



/**
 * Put @file:ImportJar(...) on the top of file.
 *
 * Only for IDE, still needs to add to classpath at runtime
 */
@Target(AnnotationTarget.FILE)
annotation class ImportJar(vararg val path: String)
@Target(AnnotationTarget.FILE)
annotation class Import(vararg val path: String)
@Target(AnnotationTarget.FILE)
annotation class ClassPath(vararg val path: String)