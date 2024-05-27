package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Sex
 * 
 */
@Serializable
enum class AdsStatsSexValue(val value: String){
    @SerialName("f") FEMALE("f"),
    @SerialName("m") MALE("m"),
}
