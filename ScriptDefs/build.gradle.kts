
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.net.URI

plugins {
    kotlin("jvm") version "1.7.10"
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
}

val jsmacrosExtensionInclude by configurations.creating

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-scripting-common")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm-host")
    implementation("org.jetbrains.kotlin:kotlin-scripting-dependencies")
    implementation("org.jetbrains.kotlin:kotlin-scripting-dependencies-maven")
    implementation("org.jetbrains.kotlin:kotlin-scripting-compiler")
    jsmacrosExtensionInclude("org.jetbrains.kotlin:kotlin-scripting-common")
    jsmacrosExtensionInclude("org.jetbrains.kotlin:kotlin-scripting-jvm")
    jsmacrosExtensionInclude("org.jetbrains.kotlin:kotlin-scripting-jvm-host")

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
    //implementation("org.lwjgl:lwjgl-natives-windows:3.3.3")
    //implementation("org.lwjgl:lwjgl-openal-natives-windows:3.3.3")
    //implementation("org.lwjgl:lwjgl-opengl-natives-windows:3.3.3")
    implementation("org.lwjgl:lwjgl-opengl:3.3.3")
    implementation("org.lwjgl:lwjgl-stb:3.3.3")
    implementation("org.joml:joml:1.10.5")
    implementation("io.netty:netty-codec:4.1.97.Final")
    implementation("io.netty:netty-common:4.1.97.Final")
    implementation("io.netty:netty-buffer:4.1.97.Final")
    implementation("org.apache.commons:commons-lang3:3.14.0")
    implementation("org.apache.logging.log4j:log4j-api:2.22.1")
    implementation("org.slf4j:slf4j-api:2.0.9")

    implementation("net.fabricmc.fabric-api:fabric-api:0.100.4+1.21")
    implementation(files("../scripts/libs/jars/jsmacros-1.21-fabric-jvm17.jar"))
    //implementation(files("../scripts/libs/jars/jsmacros-kotlin-1.0.0.jar"))
    implementation(files("../scripts/libs/jars/int-jvm17-open.jar"))
    //implementation(files("../scripts/libs/jars/int-jvm17.jar"))
    //implementation(files("../scripts/libs/jars/noObf-jvm17.jar"))
    implementation(files("../scripts/libs/jars/wynntils-1.0.12-fabric+MC-1.20.2.jar"))
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

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

kotlin {
    jvmToolchain {
        this.languageVersion = JavaLanguageVersion.of(17)
    }
}

tasks.jar {
    from(jsmacrosExtensionInclude.files) {
        include("*")
        into("META-INF/jsmacrosdeps")
    }
}

