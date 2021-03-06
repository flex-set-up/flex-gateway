object Dependencies {
    const val KTLINT = "com.pinterest:ktlint:${DependencyVersions.KTLINT_VERSION}"
    const val SPRING_VALIDATION = "org.springframework.boot:spring-boot-starter-validation"
    const val SECURITY_JWT = "com.nimbusds:nimbus-jose-jwt:${DependencyVersions.NIMBUS_VERSION}"
    const val WEBFLUX = "org.springframework.boot:spring-boot-starter-webflux"
    const val KOTLIN_JACKSON = "com.fasterxml.jackson.module:jackson-module-kotlin"
    const val COROUTINE_REACTOR_EXTENSION = "io.projectreactor.kotlin:reactor-kotlin-extensions"
    const val COROUTINE_REACTOR = "org.jetbrains.kotlinx:kotlinx-coroutines-reactor"
    const val CIRCUIT_BREAKER = "org.springframework.cloud:spring-cloud-starter-circuitbreaker-reactor-resilience4j"
    const val SPRING_CLOUD_GATEWAY = "org.springframework.cloud:spring-cloud-starter-gateway"
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect"
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val SPRING_BOOT_TEST = "org.springframework.boot:spring-boot-starter-test"
    const val ACTUATOR = "org.springframework.boot:spring-boot-starter-actuator"
    const val ANNOTATION_PROCESSOR = "org.springframework.boot:spring-boot-configuration-processor"
    const val MICROMETER = "io.micrometer:micrometer-registry-prometheus"
    const val HTTP_CLIENT = "org.apache.httpcomponents:httpclient:${DependencyVersions.HTTP_CLIENT_VERSION}"
}
