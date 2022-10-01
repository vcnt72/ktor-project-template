plugins {
    `kotlin-dsl`
}

val package_group: String by project
val package_version: String by project

repositories {
    mavenCentral()
}

val kotlin_version: String by project


group = package_group
version = package_version


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
}