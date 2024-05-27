package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

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
    @SerialName("account_name") val accountName: String,
    @SerialName("account_status") val accountStatus: BaseBoolInt,
    @SerialName("can_view_budget") val canViewBudget: Boolean,
    @SerialName("access_role") val accessRole: AdsAccessRole,
    @SerialName("account_id") val accountId: Long,
    @SerialName("account_type") val accountType: AdsAccountType,
)
