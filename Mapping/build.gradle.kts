import org.gradle.kotlin.dsl.support.kotlinCompilerOptions
import java.net.URI

plugins {
    kotlin("jvm")
    id("xyz.wagyourtail.jvmdowngrader") version "1.2.2"
}

group = "me.hellrevenger"
version = "1.0-SNAPSHOT"

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
}

dependencies {
    compileOnly(files("../scripts/libs/jars/int-jvm17-open.jar"))

    compileOnly("com.mojang:brigadier:1.2.9")
    compileOnly("com.mojang:datafixerupper:8.0.16")
    compileOnly("com.mojang:authlib:6.0.54")
    compileOnly("com.mojang:blocklist:1.0.10")
    compileOnly("com.mojang:logging:1.2.7")
    compileOnly("com.mojang:patchy:2.2.10")
    compileOnly("com.mojang:text2speech:1.17.9")

    compileOnly("org.lwjgl:lwjgl:3.3.3")
    compileOnly("org.lwjgl:lwjgl-glfw:3.3.3")
    compileOnly("org.lwjgl:lwjgl-freetype:3.3.3")
    compileOnly("org.lwjgl:lwjgl-opengl:3.3.3")
    compileOnly("org.lwjgl:lwjgl-stb:3.3.3")
    compileOnly("org.joml:joml:1.10.5")
    compileOnly("io.netty:netty-codec:4.1.97.Final")
    compileOnly("io.netty:netty-common:4.1.97.Final")
    compileOnly("io.netty:netty-buffer:4.1.97.Final")
    compileOnly("org.apache.commons:commons-lang3:3.14.0")
    compileOnly("org.apache.logging.log4j:log4j-api:2.22.1")
    compileOnly("org.slf4j:slf4j-api:2.0.9")
}

tasks.compileKotlin {
    compilerOptions.suppressWarnings.set(true)
}

tasks.test {
    useJUnitPlatform()
}

jvmdg.downgradeTo = JavaVersion.VERSION_1_8