package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Items count
 * @param items 
 */
@Serializable
data class AccountPushConversations (
    @SerialName("count") val count: Int? = null,
    @SerialName("items") val items: List<AccountPushConversationsItem>? = null,
)
