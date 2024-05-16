/** 1) plugins (заменили версию на "apply false") */
plugins {
    kotlin("jvm") apply false
}

/** 2) group и version */
group = "com.prosoft"
version = "1.0-SNAPSHOT"

/** 3) repositories */
allprojects {
    repositories {
        mavenCentral()
    }
}

/** 4) subprojects */
subprojects {
    group = rootProject.group
    version = rootProject.version
}
