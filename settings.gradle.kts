/** В корневом settings.gradle.kts необходимо соблюдать следующую очередность (как здесь) */

/** 1) имя проекта */
rootProject.name = "kotlin-demo"

/** 2) раздел pluginManagement, где settings - ссылка на файл gradle.properties в котором прописана kotlinVersion */
pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
    }
}

/** 3) раздел plugins */
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

/** 4) include */
include("m1l1-first")
include("m1l2-basic")