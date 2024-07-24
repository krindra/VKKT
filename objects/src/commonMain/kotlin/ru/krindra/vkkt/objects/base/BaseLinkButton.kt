package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param action Button action
 * @param title Button title
 * @param blockId Target block id
 * @param sectionId Target section id
 * @param artistId artist id
 * @param curatorId curator id
 * @param albumId Video album id
 * @param ownerId Owner id
 * @param icon Button icon name, e.g. 'phone' or 'gift'
 * @param style 
 * @param audioId 
 * @param hashtag 
 */
@Serializable
data class BaseLinkButton (
    @SerialName("icon") val icon: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("album_id") val albumId: Int? = null,
    @SerialName("audio_id") val audioId: Int? = null,
    @SerialName("owner_id") val ownerId: Int? = null,
    @SerialName("hashtag") val hashtag: String? = null,
    @SerialName("block_id") val blockId: String? = null,
    @SerialName("artist_id") val artistId: String? = null,
    @SerialName("curator_id") val curatorId: Int? = null,
    @SerialName("section_id") val sectionId: String? = null,
    @SerialName("style") val style: BaseLinkButtonStyle? = null,
    @SerialName("action") val action: BaseLinkButtonAction? = null,
)
