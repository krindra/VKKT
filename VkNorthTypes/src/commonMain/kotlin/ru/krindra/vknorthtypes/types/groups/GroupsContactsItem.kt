package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId User ID
 * @param desc Contact description
 * @param phone Contact phone
 * @param email Contact email
 */
@Serializable
data class GroupsContactsItem (
    @SerialName("desc") val desc: String? = null,
    @SerialName("email") val email: String? = null,
    @SerialName("phone") val phone: String? = null,
    @SerialName("user_id") val userId: Long? = null,
)
