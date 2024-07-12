package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Subject ID
 * @param name Subject title
 */
@Serializable
data class GroupsSubjectItem (
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
)
