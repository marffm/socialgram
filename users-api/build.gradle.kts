plugins {
	id("kotlin-conventions")
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-webflux:2.6.1")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")

	testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.1")
	testImplementation("io.projectreactor:reactor-test:3.4.13")
}