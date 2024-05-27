package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param clientType 
 * @param clientName 
 * @param inn 
 * @param phone 
 * @param subagent 
 * @param contractNumber 
 * @param contractDate 
 * @param contractType 
 * @param contractObject 
 * @param withVat 
 */
@Serializable
data class AdsOrdData (
    @SerialName("phone") val phone: String,
    @SerialName("contract_date") val contractDate: String,
    @SerialName("client_type") val clientType: AdsOrdClientType,
    @SerialName("client_name") val clientName: String,
    @SerialName("contract_number") val contractNumber: String,
    @SerialName("inn") val inn: String? = null,
    @SerialName("subagent") val subagent: AdsOrdSubagent? = null,
    @SerialName("with_vat") val withVat: Boolean,
    @SerialName("contract_type") val contractType: String,
    @SerialName("contract_object") val contractObject: String,
)
