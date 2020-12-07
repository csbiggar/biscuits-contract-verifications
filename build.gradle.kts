plugins {
    kotlin("jvm") version "1.4.10"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val http4kBomVersion = "3.279.0"

val junitJupiterVersion = "5.3.1"
val junitJupiterEngineVersion = "5.5.1"
val assertJVersion = "3.13.2"
val pactJvmVersion = "4.0.10"
val logbackVersion = "1.2.3"

dependencies {
    implementation(kotlin("stdlib"))

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitJupiterEngineVersion")

    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitJupiterVersion")
    testImplementation("org.assertj:assertj-core:$assertJVersion")
    testImplementation ("au.com.dius:pact-jvm-provider-junit5:${pactJvmVersion}")
    testImplementation ("ch.qos.logback:logback-core:$logbackVersion")
    testImplementation ("ch.qos.logback:logback-classic:$logbackVersion")
}

tasks {
    named<Test>("test") {
        useJUnitPlatform()
        systemProperty("pact.verifier.publishResults", System.getProperty("pact.verifier.publishResults"))
    }
}