package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Type of the market group
 * 
 */
@Serializable
enum class MarketOwnerType(val value: String){
    @SerialName("base") BASE("base"),
    @SerialName("pro") PRO("pro"),
    @SerialName("disabled") DISABLED("disabled"),
}
