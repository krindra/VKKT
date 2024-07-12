package ru.krindra.vkkt.responses.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.*

/**
 * @param count Total number of available results
 * @param items 
 */
@Serializable
data class UsersGetSubscriptionsExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<UsersSubscriptionsItem>,
)

