package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param accessRole 
 * @param accountId Account ID
 * @param accountStatus Information whether account is active
 * @param accountType 
 * @param accountName Account name
 * @param canViewBudget Can user view account budget
 */
@Serializable
data class AdsAccount (
    @SerialName("account_id") val accountId: Int,
    @SerialName("account_name") val accountName: String,
    @SerialName("access_role") val accessRole: AdsAccessRole,
    @SerialName("can_view_budget") val canViewBudget: Boolean,
    @SerialName("account_type") val accountType: AdsAccountType,
    @SerialName("account_status") val accountStatus: BaseBoolInt,
)
