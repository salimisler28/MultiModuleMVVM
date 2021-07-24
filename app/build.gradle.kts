plugins {
    with(Plugins) {
        id("com.android.application")
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

        //buildConfigField "String", "BASE_URL", '"https://api.themoviedb.org/3/"'
        //buildConfigField "String", "API_KEY", '"4842ed0eaf02963b0c0e15ceebf1ff5d"'
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

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    with(Dependencies) {
        //Modules
        implementation(project(Modules.common))
        implementation(project(Modules.domain))
        implementation(project(Modules.data))

        implementation(kotlinStdlib)
        implementation(core)
        implementation(appCompat)
        implementation(materialDesign)
        implementation(junit)
        androidTestImplementation(junitExt)
        androidTestImplementation(espresso)
        implementation(fragmentKtx)

        // Hilt
        implementation(hilt)
        kapt(hiltCompiler)

        // Navigation
        implementation(navigation)
        implementation(navigationFragment)


        // Retrofit
        implementation(retrofit)
        implementation(convertorGson)
        implementation(okHtttp)
        implementation(retrofitCoroutineCallAdapter)

        // Timber
        implementation(timber)

        // Coil
        implementation(coil)
    }
}