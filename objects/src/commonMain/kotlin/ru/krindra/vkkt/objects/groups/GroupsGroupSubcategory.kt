package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseObjectWithName

/**
 *
 * @param id Object ID
 * @param name Object name
 * @param genders 
 */
@Serializable
data class GroupsGroupSubcategory (
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String,
    @SerialName("genders") val genders: List<BaseObjectWithName>? = null,
)
