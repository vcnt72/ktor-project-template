
plugins {
    `project-convention`
    id("org.flywaydb.flyway") version "9.4.0"
}

val ktor_version: String by project

dependencies {
    api("io.ktor:ktor-server-content-negotiation-jvm:$ktor_version")
    api("io.ktor:ktor-server-core-jvm:$ktor_version")
    api("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktor_version")
    api("io.ktor:ktor-server-call-logging-jvm:$ktor_version")
    api("io.ktor:ktor-server-call-id-jvm:$ktor_version")
    api("io.ktor:ktor-server-default-headers-jvm:$ktor_version")
    api("io.ktor:ktor-server-cors-jvm:$ktor_version")
    api("io.ktor:ktor-server-netty-jvm:$ktor_version")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")

}

val DB_USER = System.getenv("DB_USER")
val DB_PASSWORD = System.getenv("DB_PASSWORD")
val DB_HOST = System.getenv("DB_HOST")
val DB_PORT = System.getenv("DB_PORT")
val DB_NAME = System.getenv("DB_NAME")
val JDBC_DRIVER = System.getenv("JDBC_DRIVER")

flyway {
    url = "jdbc:$JDBC_DRIVER://$DB_HOST:$DB_PORT/$DB_NAME"
    user = DB_USER
    password = DB_PASSWORD
    locations = arrayOf(
        "filesystem:$rootDir/migrations"
    )
}