package ru.krindra.vknorthtypes.types.users

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.base.BaseSex
import ru.krindra.vknorthtypes.types.friends.FriendsRequestsMutual
import ru.krindra.vknorthtypes.types.friends.FriendsFriendStatusStatus

/**
 *
 * @param sex User sex
 * @param screenName Domain name of the user's page
 * @param photo50 URL of square photo of the user with 50 pixels in width
 * @param photo100 URL of square photo of the user with 100 pixels in width
 * @param onlineInfo 
 * @param online Information whether the user is online
 * @param onlineMobile Information whether the user is online in mobile site or application
 * @param onlineApp Application ID
 * @param verified Information whether the user is verified
 * @param trending Information whether the user has a "fire" pictogram.
 * @param friendStatus 
 * @param mutual 
 * @param deactivated Returns if a profile is deleted or blocked
 * @param firstName User first name
 * @param hidden Returns if a profile is hidden.
 * @param id User ID
 * @param lastName User last name
 * @param canAccessClosed 
 * @param isClosed 
 */
@Serializable
data class UsersUser (
    @SerialName("mutual") val mutual: FriendsRequestsMutual? = null,
    @SerialName("online_mobile") val onlineMobile: BaseBoolInt? = null,
    @SerialName("is_closed") val isClosed: Boolean? = null,
    @SerialName("photo_100") val photo100: String? = null,
    @SerialName("online_app") val onlineApp: Int? = null,
    @SerialName("trending") val trending: BaseBoolInt? = null,
    @SerialName("sex") val sex: BaseSex? = null,
    @SerialName("photo_50") val photo50: String? = null,
    @SerialName("hidden") val hidden: Int? = null,
    @SerialName("deactivated") val deactivated: String? = null,
    @SerialName("screen_name") val screenName: String? = null,
    @SerialName("can_access_closed") val canAccessClosed: Boolean? = null,
    @SerialName("verified") val verified: BaseBoolInt? = null,
    @SerialName("friend_status") val friendStatus: FriendsFriendStatusStatus? = null,
    @SerialName("first_name") val firstName: String? = null,
    @SerialName("last_name") val lastName: String? = null,
    @SerialName("online") val online: BaseBoolInt? = null,
    @SerialName("id") val id: Long,
    @SerialName("online_info") val onlineInfo: UsersOnlineInfo? = null,
)