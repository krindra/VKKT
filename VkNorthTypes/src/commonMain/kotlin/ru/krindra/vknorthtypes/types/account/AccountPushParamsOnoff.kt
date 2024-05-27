package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Settings parameters
 * 
 */
@Serializable
enum class AccountPushParamsOnoff(val value: String){
    @SerialName("on") ON("on"),
    @SerialName("off") OFF("off"),
}
