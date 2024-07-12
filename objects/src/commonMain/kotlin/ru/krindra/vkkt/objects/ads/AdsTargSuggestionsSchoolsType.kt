package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * School type
 * 
 */
@Serializable
enum class AdsTargSuggestionsSchoolsType(val value: String){
    @SerialName("school") SCHOOL("school"),
    @SerialName("university") UNIVERSITY("university"),
    @SerialName("faculty") FACULTY("faculty"),
    @SerialName("chair") CHAIR("chair"),
}
