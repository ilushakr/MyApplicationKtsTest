plugins {
    id("org.jetbrains.kotlin.jvm")
    `maven-publish`
}

//java {
//    sourceCompatibility = JavaVersion.VERSION_1_7
//    targetCompatibility = JavaVersion.VERSION_1_7
//}

//publishing {
//    publications {
//        create<MavenPublication>("test-lib") {
//            from(components["java"])
//            artifactId = "test-library"
//            groupId = "com.github.ilushakr"
//            version = "1.0"
//        }
//    }
//}


publishing {
//    repositories {
//        maven {
//            // change to point to your repo, e.g. http://my.org/repo
//            url = uri("$buildDir/repo")
//        }
//    }
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
            artifactId = "test-library"
            groupId = "com.github.ilushakr"
            version = "1.0"
        }
    }
}