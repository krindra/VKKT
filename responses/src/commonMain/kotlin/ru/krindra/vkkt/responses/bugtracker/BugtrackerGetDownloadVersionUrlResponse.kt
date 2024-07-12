package ru.krindra.vkkt.responses.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.bugtracker.*

/**
 * @param url 
 * @param appTitle 
 * @param bundleName 
 * @param buildId 
 * @param buildTitle 
 */
@Serializable
data class BugtrackerGetDownloadVersionUrlResponse (
    @SerialName("url") val url: String,
    @SerialName("build_id") val buildId: Long? = null,
    @SerialName("app_title") val appTitle: String? = null,
    @SerialName("build_title") val buildTitle: String? = null,
    @SerialName("bundle_name") val bundleName: String? = null,
)

