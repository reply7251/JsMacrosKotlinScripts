plugins {
    kotlin("jvm")
}

group = "me.hellrevenger"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "me.hellrevenger.MainKt"
    }
    // Includes runtime dependencies into a runnable Fat JAR
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}