package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param accessKey Access key for graffiti
 * @param id Graffiti ID
 * @param ownerId Graffiti owner ID
 * @param url Graffiti URL
 * @param width Graffiti width
 * @param height Graffiti height
 */
@Serializable
data class MessagesGraffiti (
    @SerialName("height") val height: Int,
    @SerialName("id") val id: Long,
    @SerialName("url") val url: String,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("width") val width: Int,
    @SerialName("owner_id") val ownerId: Long,
)
