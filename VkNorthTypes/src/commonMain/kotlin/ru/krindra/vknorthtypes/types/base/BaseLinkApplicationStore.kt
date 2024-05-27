package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Store Id
 * @param name Store name
 */
@Serializable
data class BaseLinkApplicationStore (
    @SerialName("name") val name: String? = null,
    @SerialName("id") val id: Double? = null,
)
