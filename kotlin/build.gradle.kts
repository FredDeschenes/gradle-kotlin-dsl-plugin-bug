import netflix.nebula.NebulaKotlinPlugin
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("nebula.kotlin") version "1.2.41" apply false
    // I can't not set this otherwise I get errors for every Java/Application related plugin stuff in the
    // 'subproject' block below
    application
}

subprojects {
    apply<NebulaKotlinPlugin>()
    apply<ApplicationPlugin>()

    project.group = "com.thegroup"
    project.version = "1.0-SNAPSHOT"

    java {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    application {
        applicationDefaultJvmArgs += listOf(
                "-server"
        )
    }

    repositories {
        mavenCentral()
    }

    // Other irrelevant common stuff

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}
