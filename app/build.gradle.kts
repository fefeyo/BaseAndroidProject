import com.google.firebase.appdistribution.gradle.AppDistributionExtension
import org.jetbrains.kotlin.allopen.gradle.AllOpenExtension
import org.jetbrains.kotlin.noarg.gradle.NoArgExtension

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-allopen")
    id("kotlin-noarg")
    id("com.google.firebase.appdistribution")
}

configure<AllOpenExtension> {
  annotation("io.realm.annotations.RealmClass")
}

configure<NoArgExtension> {
  annotation("io.realm.annotations.RealmClass")
}

// AppDistribution配信設定
configure<AppDistributionExtension> {
  releaseNotes = "release notes"
  groups = "teamlab"
}

val VERSION_NAME = "1.0.0"
val PACKAGE_NAME = "com.fefeyo.baseandroidproject"
val VERSION_CODE = 1

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.2")

    signingConfigs {
        getByName("debug") {
            storeFile = file("$rootDir/app/keystore/debug.jks")
            storePassword = "debug123"
            keyAlias = "debug"
            keyPassword = "debug123"
        }

        create("release") {
            storeFile = file("$rootDir/app/keystore/debug.jks")
            storePassword = "debug123"
            keyAlias = "debug"
            keyPassword = "debug123"
        }
    }

    defaultConfig {
        applicationId = PACKAGE_NAME
        minSdkVersion(23)
        targetSdkVersion(29)
        versionCode = VERSION_CODE
        versionName = VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("debug") {
            isDebuggable = true
            applicationIdSuffix = ".debug"
            isTestCoverageEnabled = false
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
        getByName("release") {
            isShrinkResources = true
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                file("proguard-rules.pro"))
            signingConfig = signingConfigs.getByName("release")
        }
    }

    flavorDimensions("default")

    productFlavors {
        register("dev") {
            applicationId = "${PACKAGE_NAME}.dev"
        }
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
        getByName("test").java.srcDirs("src/test/kotlin")
    }

    dexOptions {
        javaMaxHeapSize = "2g"
    }

    dataBinding {
        isEnabled = true
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))

    implementation(Dep.Kotlin.stdlib)
    implementation(Dep.Kotlin.reflect)
    implementation(Dep.Kotlin.coroutineCore)
    implementation(Dep.Kotlin.coroutineAndroid)

    implementation(Dep.AndroidX.appCompat)
    implementation(Dep.AndroidX.cardView)
    implementation(Dep.AndroidX.coreKtx)
    implementation(Dep.AndroidX.legacySupport)
    implementation(Dep.AndroidX.recyclerView)
    implementation(Dep.AndroidX.design)
    implementation(Dep.AndroidX.constraint)

    implementation(Dep.PermissionDispathcer.core)
    kapt(Dep.PermissionDispathcer.processor)

    implementation(Dep.Glide.core)
    kapt(Dep.Glide.compiler)

    compileOnly(Dep.Dagger.annotationJavax)
    implementation(Dep.Dagger.core)
    kapt(Dep.Dagger.compiler)
    implementation(Dep.Dagger.android)
    implementation(Dep.Dagger.androidSupport)
    kapt(Dep.Dagger.androidProcessor)

    implementation(Dep.Retrofit.core)
    implementation(Dep.Retrofit.okhttp)
    implementation(Dep.Retrofit.okhttpInterceptor)

    implementation(Dep.Gson.core)
    implementation(Dep.Gson.converter)

    implementation(Dep.AndroidX.lifecycleExtensions)
    kapt(Dep.AndroidX.lifecycleCompiler)
    implementation(Dep.AndroidX.Navigation.fragmentKtx)
    implementation(Dep.AndroidX.Navigation.uiKtx)

    implementation(Dep.Card.core)
    implementation(Dep.LicenseAdapter.core)

    // for Debug
    debugImplementation(Dep.LeakCanary.core)
    releaseImplementation(Dep.LeakCanary.noOp)
    testImplementation(Dep.LeakCanary.noOp)

    Dep.Hyperion.hyperionPlugins.forEach {
        debugImplementation(it)
    }

    // for Test
    androidTestImplementation(Dep.Test.espresso) {
        exclude(group = "com.android.support", module = "support-annotations")
    }
    testImplementation(Dep.Test.junit)
    testImplementation(Dep.Test.robolectric)
    testImplementation(Dep.Test.testRunner)
}
