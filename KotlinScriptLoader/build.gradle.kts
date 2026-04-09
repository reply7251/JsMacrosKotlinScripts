import java.net.URI

plugins {
    kotlin("jvm")
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
dependencies {
    testImplementation(kotlin("test"))
    jsmacrosExtensionInclude(kotlin("stdlib"))

    implementation(files("../scripts/libs/jars/jsmacrosce-1.21.11-fabric-2.0.0-2.0.0.jar"))
}


tasks.processResources {
    filesMatching("jsmacrosce.ext.KotlinScriptLoader.json") {
        expand(mapOf(
            "dependencies" to jsmacrosExtensionInclude.files.joinToString(" ") { it.name }
        ))
    }
}

tasks.compileKotlin {
    compilerOptions.freeCompilerArgs.addAll(
        "-Xno-call-assertions",
        "-Xno-param-assertions"
    )
}

tasks.jar {
    dependsOn(":ScriptDefs:jar")

    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from("../ScriptDefs/build/libs") {
        include("*.jar")
        into("META-INF")
    }

    from(jsmacrosExtensionInclude.files) {
        include("*")
        into("META-INF/jsmacrosdeps")
    }
}