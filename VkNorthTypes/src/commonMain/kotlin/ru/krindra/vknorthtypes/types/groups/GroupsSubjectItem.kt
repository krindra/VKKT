package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Subject ID
 * @param name Subject title
 */
@Serializable
data class GroupsSubjectItem (
    @SerialName("name") val name: String,
    @SerialName("id") val id: Long,
)
