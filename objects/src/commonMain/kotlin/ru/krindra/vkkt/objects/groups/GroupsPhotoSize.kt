package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param height Image height
 * @param width Image width
 */
@Serializable
data class GroupsPhotoSize (
    @SerialName("width") val width: Int,
    @SerialName("height") val height: Int,
)
