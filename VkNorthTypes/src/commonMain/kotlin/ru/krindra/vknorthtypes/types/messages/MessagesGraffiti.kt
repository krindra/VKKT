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
    @SerialName("id") val id: Long,
    @SerialName("url") val url: String,
    @SerialName("width") val width: Int,
    @SerialName("height") val height: Int,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("access_key") val accessKey: String? = null,
)
