import java.net.URI

plugins {
    kotlin("jvm")
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
    testImplementation(kotlin("test"))

    implementation(files("../scripts/libs/jars/int-jvm17-open.jar"))

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
}

tasks.test {
    useJUnitPlatform()
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
}