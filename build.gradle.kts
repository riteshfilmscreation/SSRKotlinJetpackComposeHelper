// build.gradle.kts Module App Level

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.google.gms.google.services)
    alias(libs.plugins.google.firebase.crashlytics)
}

android {
    namespace = "com.ssritesh.hellossritesh"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.ssritesh.hellossritesh"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    // All Firebase Dependencies
    implementation(libs.firebase.bom) // BOM
    implementation(libs.google.play.services.ads) // Admob
    implementation(libs.firebase.ai) // Ai Logic
    implementation(libs.google.firebase.analytics) // Analytics
    implementation(libs.google.firebase.appcheck) // App Check
    implementation(libs.com.google.firebase.firebase.appcheck.debug) // App Check Debug
    implementation(libs.com.google.firebase.firebase.appcheck.playintegrity) // App Check Play Integrity
    implementation(libs.firebase.appdistribution) // App Distribution
    implementation(libs.firebase.appdistribution.api) // App Distribution API
    implementation(libs.firebase.appdistribution.gradle) // App Distribution Gradle
    implementation(libs.google.firebase.auth) // Auth
    implementation(libs.google.firebase.firestore) // Cloud Firestore
    implementation(libs.firebase.functions) // Cloud Functions
    implementation(libs.google.firebase.messaging) // Cloud Messaging
    implementation(libs.firebase.storage) // Cloud Storage
    implementation(libs.google.firebase.crashlytics) // Crashlytics
    implementation(libs.firebase.crashlytics.ndk) // Crashlytics NDK
    implementation(libs.firebase.crashlytics.gradle) // Crashlytics Gradle
    implementation(libs.firebase.dataconnect) // Data Connect
    implementation(libs.firebase.dynamic.module.support) // Dynamic Module Support
    implementation(libs.firebase.dynamic.links) // Dynamic Links
    implementation(libs.firebase.inappmessaging) // In-App Messaging
    implementation(libs.firebase.inappmessaging.display) // In-App Messaging Display
    implementation(libs.firebase.installations) // Installations
    implementation(libs.firebase.ml.modeldownloader) // ML Model Downloader
    implementation(libs.firebase.perf) // Performance
    implementation(libs.perf.plugin) // Performance Plugin
    implementation(libs.firebase.database) // Realtime Database
    implementation(libs.firebase.config) // Remote Config
    implementation(libs.google.services) // Google Services

    // Test and Debug Implementation
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}
