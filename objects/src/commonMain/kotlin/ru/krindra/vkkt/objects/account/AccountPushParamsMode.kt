package ru.krindra.vkkt.objects.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Settings parameters
 * 
 */
@Serializable
enum class AccountPushParamsMode(val value: String){
    @SerialName("on") ON("on"),
    @SerialName("off") OFF("off"),
    @SerialName("no_sound") NO_SOUND("no_sound"),
    @SerialName("no_text") NO_TEXT("no_text"),
}
