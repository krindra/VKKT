package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param firstName First name in request
 * @param id Request ID needed to cancel the request
 * @param lastName Last name in request
 * @param status 
 * @param lang Text to display to user
 * @param linkHref href for link in lang field
 * @param linkLabel label to display for link in lang field
 */
@Serializable
data class AccountNameRequest (
    @SerialName("id") val id: Long? = null,
    @SerialName("lang") val lang: String? = null,
    @SerialName("last_name") val lastName: String? = null,
    @SerialName("link_href") val linkHref: String? = null,
    @SerialName("first_name") val firstName: String? = null,
    @SerialName("link_label") val linkLabel: String? = null,
    @SerialName("status") val status: AccountNameRequestStatus? = null,
)
