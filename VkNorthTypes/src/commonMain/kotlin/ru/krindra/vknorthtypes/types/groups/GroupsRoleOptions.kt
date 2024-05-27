package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * User's credentials as community admin
 * 
 */
@Serializable
enum class GroupsRoleOptions(val value: String){
    @SerialName("moderator") MODERATOR("moderator"),
    @SerialName("editor") EDITOR("editor"),
    @SerialName("administrator") ADMINISTRATOR("administrator"),
    @SerialName("creator") CREATOR("creator"),
}
