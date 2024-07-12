package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id User id
 * @param photo50 Url for user photo
 * @param photo100 Url for user photo
 * @param firstName User first name
 */
@Serializable
data class GroupsProfileItem (
    @SerialName("id") val id: Long,
    @SerialName("photo_50") val photo50: String,
    @SerialName("photo_100") val photo100: String,
    @SerialName("first_name") val firstName: String,
)
