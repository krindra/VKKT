package ru.krindra.vkkt.objects.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.friends.FriendsRequestsMutual
import ru.krindra.vkkt.objects.base.BaseSex
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.friends.FriendsFriendStatusStatus

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
    @SerialName("id") val id: Long,
    @SerialName("sex") val sex: BaseSex? = null,
    @SerialName("hidden") val hidden: Int? = null,
    @SerialName("photo_50") val photo50: String? = null,
    @SerialName("online_app") val onlineApp: Int? = null,
    @SerialName("last_name") val lastName: String? = null,
    @SerialName("online") val online: BaseBoolInt? = null,
    @SerialName("photo_100") val photo100: String? = null,
    @SerialName("is_closed") val isClosed: Boolean? = null,
    @SerialName("first_name") val firstName: String? = null,
    @SerialName("screen_name") val screenName: String? = null,
    @SerialName("trending") val trending: BaseBoolInt? = null,
    @SerialName("verified") val verified: BaseBoolInt? = null,
    @SerialName("deactivated") val deactivated: String? = null,
    @SerialName("mutual") val mutual: FriendsRequestsMutual? = null,
    @SerialName("online_info") val onlineInfo: UsersOnlineInfo? = null,
    @SerialName("online_mobile") val onlineMobile: BaseBoolInt? = null,
    @SerialName("can_access_closed") val canAccessClosed: Boolean? = null,
    @SerialName("friend_status") val friendStatus: FriendsFriendStatusStatus? = null,
)
