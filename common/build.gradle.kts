plugins {
    with(Plugins) {
        id(androidLibrary)
        id(kotlinAndroid)
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
}

dependencies {
    with(Dependencies) {
        implementation(kotlinStdlib)
        implementation(core)
        implementation(junit)
        androidTestImplementation(junitExt)
        androidTestImplementation(espresso)
    }
}