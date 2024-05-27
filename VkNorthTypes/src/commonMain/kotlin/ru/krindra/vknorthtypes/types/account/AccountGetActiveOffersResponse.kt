package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class AccountGetActiveOffersResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<AccountOffer>,
)

