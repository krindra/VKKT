package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseObjectWithName

/**
 *
 * @param id Object ID
 * @param name Object name
 * @param genders 
 */
@Serializable
data class GroupsGroupSubcategory (
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
    @SerialName("genders") val genders: List<BaseObjectWithName>? = null,
)
