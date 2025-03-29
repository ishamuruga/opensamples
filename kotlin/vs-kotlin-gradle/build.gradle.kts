plugins {
    kotlin("jvm") version "2.1.10"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

application {
    mainClass = "org.example.Main" 
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}