plugins {
    // This will allow the conventions in buildSrc/src/main to be loaded
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30")

    // Dependencies to support Jib conventions
    implementation("gradle.plugin.com.google.cloud.tools:jib-gradle-plugin:3.1.4")
    implementation("com.google.cloud.tools:jib-spring-boot-extension-gradle:0.1.0")
}