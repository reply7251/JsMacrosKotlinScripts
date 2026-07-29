pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/")
        maven("https://api.modrinth.com/maven")
        maven("https://maven.wagyourtail.xyz/releases")
        maven("https://maven.wagyourtail.xyz/snapshots")
        maven("https://libraries.minecraft.net/")
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "JSMScripts"

include("core")
include("symlink")