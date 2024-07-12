package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class GroupsMemberRolePermission(val value: String){
    @SerialName("ads") ADS("ads"),
}
