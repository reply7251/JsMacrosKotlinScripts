import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.utils.extendsFrom

plugins {
    kotlin("jvm") version "2.4.10"
    id("net.fabricmc.fabric-loom") version "1.17-SNAPSHOT"
    id("maven-publish")
//    id("xyz.wagyourtail.jvmdowngrader") version "1.3.6"
}

version = project.property("mod_version") as String
group = project.property("maven_group") as String

base {
    archivesName.set(project.property("archives_base_name") as String)
}

val targetJavaVersion = 25
java {
    toolchain.languageVersion = JavaLanguageVersion.of(targetJavaVersion)
    // Loom will automatically attach sourcesJar to a RemapSourcesJar task and to the "build" task
    // if it is present.
    // If you remove this line, sources will not be generated.
    withSourcesJar()
}

//loom {
////    splitEnvironmentSourceSets()
//
//    mods {
//        register("jsmacroskotlinscript") {
//
//            sourceSet("main")
//            sourceSet("client")
//        }
//    }
//}


//fabricApi {
//    configureDataGeneration {
//        client = true
//    }
//}

repositories {
    // Add repositories to retrieve artifacts from in here.
    // You should only use this when depending on other mods because
    // Loom adds the essential maven repositories to download Minecraft and libraries from automatically.
    // See https://docs.gradle.org/current/userguide/declaring_repositories.html
    // for more information about repositories.
    exclusiveContent {
        forRepository {
            maven("https://api.modrinth.com/maven")
        }
        // forRepositories(fg.repository) // Uncomment when using ForgeGradle
        filter {
            includeGroup("maven.modrinth")
        }
    }
}

val jsmacrosExtensionInclude by configurations.creating {
    isCanBeResolved = true
    isCanBeConsumed = false
//    isTransitive = true
}
//
//jvmdg.downgradeTo = JavaVersion.VERSION_21
//
//val downgrade by configurations.creating {
////    extendsFrom(configurations.implementation.get())
//}
//val downgradeMc by configurations.creating {
////    extendsFrom(configurations.minecraft.get())
//}
//configurations {
//
//    implementation.extendsFrom(named("downgrade"))
//    minecraft.extendsFrom(named("downgradeMc"))
//}

//jvmdg.dg(downgrade) {
//    downgradeTo = JavaVersion.VERSION_21
//}
//jvmdg.dg(downgradeMc) {
//    downgradeTo = JavaVersion.VERSION_21
//}

//tasks.downgradeJar {
//    archiveFileName.set("JsMacrosKotlinScript-1.0-SNAPSHOT1.jar")
//}
//tasks.shadeDowngradedApi {
//    archiveFileName.set("JsMacrosKotlinScript-1.0-SNAPSHOT1.jar")
//}

dependencies {
    // To change the versions see the gradle.properties file
    minecraft("com.mojang:minecraft:${project.property("minecraft_version")}")
    implementation("net.fabricmc:fabric-loader:${project.property("loader_version")}")
    implementation("net.fabricmc:fabric-language-kotlin:${project.property("kotlin_loader_version")}")

    implementation("net.fabricmc.fabric-api:fabric-api:${project.property("fabric_version")}")

    // JsMacros-reloaded
    implementation("maven.modrinth:XcnNwheM:mZHcDq0j")
    implementation("org.joml:joml:+")

    listOf(
        "net.bytebuddy:byte-buddy:1.15.1",
        "net.bytebuddy:byte-buddy-agent:1.15.1",
        "net.lenni0451.classtransform:core:1.14.1",
        "net.lenni0451.classtransform:additionalclassprovider:1.14.1",
        "org.jetbrains.kotlin:kotlin-scripting-common",
        "org.jetbrains.kotlin:kotlin-scripting-jvm",
        "org.jetbrains.kotlin:kotlin-scripting-jvm-host",
        "org.jetbrains.kotlin:kotlin-compiler-embeddable",

        "org.jetbrains.kotlin:kotlin-reflect",
    ).forEach {
        implementation(it)
        includeInternal(it)
    }
    listOf(
        "org.ow2.asm",
        "org.objectweb.asm",
        "com.google.guava",
    ).forEach {
        configurations.includeInternal.get().exclude(it)
    }
}

tasks.processResources {
    inputs.property("version", project.version)
    inputs.property("minecraft_version", project.property("minecraft_version"))
    inputs.property("loader_version", project.property("loader_version"))
    filteringCharset = "UTF-8"

    filesMatching("fabric.mod.json") {
        expand("version" to project.version,
            "minecraft_version" to project.property("minecraft_version")!!,
            "loader_version" to project.property("loader_version")!!,
            "kotlin_loader_version" to project.property("kotlin_loader_version")!!)
    }
}

tasks.withType<JavaCompile>().configureEach {
    // ensure that the encoding is set to UTF-8, no matter what the system default is
    // this fixes some edge cases with special characters not displaying correctly
    // see http://yodaconditions.net/blog/fix-for-java-file-encoding-problems-with-gradle.html
    // If Javadoc is generated, this must be specified in that task too.
    options.encoding = "UTF-8"
    options.release.set(targetJavaVersion)
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions.jvmTarget.set(JvmTarget.fromTarget(targetJavaVersion.toString()))
}

tasks.processIncludeJars {

}

tasks.jar {

}

// configure the maven publication
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = project.property("archives_base_name") as String
            from(components["java"])
        }
    }

    // See https://docs.gradle.org/current/userguide/publishing_maven.html for information on how to set up publishing.
    repositories {
        // Add repositories to publish to here.
        // Notice: This block does NOT have the same function as the block in the top level.
        // The repositories here will be used for publishing your artifact, not for
        // retrieving dependencies.
    }
}
