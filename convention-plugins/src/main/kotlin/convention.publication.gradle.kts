//Publishing your Kotlin Multiplatform library to Maven Central
//https://dev.to/kotlin/how-to-build-and-publish-a-kotlin-multiplatform-library-going-public-4a8k

import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.`maven-publish`
import org.gradle.kotlin.dsl.signing
import java.util.*

plugins {
    id("maven-publish")
    id("signing")
}

publishing {
    // Configure all publications
    publications.withType<MavenPublication> {
        // Provide artifacts information requited by Maven Central
        pom {
            name.set("VkNorthTypes")
            description.set("Types for VK API")
            url.set("https://github.com/krindra/VkNorthTypes")

            licenses {
                license {
                    name.set("MIT")
                    url.set("https://opensource.org/licenses/MIT")
                }
            }
            developers {
                developer {
                    id.set("Krindra")
                    name.set("Andrey Kerensky")
                    email.set("kerensky.git@gmail.com")
                }
            }
            scm {
                url.set("https://github.com/krindra/VkNorthTypes")
            }
        }
    }
}

signing {
    useGpgCmd()
    sign(publishing.publications)
}

//https://github.com/gradle/gradle/issues/26132
val signingTasks = tasks.withType<Sign>()
tasks.withType<AbstractPublishToMaven>().configureEach {
    mustRunAfter(signingTasks)
}