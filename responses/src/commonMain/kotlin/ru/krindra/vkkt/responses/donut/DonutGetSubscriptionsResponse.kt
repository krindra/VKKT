package ru.krindra.vkkt.responses.donut

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.donut.*

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

