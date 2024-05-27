package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Type of online status of group
 * 
 */
@Serializable
enum class GroupsOnlineStatusType(val value: String){
    @SerialName("none") NONE("none"),
    @SerialName("online") ONLINE("online"),
    @SerialName("answer_mark") ANSWER_MARK("answer_mark"),
}
