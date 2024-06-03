package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param birthDate Date of child birthday (format dd.mm.yyyy)
 * @param id Relative ID
 * @param name Name of relative
 * @param type Relative type
 */
@Serializable
data class UsersRelative (
    @SerialName("type") val type: String,
    @SerialName("id") val id: Long? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("birth_date") val birthDate: String? = null,
)
