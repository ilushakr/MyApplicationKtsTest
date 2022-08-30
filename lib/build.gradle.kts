plugins {
    id("org.jetbrains.kotlin.jvm")
    `maven-publish`
}

//java {
//    sourceCompatibility = JavaVersion.VERSION_1_7
//    targetCompatibility = JavaVersion.VERSION_1_7
//}

publishing {
    publications {
        create<MavenPublication>("test-lib") {
            from(components["java"])
            artifactId = "test-library"
            groupId = "com.github.ilushakr"
            version = "1.0.0"
        }
    }
}
