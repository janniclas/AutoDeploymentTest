plugins {
    id("spha-kotlin-conventions")
    alias(libs.plugins.serialization)
}



group = "de.fraunhofer.iem.kpiCalculator"

dependencies {
    implementation(libs.kotlin.serialization.json)
}

tasks.test {
    useJUnitPlatform()
}
