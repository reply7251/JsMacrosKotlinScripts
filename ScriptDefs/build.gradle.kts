
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
val include by configurations.creating

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-scripting-common")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm-host")
    implementation("org.jetbrains.kotlin:kotlin-scripting-dependencies")
    implementation("org.jetbrains.kotlin:kotlin-scripting-dependencies-maven")
    implementation("org.jetbrains.kotlin:kotlin-scripting-compiler")

    implementation("org.joml:joml:1.10.5")
    implementation("net.fabricmc.fabric-api:fabric-api:0.100.4+1.21")

    implementation(files("../scripts/libs/jars/jsmacros-1.21-fabric-jvm17.jar"))
    implementation(files("../scripts/libs/jars/int-jvm17-open.jar"))
    implementation(files("../scripts/libs/jars/Mapping-1.0-SNAPSHOT.jar"))

    jsmacrosExtensionInclude("org.jetbrains.kotlin:kotlin-scripting-common")
    jsmacrosExtensionInclude("org.jetbrains.kotlin:kotlin-scripting-jvm")
    jsmacrosExtensionInclude("org.jetbrains.kotlin:kotlin-scripting-jvm-host")
    include(files("../scripts/libs/jars/Mapping-1.0-SNAPSHOT.jar"))
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

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.jar {
    from(jsmacrosExtensionInclude.files) {
        include("*")
        into("META-INF/jsmacrosdeps")
    }

    from(include.files.map { if(it.isDirectory()) it else zipTree(it) }) {}
}
