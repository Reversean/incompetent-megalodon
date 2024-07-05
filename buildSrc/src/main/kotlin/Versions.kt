import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

private val Project.libs
    get() = extensions.getByType<VersionCatalogsExtension>()
        .named("libs")

fun Project.library(alias: String) = libs.findLibrary(alias).get()

fun Project.plugin(alias: String) = libs.findPlugin(alias).get()
