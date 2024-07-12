package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Account type
 * 
 */
@Serializable
enum class AdsAccountType(val value: String){
    @SerialName("general") GENERAL("general"),
    @SerialName("agency") AGENCY("agency"),
}
