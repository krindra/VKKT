package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.video.VideoLiveInfo
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.audio.AudioAudio
import ru.krindra.vknorthtypes.types.base.BaseObject
import ru.krindra.vknorthtypes.types.base.BaseOwnerCover
import ru.krindra.vknorthtypes.types.base.BaseCountry
import ru.krindra.vknorthtypes.types.base.BaseCropPhoto

/**
 *
 * @param memberStatus Current user's member status
 * @param isAdult Information whether community is adult
 * @param isHiddenFromFeed Information whether community is hidden from current user's newsfeed
 * @param isFavorite Information whether community is in faves
 * @param isSubscribed Information whether current user is subscribed
 * @param city 
 * @param country 
 * @param description Community description
 * @param wikiPage Community's main wiki page title
 * @param membersCount Community members number
 * @param membersCountText Info about number of users in group
 * @param requestsCount The number of incoming requests to the community
 * @param videoLiveLevel Community level live streams achievements
 * @param videoLiveCount Number of community's live streams
 * @param clipsCount Number of community's clips
 * @param counters 
 * @param textlivesCount Textlives number
 * @param cover 
 * @param canPost Information whether current user can post on community's wall
 * @param canSuggest 
 * @param canUploadStory Information whether current user can upload story
 * @param canCallToCommunity Information whether current user can call to community
 * @param canUploadDoc Information whether current user can upload doc
 * @param canUploadVideo Information whether current user can upload video
 * @param canUploadClip Information whether current user can upload clip
 * @param canSeeAllPosts Information whether current user can see all posts on community's wall
 * @param canCreateTopic Information whether current user can create topic
 * @param activity Type of group, start date of event or category of public page
 * @param fixedPost Fixed post ID
 * @param hasPhoto Information whether community has photo
 * @param cropPhoto Данные о точках, по которым вырезаны профильная и миниатюрная фотографии сообщества
 * @param status Community status
 * @param statusAudio 
 * @param mainAlbumId Community's main photo album ID
 * @param links 
 * @param contacts 
 * @param wall Information about wall status in community
 * @param site Community's website
 * @param mainSection 
 * @param secondarySection 
 * @param trending Information whether the community has a "fire" pictogram.
 * @param canMessage Information whether current user can send a message to community
 * @param isMessagesBlocked Information whether community can send a message to current user
 * @param canSendNotify Information whether community can send notifications by phone number to current user
 * @param onlineStatus Status of replies in community messages
 * @param invitedBy Inviter ID
 * @param ageLimits Information whether age limit
 * @param banInfo User ban info
 * @param hasGroupChannel 
 * @param addresses Info about addresses in groups
 * @param isSubscribedPodcasts Information whether current user is subscribed to podcasts
 * @param canSubscribePodcasts Owner in whitelist or not
 * @param canSubscribePosts Can subscribe to wall
 * @param liveCovers Live covers state
 * @param storiesArchiveCount 
 * @param hasUnseenStories 
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
 * @param market 
 * @param hasMarketApp Information whether community has installed market app
 * @param usingVkpayMarketApp 
 */
