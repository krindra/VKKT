package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number of available results
 * @param items 
 */
@Serializable
data class UsersSearchResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<UsersUserFull>,
)

