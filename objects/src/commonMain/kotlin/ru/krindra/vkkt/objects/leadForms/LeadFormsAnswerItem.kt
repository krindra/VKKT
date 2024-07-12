package ru.krindra.vkkt.objects.leadForms

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key 
 * @param value 
 */
@Serializable
data class LeadFormsAnswerItem (
    @SerialName("value") val value: String,
    @SerialName("key") val key: String? = null,
)
