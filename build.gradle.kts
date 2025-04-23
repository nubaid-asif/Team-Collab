// Top-level build file where you can add configuration options common to all sub-projects/modules.
val hiltVersion by extra("2.51.1")
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("com.google.dagger.hilt.android") version "2.51.1" apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()
        dependencies {
            classpath("com.google.gms:google-services:4.3.15") // Correct plugin version
            classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.0")
            classpath("com.google.dagger:hilt-android-gradle-plugin:2.51.1")
        }
    }
}