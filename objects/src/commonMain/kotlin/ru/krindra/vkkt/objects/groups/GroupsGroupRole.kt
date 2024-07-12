package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class GroupsGroupRole(val value: String){
    @SerialName("moderator") MODERATOR("moderator"),
    @SerialName("editor") EDITOR("editor"),
    @SerialName("administrator") ADMINISTRATOR("administrator"),
    @SerialName("advertiser") ADVERTISER("advertiser"),
}
