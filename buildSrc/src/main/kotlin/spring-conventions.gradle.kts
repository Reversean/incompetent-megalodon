import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
    `java-library`

    id("org.springframework.boot")
}

springBoot {
    buildInfo()
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(SpringBootPlugin.BOM_COORDINATES))

    modules {
        module("org.springframework.boot:spring-boot-starter-tomcat") {
            replacedBy("org.springframework.boot:spring-boot-starter-jetty")
        }
    }
}

pluginManager.withPlugin("kotlin-conventions") {
    logger.lifecycle("Applying Spring configuration for Kotlin")

    plugins {
        kotlin("plugin.spring")
        kotlin("plugin.jpa")
    }

    dependencies {
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    }
}
