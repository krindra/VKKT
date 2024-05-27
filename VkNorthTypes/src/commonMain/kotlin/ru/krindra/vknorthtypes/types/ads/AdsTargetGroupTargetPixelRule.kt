package ru.krindra.vknorthtypes.types.ads

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
    @SerialName("event_regex_match") val eventRegexMatch: String? = null,
    @SerialName("event_full_match") val eventFullMatch: String? = null,
    @SerialName("url_substrings_match") val urlSubstringsMatch: List<String>? = null,
    @SerialName("url_full_match") val urlFullMatch: String? = null,
    @SerialName("event_substrings_match") val eventSubstringsMatch: List<String>? = null,
    @SerialName("url_regex_match") val urlRegexMatch: String? = null,
)
