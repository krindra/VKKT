package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 * @param amountOld 
 * @param amountNew 
 * @param amountDiff 
 * @param amountDiffWithoutFee 
 */
@Serializable
data class CallbackDonutSubscriptionPriceChanged (
    @SerialName("amount_new") val amountNew: Int,
    @SerialName("amount_old") val amountOld: Int,
    @SerialName("user_id") val userId: Long? = null,
    @SerialName("amount_diff") val amountDiff: Double? = null,
    @SerialName("amount_diff_without_fee") val amountDiffWithoutFee: Double? = null,
)
