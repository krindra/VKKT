package ru.krindra.vkkt.objects.apps

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
    @SerialName("name") val name: String,
    @SerialName("title") val title: String? = null,
)
