package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AudioNewObject(
    @SerialName("date") val date: Int? = null,
    @SerialName("artist") val artist: String,
    @SerialName("album_id") val albumId: Long? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("duration") val duration: Int,
    @SerialName("id") val id: Long,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("title") val title: String,
    @SerialName("performer") val performer: String? = null,
    @SerialName("url") val url: String? = null,
)