package ru.krindra.vknorthtypes.types.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param link Link URL
 * @param status 
 */
@Serializable
data class UtilsLinkChecked (
    @SerialName("status") val status: UtilsLinkCheckedStatus? = null,
    @SerialName("link") val link: String? = null,
)
