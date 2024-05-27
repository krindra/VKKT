package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param title 
 * @param creatorId 
 * @param url 
 * @param secretKey 
 * @param status 
 */
@Serializable
data class GroupsCallbackServer (
    @SerialName("title") val title: String,
    @SerialName("id") val id: Long,
    @SerialName("url") val url: String,
    @SerialName("secret_key") val secretKey: String,
    @SerialName("status") val status: String,
    @SerialName("creator_id") val creatorId: Long,
)
