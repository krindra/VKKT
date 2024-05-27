package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class GroupsMemberRolePermission(val value: String){
    @SerialName("ads") ADS("ads"),
}
