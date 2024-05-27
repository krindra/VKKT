package ru.krindra.vknorthtypes.types.groups

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
    @SerialName("uses") val uses: Int? = null,
    @SerialName("color") val color: String,
    @SerialName("name") val name: String,
    @SerialName("id") val id: Long,
)
