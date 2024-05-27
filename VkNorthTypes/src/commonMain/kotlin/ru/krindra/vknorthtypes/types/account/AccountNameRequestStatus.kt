package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Request status
 * 
 */
@Serializable
enum class AccountNameRequestStatus(val value: String){
    @SerialName("success") SUCCESS("success"),
    @SerialName("processing") PROCESSING("processing"),
    @SerialName("declined") DECLINED("declined"),
    @SerialName("was_accepted") WAS_ACCEPTED("was_accepted"),
    @SerialName("was_declined") WAS_DECLINED("was_declined"),
    @SerialName("declined_with_link") DECLINED_WITH_LINK("declined_with_link"),
    @SerialName("response") RESPONSE("response"),
    @SerialName("response_with_link") RESPONSE_WITH_LINK("response_with_link"),
}
