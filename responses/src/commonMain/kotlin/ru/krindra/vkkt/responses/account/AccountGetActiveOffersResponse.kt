package ru.krindra.vkkt.responses.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.account.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class AccountGetActiveOffersResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<AccountOffer>,
)

