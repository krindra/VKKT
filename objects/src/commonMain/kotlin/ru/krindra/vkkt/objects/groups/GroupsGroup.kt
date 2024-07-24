package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.video.VideoLiveInfo
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param id Community ID
 * @param name Community name
 * @param screenName Domain of the community page
 * @param isClosed 
 * @param type 
 * @param isAdmin Information whether current user is administrator
 * @param adminLevel 
 * @param isMember Information whether current user is member
 * @param isAdvertiser Information whether current user is advertiser
 * @param startDate Start date in Unixtime format
 * @param finishDate Finish date in Unixtime format
 * @param verified Information whether community is verified
 * @param deactivated Information whether community is banned
 * @param photo50 URL of square photo of the community with 50 pixels in width
 * @param photo100 URL of square photo of the community with 100 pixels in width
 * @param photo200 URL of square photo of the community with 200 pixels in width
 * @param photo200Orig URL of square photo of the community with 200 pixels in width original
 * @param photo400 URL of square photo of the community with 400 pixels in width
 * @param photo400Orig URL of square photo of the community with 400 pixels in width original
 * @param photoMax URL of square photo of the community with max pixels in width
 * @param photoMaxOrig URL of square photo of the community with max pixels in width original
 * @param estDate Established date
 * @param publicDateLabel Public date label
 * @param photoMaxSize 
 * @param isVideoLiveNotificationsBlocked 
 * @param videoLive 
 */
@Serializable
data class GroupsGroup (
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String? = null,
    @SerialName("est_date") val estDate: String? = null,
    @SerialName("photo_50") val photo50: String? = null,
    @SerialName("start_date") val startDate: Int? = null,
    @SerialName("photo_100") val photo100: String? = null,
    @SerialName("photo_200") val photo200: String? = null,
    @SerialName("photo_400") val photo400: String? = null,
    @SerialName("photo_max") val photoMax: String? = null,
    @SerialName("type") val type: GroupsGroupType? = null,
    @SerialName("finish_date") val finishDate: Int? = null,
    @SerialName("is_admin") val isAdmin: BaseBoolInt? = null,
    @SerialName("screen_name") val screenName: String? = null,
    @SerialName("verified") val verified: BaseBoolInt? = null,
    @SerialName("deactivated") val deactivated: String? = null,
    @SerialName("is_member") val isMember: BaseBoolInt? = null,
    @SerialName("photo_200_orig") val photo200Orig: String? = null,
    @SerialName("photo_400_orig") val photo400Orig: String? = null,
    @SerialName("photo_max_orig") val photoMaxOrig: String? = null,
    @SerialName("video_live") val videoLive: VideoLiveInfo? = null,
    @SerialName("is_advertiser") val isAdvertiser: BaseBoolInt? = null,
    @SerialName("is_closed") val isClosed: GroupsGroupIsClosed? = null,
    @SerialName("public_date_label") val publicDateLabel: String? = null,
    @SerialName("photo_max_size") val photoMaxSize: GroupsPhotoSize? = null,
    @SerialName("admin_level") val adminLevel: GroupsGroupAdminLevel? = null,
    @SerialName("is_video_live_notifications_blocked") val isVideoLiveNotificationsBlocked: BaseBoolInt? = null,
)
