

plugins {
    kotlin("jvm") version "2.4.10"
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