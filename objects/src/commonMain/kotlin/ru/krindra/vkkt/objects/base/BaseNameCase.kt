package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class BaseNameCase(val value: String){
    @SerialName("Nom") NOMINATIVE("Nom"),
    @SerialName("Gen") GENITIVE("Gen"),
    @SerialName("Dat") DATIVE("Dat"),
    @SerialName("Acc") ACCUSATIVE("Acc"),
    @SerialName("Ins") INSTRUMENTAL("Ins"),
    @SerialName("Abl") PREPOSITIONAL("Abl"),
}
