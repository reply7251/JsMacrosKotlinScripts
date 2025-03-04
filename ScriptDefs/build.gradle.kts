
import java.net.URI

plugins {
    kotlin("jvm")
    id("xyz.wagyourtail.jvmdowngrader") version "1.2.2"
}

group = "me.hellrevenger"

repositories {
    mavenCentral()
    maven {
        name = "fabricmc repository"
        url = URI("https://maven.fabricmc.net/")
    }

    maven {
        name = "minecraft"
        url = URI("https://libraries.minecraft.net")
    }

    maven {
        name = "sponge powered"
        url = URI("https://repo.spongepowered.org/repository/maven-public/")
    }
}

val jsmacrosExtensionInclude by configurations.creating
val include by configurations.creating

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-scripting-common")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm-host")
    jsmacrosExtensionInclude("org.jetbrains.kotlin:kotlin-scripting-common")
    jsmacrosExtensionInclude("org.jetbrains.kotlin:kotlin-scripting-jvm")
    jsmacrosExtensionInclude("org.jetbrains.kotlin:kotlin-scripting-jvm-host")
    implementation("net.bytebuddy:byte-buddy:1.15.1")
    include("net.bytebuddy:byte-buddy:1.15.1")

    implementation("org.javassist:javassist:3.30.2-GA")

    implementation("com.mojang:brigadier:1.2.9")
    implementation("com.mojang:datafixerupper:8.0.16")
    implementation("com.mojang:authlib:6.0.54")
    implementation("com.mojang:blocklist:1.0.10")
    implementation("com.mojang:logging:1.2.7")
    implementation("com.mojang:patchy:2.2.10")
    implementation("com.mojang:text2speech:1.17.9")

    implementation("org.lwjgl:lwjgl:3.3.3")
    implementation("org.lwjgl:lwjgl-glfw:3.3.3")
    implementation("org.lwjgl:lwjgl-freetype:3.3.3")
    implementation("org.lwjgl:lwjgl-opengl:3.3.3")
    implementation("org.lwjgl:lwjgl-stb:3.3.3")
    implementation("org.joml:joml:1.10.5")
    implementation("io.netty:netty-codec:4.1.97.Final")
    implementation("io.netty:netty-common:4.1.97.Final")
    implementation("io.netty:netty-buffer:4.1.97.Final")
    implementation("org.apache.commons:commons-lang3:3.14.0")
    implementation("org.apache.logging.log4j:log4j-api:2.22.1")
    implementation("org.slf4j:slf4j-api:2.0.9")
    implementation("org.spongepowered:mixin:0.8.5")
    implementation("net.java.dev.jna:jna:5.6.0")
    implementation("org.ow2.asm:asm:9.7")

    implementation(files("../scripts/libs/jars/jsmacros-1.21-fabric-jvm17.jar"))
}

tasks.processResources {
    filesMatching("jsmacros.ext.kotlin.json") {
        expand(mapOf(
            "dependencies" to jsmacrosExtensionInclude.files.joinToString(" ") { it.name }
        ))
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    from(jsmacrosExtensionInclude.files) {
        include("*")
        into("META-INF/jsmacrosdeps")
    }

    from(include.files.map { if(it.isDirectory()) it else zipTree(it) }) {}

    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    archiveClassifier.set("Pure")
}

tasks.downgradeJar {
    archiveClassifier.set("Pure-downgraded")
}
tasks.shadeDowngradedApi {
    archiveClassifier.set("Pure-downgraded-shade")
}

jvmdg.downgradeTo = JavaVersion.VERSION_1_8
jvmdg.shadeInlining.set(true)
