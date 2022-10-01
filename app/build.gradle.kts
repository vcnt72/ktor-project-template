plugins {
    application
    id("io.ktor.plugin") version "2.1.2"

    `project-convention`
}


application {
    mainClass.set("com.lazydev.app.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

dependencies {
    implementation(project(":adapter"))
}