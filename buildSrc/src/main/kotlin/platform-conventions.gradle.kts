plugins {
    `java-library`
}

val privateRepoPath: String by project
val privateRepoUsername: String by project
val privateRepoPassword: String by project

repositories {
    mavenLocal()
    maven("$privateRepoPath/maven-releases") {
        credentials {
            username = privateRepoUsername
            password = privateRepoPassword
        }
    }
    maven("$privateRepoPath/maven-snapshots") {
        credentials {
            username = privateRepoUsername
            password = privateRepoPassword
        }
    }
}

dependencies {
    withLibrary("bom-platform") {
        implementation(platform(it))
    }
}

configurations.all {
    exclude("org.springframework.cloud", "spring-cloud-starter-circuitbreaker-resilience4j")
}
