package ru.krindra.vknorthtypes.types.donut

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull
import ru.krindra.vknorthtypes.types.users.UsersUserFull

/**
 * @param subscriptions 
 * @param count 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class DonutGetSubscriptionsResponse (
    @SerialName("count") val count: Int? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("subscriptions") val subscriptions: List<DonutDonatorSubscriptionInfo>,
)

