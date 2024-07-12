package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Sex
 * 
 */
@Serializable
enum class AdsCriteriaSex(val value: String){
    @SerialName("0") ANY("0"),
    @SerialName("1") MALE("1"),
    @SerialName("2") FEMALE("2"),
}
