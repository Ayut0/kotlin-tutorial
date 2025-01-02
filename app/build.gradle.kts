/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.12/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    alias(libs.plugins.kotlin.jvm)

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use the Kotlin JUnit 5 integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    // Use the JUnit 5 integration.
    testImplementation(libs.junit.jupiter.engine)

    testImplementation(kotlin("test"))

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation(libs.guava)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Define the main class for the application.
    mainClass = "org.example.AppKt"
}

tasks.test{
    useJUnitPlatform()
}

tasks.register<JavaExec>("runFizzBuzz") {
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("fizzbuzz.MainKt")
}

tasks.register<JavaExec>("runCollections") {
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("collections.MainKt")
}

tasks.register<JavaExec>("runException") {
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("exception.MainKt")
}

tasks.register<JavaExec>("runClassDemo") {
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("classDemo.MainKt")
}

tasks.register<JavaExec>("runColorGenerator") {
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("colorgenerator.MainKt")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
