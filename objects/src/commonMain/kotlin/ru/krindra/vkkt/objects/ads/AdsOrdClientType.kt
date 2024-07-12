package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class AdsOrdClientType(val value: String){
    @SerialName("person") PERSON("person"),
    @SerialName("individual") INDIVIDUAL("individual"),
    @SerialName("legal") LEGAL("legal"),
    @SerialName("foreign") FOREIGN("foreign"),
    @SerialName("unknown") UNKNOWN("unknown"),
}
