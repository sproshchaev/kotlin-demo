/** 1) plugins (убрали версию) */
plugins {
    kotlin("jvm")
}

/** 2) group, version */
group = "com.prosoft"
version = "1.0-SNAPSHOT"

/** 3) repositories */
repositories {
    mavenCentral()
}

/** 4) dependencies */
dependencies {
    testImplementation(kotlin("test-junit"))
}

/** 5) jdkVersion */
kotlin {
    jvmToolchain(17)
}