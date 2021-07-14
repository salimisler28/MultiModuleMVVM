plugins {
    with(Plugins) {
        id(androidLibrary)
        id(kotlinAndroid)
        id(daggerHilt)
        id(kotlinKapt)
    }
}

android {
    compileSdkVersion(Settings.compileSdkVersion)
    buildToolsVersion(Settings.buildToolsVersion)

    defaultConfig {
        minSdkVersion(Settings.minSdkVersion)
        targetSdkVersion(Settings.targetSdkVersion)
        versionCode(Settings.versionCode)
        versionName(Settings.versionName)

        // testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
        //consumerProguardFiles "consumer-rules.pro"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    with(Dependencies) {
        //Modules
        implementation(project(Modules.common))
        implementation(project(Modules.data))

        implementation(kotlinStdlib)
        implementation(core)
        testImplementation(junit)
        androidTestImplementation(junitExt)
        androidTestImplementation(espresso)


        // Hilt
        implementation(hilt)
        kapt(hiltCompiler)

        //Coroutines
        implementation(coroutines)

        //Paging
        implementation(paging)
    }
}