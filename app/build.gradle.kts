import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "com.droidcba.kedditbysteps"
        minSdkVersion(16)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    testOptions {
        unitTests.apply {
            isReturnDefaultValues = true
        }
    }
    packagingOptions.exclude("META-INF/main.kotlin_module")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.3.0")
    implementation(kotlin("stdlib-jdk8", KotlinCompilerVersion.VERSION))

    // Picasso
    implementation("com.squareup.picasso:picasso:2.71828")

    // LiveData and ViewModel
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.4.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.0.0")

    // Dagger 2
    implementation("com.google.dagger:dagger:2.28.3")
    kapt("com.google.dagger:dagger-compiler:2.11")
    compileOnly("org.glassfish:javax.annotation:10.0-b28")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.0.0")


    // Coroutines - Retrofit extention
    //implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:1.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.0.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2")

    // Tests
    testImplementation("junit:junit:4.13.2")
    testImplementation("io.mockk:mockk:1.8.7")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.8")
    testImplementation("androidx.arch.core:core-testing:2.1.0")
    testImplementation(kotlin("stdlib-jdk8", KotlinCompilerVersion.VERSION))
}

repositories {
    mavenCentral()
    maven("http://repository.jetbrains.com/all")
}
