package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class AppsGetFriendsListResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
)

