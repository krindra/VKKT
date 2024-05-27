package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Ads easy promote
 * 
 * @param type Type
 * @param text Text
 * @param labelText Label text
 * @param buttonText Button text
 * @param isAdNotEasy Is ad not easy
 * @param adId Ad id
 * @param topUnionId Top union id
 */
@Serializable
data class AdsPostEasyPromote (
    @SerialName("label_text") val labelText: String? = null,
    @SerialName("top_union_id") val topUnionId: Long? = null,
    @SerialName("is_ad_not_easy") val isAdNotEasy: Boolean? = null,
    @SerialName("button_text") val buttonText: String? = null,
    @SerialName("ad_id") val adId: Long? = null,
    @SerialName("type") val type: Int? = null,
    @SerialName("text") val text: String? = null,
)
