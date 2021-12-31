plugins {
    id("kotlin-conventions")
    id("jib-conventions")
}

jib.container.mainClass = "com.marffm.postsapi.PostsApiApplication"

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")
    implementation("org.springframework.boot:spring-boot-starter-rsocket:2.6.2")
    implementation("org.springframework.boot:spring-boot-starter-webflux:2.6.1")

    testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.1")
    testImplementation("io.projectreactor:reactor-test:3.4.13")
}