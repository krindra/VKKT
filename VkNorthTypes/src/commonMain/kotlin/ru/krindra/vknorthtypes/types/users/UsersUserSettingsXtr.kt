package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseCity
import ru.krindra.vknorthtypes.types.account.AccountNameRequest
import ru.krindra.vknorthtypes.types.account.AccountUserSettingsInterests
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.audio.AudioAudio
import ru.krindra.vknorthtypes.types.base.BaseSex
import ru.krindra.vknorthtypes.types.base.BaseCountry

/**
 *
 * @param connections 
 * @param bdate User's date of birth
 * @param bdateVisibility Information whether user's birthdate are hidden
 * @param city 
 * @param country 
 * @param firstName User first name
 * @param homeTown User's hometown
 * @param lastName User last name
 * @param maidenName User maiden name
 * @param nameRequest 
 * @param personal 
 * @param phone User phone number with some hidden digits
 * @param relation User relationship status
 * @param relationPartner 
 * @param relationPending Information whether relation status is pending
 * @param relationRequests 
 * @param screenName Domain name of the user's page
 * @param sex User sex
 * @param status User status
 * @param statusAudio 
 * @param interests 
 * @param languages 
 */
@Serializable
data class UsersUserSettingsXtr (
    @SerialName("personal") val personal: UsersPersonal? = null,
    @SerialName("phone") val phone: String? = null,
    @SerialName("relation") val relation: UsersUserRelation? = null,
    @SerialName("city") val city: BaseCity? = null,
    @SerialName("bdate_visibility") val bdateVisibility: Int? = null,
    @SerialName("languages") val languages: List<String>? = null,
    @SerialName("status") val status: String,
    @SerialName("relation_partner") val relationPartner: UsersUserMin? = null,
    @SerialName("status_audio") val statusAudio: AudioAudio? = null,
    @SerialName("screen_name") val screenName: String? = null,
    @SerialName("first_name") val firstName: String? = null,
    @SerialName("interests") val interests: AccountUserSettingsInterests? = null,
    @SerialName("relation_pending") val relationPending: BaseBoolInt? = null,
    @SerialName("sex") val sex: BaseSex? = null,
    @SerialName("connections") val connections: UsersUserConnections? = null,
    @SerialName("home_town") val homeTown: String,
    @SerialName("name_request") val nameRequest: AccountNameRequest? = null,
    @SerialName("country") val country: BaseCountry? = null,
    @SerialName("relation_requests") val relationRequests: List<UsersUserMin>? = null,
    @SerialName("maiden_name") val maidenName: String? = null,
    @SerialName("last_name") val lastName: String? = null,
    @SerialName("bdate") val bdate: String? = null,
)
