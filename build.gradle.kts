// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath(Dep.GradlePlugin.android)
        classpath(Dep.GradlePlugin.androidApt)
        classpath(Dep.GradlePlugin.kotlin)
        classpath(Dep.GradlePlugin.kotlinAllOpen)
        classpath(Dep.GradlePlugin.kotlinNoArg)
        classpath(Dep.GradlePlugin.realm)
        classpath(Dep.GradlePlugin.appDistribution)
        classpath(Dep.GradlePlugin.easyLauncher)
        classpath(Dep.GradlePlugin.ktlint)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}
