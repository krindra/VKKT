package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param urlFullMatch 
 * @param eventFullMatch 
 * @param urlSubstringsMatch 
 * @param eventSubstringsMatch 
 * @param urlRegexMatch 
 * @param eventRegexMatch 
 */
@Serializable
data class AdsTargetGroupTargetPixelRule (
    @SerialName("url_full_match") val urlFullMatch: String? = null,
    @SerialName("url_regex_match") val urlRegexMatch: String? = null,
    @SerialName("event_full_match") val eventFullMatch: String? = null,
    @SerialName("event_regex_match") val eventRegexMatch: String? = null,
    @SerialName("url_substrings_match") val urlSubstringsMatch: List<String>? = null,
    @SerialName("event_substrings_match") val eventSubstringsMatch: List<String>? = null,
)
