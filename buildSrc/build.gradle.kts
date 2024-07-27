

plugins {
    kotlin("jvm") version "2.0.0"
}

group = "me.hellrevenger"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(gradleApi())
    implementation("org.ow2.asm:asm:9.7")
    implementation("net.fabricmc:mapping-io:0.5.0")
}

tasks.test {
    useJUnitPlatform()
}