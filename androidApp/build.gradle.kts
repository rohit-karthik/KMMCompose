plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "com.example.composekmm.android"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildFeatures {
        // Enables Jetpack Compose for this module
        compose = true
    }

    // Set both the Java and Kotlin compilers to target Java 8.
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0-alpha08"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")

    // Integration with activities
    implementation("androidx.activity:activity-compose:1.4.0")
    // Compose Material Design
    implementation("androidx.compose.material:material:1.2.0-alpha08")
    // Animations
    implementation("androidx.compose.animation:animation:1.2.0-alpha08")
    // Integration with ViewModels
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.4.1")
    implementation("androidx.compose.ui:ui-tooling-preview:${rootProject.extra["compose_version"]}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    // UI Tests
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha08")

    implementation("androidx.compose.ui:ui:1.2.0-alpha08")
    // Tooling support (Previews, etc.)
    implementation("androidx.compose.ui:ui-tooling:1.2.0-alpha08")
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation("androidx.compose.foundation:foundation:1.2.0-alpha08")
    // Material Design
    implementation("androidx.compose.material:material:1.2.0-alpha08")
    // Material design icons
    implementation("androidx.compose.material:material-icons-core:1.2.0-alpha08")
    implementation("androidx.compose.material:material-icons-extended:1.2.0-alpha08")
    // Integration with observables
    implementation("androidx.compose.runtime:runtime-livedata:1.2.0-alpha08")
    implementation("androidx.compose.runtime:runtime-rxjava2:1.2.0-alpha08")

}