package ru.krindra.vknorthtypes.types.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param accessKey Access key for private stats
 * @param key Link key (characters after vk.cc/)
 * @param shortUrl Short link URL
 * @param timestamp Creation time in Unixtime
 * @param url Full URL
 * @param views Total views number
 */
@Serializable
data class UtilsLastShortenedLink (
    @SerialName("key") val key: String? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("views") val views: Int? = null,
    @SerialName("timestamp") val timestamp: Int? = null,
    @SerialName("short_url") val shortUrl: String? = null,
    @SerialName("access_key") val accessKey: String? = null,
)
