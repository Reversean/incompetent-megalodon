import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.getByType

private val Project.libs
    get() = extensions.getByType<VersionCatalogsExtension>()
        .named("libs")

fun Project.withLibrary(
    alias: String,
    action: (Provider<MinimalExternalModuleDependency>) -> Unit
) = libs.findLibrary(alias)
    .ifPresentOrElse(action) {
        logger.error("Version catalog resolution error: library `$alias` not found")
    }
