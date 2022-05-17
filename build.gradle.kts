buildscript {
    val minVersion by extra(21)
    val targetSdk by extra(32)
    val compileSdk by extra(32)
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    dependencies {
        classpath("org.jetbrains.compose:compose-gradle-plugin:1.1.1")
        classpath("com.android.tools.build:gradle:7.2.0")
        classpath(kotlin("gradle-plugin", version = "1.6.10"))
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}