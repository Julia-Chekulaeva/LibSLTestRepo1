plugins {
    kotlin("jvm") version "1.9.23"
    `maven-publish`
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.yaml:snakeyaml:2.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}

publishing {
    publications {
        create<MavenPublication>(name) {
            from(components["java"])
        }
    }
}