import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Provider

abstract class MyPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val x: Provider<String?> = project.provider { null }
        val y: Provider<String?> = x.map { null }
    }
}