@Serializable
data class GroupsGroupFull (
    @SerialName("crop_photo") val cropPhoto: BaseCropPhoto? = null,
    @SerialName("activity") val activity: String? = null,
    @SerialName("admin_level") val adminLevel: GroupsGroupAdminLevel? = null,
    @SerialName("est_date") val estDate: String? = null,
    @SerialName("wiki_page") val wikiPage: String? = null,
    @SerialName("wall") val wall: Int? = null,
    @SerialName("video_live_level") val videoLiveLevel: Int? = null,
    @SerialName("invited_by") val invitedBy: Int? = null,
    @SerialName("can_subscribe_posts") val canSubscribePosts: Boolean? = null,
    @SerialName("textlives_count") val textlivesCount: Int? = null,
    @SerialName("verified") val verified: BaseBoolInt? = null,
    @SerialName("video_live_count") val videoLiveCount: Int? = null,
    @SerialName("is_hidden_from_feed") val isHiddenFromFeed: BaseBoolInt? = null,
    @SerialName("photo_100") val photo100: String? = null,
    @SerialName("can_message") val canMessage: BaseBoolInt? = null,
    @SerialName("is_admin") val isAdmin: BaseBoolInt? = null,
    @SerialName("is_favorite") val isFavorite: BaseBoolInt? = null,
    @SerialName("is_subscribed") val isSubscribed: BaseBoolInt? = null,
    @SerialName("main_album_id") val mainAlbumId: Long? = null,
    @SerialName("is_messages_blocked") val isMessagesBlocked: BaseBoolInt? = null,
    @SerialName("is_adult") val isAdult: BaseBoolInt? = null,
    @SerialName("photo_max_size") val photoMaxSize: GroupsPhotoSize? = null,
    @SerialName("can_create_topic") val canCreateTopic: BaseBoolInt? = null,
    @SerialName("ban_info") val banInfo: GroupsGroupBanInfo? = null,
    @SerialName("public_date_label") val publicDateLabel: String? = null,
    @SerialName("city") val city: BaseObject? = null,
    @SerialName("links") val links: List<GroupsLinksItem>? = null,
    @SerialName("photo_200") val photo200: String? = null,
    @SerialName("can_upload_story") val canUploadStory: BaseBoolInt? = null,
    @SerialName("is_closed") val isClosed: GroupsGroupIsClosed? = null,
    @SerialName("members_count_text") val membersCountText: String? = null,
    @SerialName("fixed_post") val fixedPost: Int? = null,
    @SerialName("site") val site: String? = null,
    @SerialName("online_status") val onlineStatus: GroupsOnlineStatus? = null,
    @SerialName("can_send_notify") val canSendNotify: BaseBoolInt? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("stories_archive_count") val storiesArchiveCount: Int? = null,
    @SerialName("is_video_live_notifications_blocked") val isVideoLiveNotificationsBlocked: BaseBoolInt? = null,
    @SerialName("country") val country: BaseCountry? = null,
    @SerialName("clips_count") val clipsCount: Int? = null,
    @SerialName("can_subscribe_podcasts") val canSubscribePodcasts: Boolean? = null,
    @SerialName("photo_400_orig") val photo400Orig: String? = null,
    @SerialName("cover") val cover: BaseOwnerCover? = null,
    @SerialName("type") val type: GroupsGroupType? = null,
    @SerialName("member_status") val memberStatus: GroupsGroupFullMemberStatus? = null,
    @SerialName("has_market_app") val hasMarketApp: Boolean? = null,
    @SerialName("status") val status: String? = null,
    @SerialName("can_upload_doc") val canUploadDoc: BaseBoolInt? = null,
    @SerialName("secondary_section") val secondarySection: GroupsGroupFullSection? = null,
    @SerialName("market") val market: GroupsMarketInfo? = null,
    @SerialName("can_see_all_posts") val canSeeAllPosts: BaseBoolInt? = null,
    @SerialName("status_audio") val statusAudio: AudioAudio? = null,
    @SerialName("has_group_channel") val hasGroupChannel: Boolean? = null,
    @SerialName("start_date") val startDate: Int? = null,
    @SerialName("has_photo") val hasPhoto: BaseBoolInt? = null,
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String? = null,
    @SerialName("has_unseen_stories") val hasUnseenStories: Boolean? = null,
    @SerialName("deactivated") val deactivated: String? = null,
    @SerialName("photo_400") val photo400: String? = null,
    @SerialName("age_limits") val ageLimits: GroupsGroupFullAgeLimits? = null,
    @SerialName("is_advertiser") val isAdvertiser: BaseBoolInt? = null,
    @SerialName("trending") val trending: BaseBoolInt? = null,
    @SerialName("can_call_to_community") val canCallToCommunity: Boolean? = null,
    @SerialName("photo_max_orig") val photoMaxOrig: String? = null,
    @SerialName("live_covers") val liveCovers: GroupsLiveCovers? = null,
    @SerialName("video_live") val videoLive: VideoLiveInfo? = null,
    @SerialName("is_member") val isMember: BaseBoolInt? = null,
    @SerialName("using_vkpay_market_app") val usingVkpayMarketApp: Boolean? = null,
    @SerialName("counters") val counters: GroupsCountersGroup? = null,
    @SerialName("addresses") val addresses: GroupsAddressesInfo? = null,
    @SerialName("can_upload_video") val canUploadVideo: BaseBoolInt? = null,
    @SerialName("members_count") val membersCount: Int? = null,
    @SerialName("can_upload_clip") val canUploadClip: BaseBoolInt? = null,
    @SerialName("photo_200_orig") val photo200Orig: String? = null,
    @SerialName("screen_name") val screenName: String? = null,
    @SerialName("main_section") val mainSection: GroupsGroupFullSection? = null,
    @SerialName("finish_date") val finishDate: Int? = null,
    @SerialName("contacts") val contacts: List<GroupsContactsItem>? = null,
    @SerialName("can_post") val canPost: BaseBoolInt? = null,
    @SerialName("can_suggest") val canSuggest: BaseBoolInt? = null,
    @SerialName("is_subscribed_podcasts") val isSubscribedPodcasts: Boolean? = null,
    @SerialName("requests_count") val requestsCount: Int? = null,
    @SerialName("photo_max") val photoMax: String? = null,
    @SerialName("photo_50") val photo50: String? = null,
)
