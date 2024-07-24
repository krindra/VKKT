package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param name 
 * @param color 
 * @param uses 
 */
@Serializable
data class GroupsGroupTag (
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String,
    @SerialName("color") val color: String,
    @SerialName("uses") val uses: Int? = null,
)
