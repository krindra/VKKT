package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param allLimit Client's total limit, rubles
 * @param dayLimit Client's day limit, rubles
 * @param id Client ID
 * @param name Client name
 * @param ordData Ord data
 */
@Serializable
data class AdsClient (
    @SerialName("id") val id: Long,
    @SerialName("ord_data") val ordData: AdsOrdData? = null,
    @SerialName("all_limit") val allLimit: String,
    @SerialName("day_limit") val dayLimit: String,
    @SerialName("name") val name: String,
)
