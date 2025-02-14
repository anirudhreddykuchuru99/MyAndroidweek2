plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.action.myandroidweek2"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.action.myandroidweek2"
        minSdk = 25
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    // add compose build feature

    buildFeatures {
        compose = true // Enable Jetpack Compose
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

    // add compose compiler version
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14" // Use a version compatible with Kotlin 1.9.24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // Compose UI
    implementation("androidx.compose.ui:ui:1.6.0")
    implementation("androidx.compose.material3:material3:1.1.2")
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.0")

    // Lifecycle - ViewModel & LiveData
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.2")

    // Compose Activity (Needed for setContent in ComponentActivity)
    implementation("androidx.activity:activity-compose:1.8.2")

    // Coil for Image Loading
    implementation("io.coil-kt:coil-compose:2.5.0")

    // Coroutine & StateFlow (for ViewModel)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
}