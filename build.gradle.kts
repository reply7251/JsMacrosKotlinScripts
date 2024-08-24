plugins {
    kotlin("jvm") version "1.7.10"
}

group = "me.hellrevenger"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
