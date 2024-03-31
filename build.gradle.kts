plugins {
    alias(libs.plugins.multiplatform).apply(false)
    alias(libs.plugins.android.library).apply(false)
    alias(libs.plugins.kotlinx.serialization).apply(false)
    alias(libs.plugins.dokka).apply(false)
    alias(libs.plugins.nmcp)
}

nmcp {
    publishAllProjectsProbablyBreakingProjectIsolation {
        username.set(
            try {
                System.getenv("sonatypeUsername")
            } catch (_: Exception) {
                findProperty("sonatypeUsername") as String
            }
        )
        password.set(
            try {
                System.getenv("sonatypePassword")
            } catch (_: Exception) {
                findProperty("sonatypePassword") as String
            }
        )
    }
}