package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Scope description
 * 
 * @param name Scope name
 * @param title Scope title
 */
@Serializable
data class AppsScope (
    @SerialName("title") val title: String? = null,
    @SerialName("name") val name: String,
)
