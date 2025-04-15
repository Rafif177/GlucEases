plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-kapt") // 1
}

android {
    namespace = "com.example.glucease"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.glucease"
        minSdk = 24
        targetSdk = 34
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

    buildFeatures {
        compose = true; // 2
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0" //2
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation("androidx.activity:activity-compose:1.10.1") //(4)
    implementation("androidx.compose.material3:material3:1.3.1")
    implementation("androidx.compose.material3:material3-window-size-class:1.3.1")
    implementation("androidx.compose.material3:material3-adaptive-navigation-suite:1.4.0-alpha09")
    implementation("androidx.compose.ui:ui:1.7.8") //4
    implementation("androidx.compose.ui:ui-tooling-android:1.7.8") //4
    implementation("androidx.compose.material3:material3:1.3.1") //4
    implementation("androidx.compose.foundation:foundation-layout:1.7.8")
    implementation("androidx.compose.material:material-icons-extended:1.6.0")
    implementation ("androidx.navigation:navigation-compose:2.7.5")
    implementation("com.patrykandpatrick.vico:compose:1.13.0")
    implementation(libs.androidx.navigation.runtime.ktx)
    implementation(libs.androidx.espresso.core)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}