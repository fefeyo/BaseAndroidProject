object Dep {

  object GradlePlugin {
    const val android = "com.android.tools.build:gradle:3.5.1"
    const val androidApt = "com.neenbedankt.gradle.plugins:android-apt:1.8"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    const val kotlinAllOpen = "org.jetbrains.kotlin:kotlin-allopen:${Kotlin.version}"
    const val kotlinNoArg = "org.jetbrains.kotlin:kotlin-noarg:${Kotlin.version}"
    const val realm = "io.realm:realm-gradle-plugin:6.0.1"
    const val ktlint = "org.jlleitschuh.gradle:ktlint-gradle:8.2.0"
    const val appDistribution = "com.google.firebase:firebase-appdistribution-gradle:1.2.0"
    const val easyLauncher = "com.akaita.android:easylauncher:1.3.1"
  }

  object Kotlin {
    const val version = "1.3.61"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
    const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$version"
    const val coroutinesVersion = "1.3.2"
    const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
    const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"

  }

  object AndroidX {
    const val appCompat = "androidx.appcompat:appcompat:1.1.0"
    const val cardView = "androidx.cardview:cardview:1.0.0"
    const val coreKtx = "androidx.core:core-ktx:1.1.0"
    const val legacySupport = "androidx.legacy:legacy-support-v13:1.0.0"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.0.0"
    const val design = "com.google.android.material:material:1.0.0"
    const val constraint = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val lifecycleVersion = "2.0.0"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:$lifecycleVersion"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:$lifecycleVersion"

    object Navigation {
      const val version = "2.2.0-rc03"
      const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
      const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
    }

  }

  object Glide {
    const val version = "4.10.0"
    const val core = "com.github.bumptech.glide:glide:$version"
    const val compiler = "com.github.bumptech.glide:compiler:$version"
  }

  object Dagger {
    const val version = "2.23"
    const val core = "com.google.dagger:dagger:$version"
    const val compiler = "com.google.dagger:dagger-compiler:$version"
    const val annotationJavax = "org.glassfish:javax.annotation:10.0-b28"
    const val android = "com.google.dagger:dagger-android:$version"
    const val androidSupport = "com.google.dagger:dagger-android-support:$version"
    const val androidProcessor = "com.google.dagger:dagger-android-processor:$version"
  }

  object PermissionDispathcer {
    const val version = "4.5.0"
    const val core = "org.permissionsdispatcher:permissionsdispatcher:$version"
    const val processor = "org.permissionsdispatcher:permissionsdispatcher-processor:$version"
  }

  object LicenseAdapter {
    const val core = "net.yslibrary.licenseadapter:licenseadapter:1.4.0"
  }

  object Retrofit {
    const val version = "2.2.0"
    const val core = "com.squareup.retrofit2:retrofit:$version"
    const val okhttpVersion = "3.10.0"
    const val okhttp = "com.squareup.okhttp3:okhttp:$okhttpVersion"
    const val okhttpInterceptor = "com.squareup.okhttp3:logging-interceptor:$okhttpVersion"
  }

  object Gson {
    const val core = "com.google.code.gson:gson:2.8.2"
    const val converter = "com.squareup.retrofit2:converter-gson:${Retrofit.version}"
  }

  object Card {
    const val core = "io.card:android-sdk:5.5.1"
  }

  object LeakCanary {
    const val version = "1.5.4"
    const val core = "com.squareup.leakcanary:leakcanary-android:$version"
    const val noOp = "com.squareup.leakcanary:leakcanary-android-no-op:$version"
  }

  object Hyperion {
    const val version = "0.9.27"
    val hyperionPlugins = listOf(
      "com.willowtreeapps.hyperion:hyperion-core:$version",
      "com.willowtreeapps.hyperion:hyperion-attr:$version",
      "com.willowtreeapps.hyperion:hyperion-measurement:$version",
      "com.willowtreeapps.hyperion:hyperion-disk:$version",
      "com.willowtreeapps.hyperion:hyperion-phoenix:$version",
      "com.willowtreeapps.hyperion:hyperion-crash:$version",
      "com.willowtreeapps.hyperion:hyperion-shared-preferences:$version",
      "com.willowtreeapps.hyperion:hyperion-timber:$version",
      "com.willowtreeapps.hyperion:hyperion-build-config:$version"
    )
  }

  object Test {
    const val espresso = "androidx.test.espresso:espresso-core:3.1.0"
    const val junit = "junit:junit:4.12"
    const val robolectric = "org.robolectric:robolectric:4.0.1"
    const val testRunner = "androidx.test:runner:1.1.0"
  }

}
