package ru.krindra.vknorthtypes.types.audio

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param accessKey Access key for the audio
 * @param artist Artist name
 * @param id Audio ID
 * @param ownerId Audio owner's ID
 * @param title Title
 * @param url URL of mp3 file
 * @param duration Duration in seconds
 * @param date Date when uploaded
 * @param albumId Album ID
 * @param performer Performer name
 */
@Serializable
data class AudioAudio (
    @SerialName("date") val date: Int? = null,
    @SerialName("title") val title: String,
    @SerialName("id") val id: Long,
    @SerialName("artist") val artist: String,
    @SerialName("duration") val duration: Int,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("performer") val performer: String? = null,
    @SerialName("album_id") val albumId: Long? = null,
    @SerialName("url") val url: String? = null,
)
