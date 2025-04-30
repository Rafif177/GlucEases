plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.uijp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.uijp"
        minSdk = 24
        targetSdk = 35
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

    dependencies {
        // Core Android
        implementation("androidx.core:core-ktx:1.12.0")
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
        implementation("androidx.activity:activity-compose:1.8.2")
        implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")


        // Compose BOM (Bill of Materials)
        implementation(platform("androidx.compose:compose-bom:2024.03.00"))
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-tooling-preview")
        implementation("androidx.compose.foundation:foundation-layout")
        implementation("androidx.compose.material:material") // Material 2 (untuk IconButton, dsb)
        implementation("androidx.compose.material:material-icons-extended")
        implementation("androidx.navigation:navigation-compose:2.7.5")
        implementation("androidx.compose.ui:ui-text-google-fonts")

        // Optional: Material 3 (kompatibel dipakai berdampingan)
        implementation("androidx.compose.material3:material3:1.2.1")
        implementation("androidx.compose.material3:material3-window-size-class:1.1.0")

        // Charting library (jika dipakai)
        implementation("com.patrykandpatrick.vico:compose:1.13.0")

        // Preview & Debug
        debugImplementation("androidx.compose.ui:ui-tooling")
        debugImplementation("androidx.compose.ui:ui-test-manifest")

        // Testing
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    }




}