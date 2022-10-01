plugins {
    `project-convention`
}

val logback_version: String by project

dependencies {
    implementation("ch.qos.logback:logback-classic:$logback_version")
}
