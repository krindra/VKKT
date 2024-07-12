package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Owner type
 * 
 */
@Serializable
enum class GroupsOwnerXtrBanInfoType(val value: String){
    @SerialName("group") GROUP("group"),
    @SerialName("profile") PROFILE("profile"),
}
