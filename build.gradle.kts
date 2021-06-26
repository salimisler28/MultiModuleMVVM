buildscript {
    val kotlin_version by extra("1.4.32")
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Classpaths.gradle)
        classpath(Classpaths.gradlePlugin)
        // Hilt
        classpath(Classpaths.hiltPlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")

    }
}

allprojects {
    repositories {
        google()
        jcenter()

        mavenCentral()
        maven {
            setUrl("https://jitpack.io")
        }
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}