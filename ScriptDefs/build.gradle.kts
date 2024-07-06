import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
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
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-scripting-common")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm-host")
    implementation("org.jetbrains.kotlin:kotlin-scripting-dependencies")
    implementation("org.jetbrains.kotlin:kotlin-scripting-dependencies-maven")
    implementation("org.jetbrains.kotlin:kotlin-scripting-compiler")

    implementation("net.fabricmc.fabric-api:fabric-api:0.100.4+1.21")
    implementation(files("../scripts/libs/jars/jsmacros-1.21-fabric-jvm17.jar"))
    implementation(files("../scripts/libs/jars/int-jvm17.jar"))
    implementation(files("../scripts/libs/jars/noObf-jvm17.jar"))
    implementation(files("../scripts/libs/jars/wynntils-1.0.12-fabric+MC-1.20.2.jar"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_17)
    }
}

kotlin {
    jvmToolchain(17)
}