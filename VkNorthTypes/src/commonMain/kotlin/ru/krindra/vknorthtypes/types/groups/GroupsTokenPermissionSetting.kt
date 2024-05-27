package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param name 
 * @param setting 
 */
@Serializable
data class GroupsTokenPermissionSetting (
    @SerialName("setting") val setting: Int,
    @SerialName("name") val name: String,
)
