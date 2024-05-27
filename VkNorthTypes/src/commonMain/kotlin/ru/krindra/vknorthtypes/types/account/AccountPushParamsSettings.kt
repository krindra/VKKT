package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Settings parameters
 * 
 */
@Serializable
enum class AccountPushParamsSettings(val value: String){
    @SerialName("on") ON("on"),
    @SerialName("off") OFF("off"),
    @SerialName("fr_of_fr") FR_OF_FR("fr_of_fr"),
}
