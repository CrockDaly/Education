plugins {
    application
    id("io.freefair.lombok") version "8.11"
    id("com.github.ben-manes.versions") version "0.51.0"

}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.36")
    annotationProcessor("org.projectlombok:lombok:1.18.36")
    implementation("com.google.guava:guava:33.4.0-jre")
    implementation("org.apache.commons:commons-collections4:4.5.0-M3")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("5.10.3")
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    mainClass.set("edu.exercise.App")
}

tasks.withType<JavaCompile> {
    options.annotationProcessorPath = configurations.annotationProcessor.get()
}
