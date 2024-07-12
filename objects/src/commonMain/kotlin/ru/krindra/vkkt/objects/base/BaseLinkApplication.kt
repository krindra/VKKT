package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param appId Application Id
 * @param store 
 */
@Serializable
data class BaseLinkApplication (
    @SerialName("app_id") val appId: Double? = null,
    @SerialName("store") val store: BaseLinkApplicationStore? = null,
)
