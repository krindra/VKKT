package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class GroupsFilter(val value: String){
    @SerialName("admin") ADMIN("admin"),
    @SerialName("editor") EDITOR("editor"),
    @SerialName("moder") MODER("moder"),
    @SerialName("advertiser") ADVERTISER("advertiser"),
    @SerialName("groups") GROUPS("groups"),
    @SerialName("publics") PUBLICS("publics"),
    @SerialName("events") EVENTS("events"),
    @SerialName("has_addresses") HAS_ADDRESSES("has_addresses"),
}
