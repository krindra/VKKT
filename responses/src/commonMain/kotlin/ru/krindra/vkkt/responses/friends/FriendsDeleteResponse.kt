package ru.krindra.vkkt.responses.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.friends.*

/**
 * @param success 
 * @param friendDeleted Returns 1 if friend has been deleted
 * @param outRequestDeleted Returns 1 if out request has been canceled
 * @param inRequestDeleted Returns 1 if incoming request has been declined
 * @param suggestionDeleted Returns 1 if suggestion has been declined
 */
@Serializable
data class FriendsDeleteResponse (
    @SerialName("success") val success: Int,
    @SerialName("friend_deleted") val friendDeleted: Int? = null,
    @SerialName("in_request_deleted") val inRequestDeleted: Int? = null,
    @SerialName("suggestion_deleted") val suggestionDeleted: Int? = null,
    @SerialName("out_request_deleted") val outRequestDeleted: Int? = null,
)

