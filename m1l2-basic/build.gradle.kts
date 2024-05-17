/** 1) plugins (убрали версию) */
plugins {
    kotlin("jvm")
    application
}

/** 2) точка входа */
application {
   mainClass.set("com.prosoft.Main.kt")
}

/** 3) group, version */
group = "com.prosoft"
version = "1.0-SNAPSHOT"

/** 4) repositories */
repositories {
    mavenCentral()
}

/** 5) dependencies */
dependencies {
    testImplementation(kotlin("test-junit"))
}

/** 6) jdkVersion */
kotlin {
    jvmToolchain(17)
}