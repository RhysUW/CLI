plugins {
    id("java")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("info.picocli:picocli:4.7.6")
    annotationProcessor("info.picocli:picocli-codegen:4.7.4")
}

application {
    mainClass.set("org.example.Main")
}

tasks.register("hello", JavaExec::class) {
    group = "application"
    description = "Runs the CLI to greet the company"
    mainClass.set("org.example.Main")
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.test {
    useJUnitPlatform()
}