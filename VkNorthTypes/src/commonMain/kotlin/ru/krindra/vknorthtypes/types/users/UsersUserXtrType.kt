package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.apps.AppsAppMin
import ru.krindra.vknorthtypes.types.owner.OwnerState
import ru.krindra.vknorthtypes.types.friends.FriendsFriendStatusStatus
import ru.krindra.vknorthtypes.types.base.BaseSex
import ru.krindra.vknorthtypes.types.friends.FriendsRequestsMutual
import ru.krindra.vknorthtypes.types.audio.AudioAudio
import ru.krindra.vknorthtypes.types.base.BaseCity
import ru.krindra.vknorthtypes.types.base.BaseCropPhoto
import ru.krindra.vknorthtypes.types.photos.PhotosPhotoFalseable
import ru.krindra.vknorthtypes.types.video.VideoLiveInfo
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto
import ru.krindra.vknorthtypes.types.base.BaseCountry

/**
 *
 * @param type 
 * @param firstNameNom User's first name in nominative case
 * @param firstNameGen User's first name in genitive case
 * @param firstNameDat User's first name in dative case
 * @param firstNameAcc User's first name in accusative case
 * @param firstNameIns User's first name in instrumental case
 * @param firstNameAbl User's first name in prepositional case
 * @param lastNameNom User's last name in nominative case
 * @param lastNameGen User's last name in genitive case
 * @param lastNameDat User's last name in dative case
 * @param lastNameAcc User's last name in accusative case
 * @param lastNameIns User's last name in instrumental case
 * @param lastNameAbl User's last name in prepositional case
 * @param nickname User nickname
 * @param maidenName User maiden name
 * @param contactName User contact name
 * @param domain Domain name of the user's page
 * @param bdate User's date of birth
 * @param city 
 * @param country 
 * @param timezone User's timezone
 * @param ownerState 
 * @param photo200 URL of square photo of the user with 200 pixels in width
 * @param photoMax URL of square photo of the user with maximum width
 * @param photo200Orig URL of user's photo with 200 pixels in width
 * @param photo400Orig URL of user's photo with 400 pixels in width
 * @param photoMaxOrig URL of user's photo of maximum size
 * @param photoId ID of the user's main photo
 * @param hasPhoto Information whether the user has main photo
 * @param hasMobile Information whether the user specified his phone number
 * @param isFriend Information whether the user is a friend of current user
 * @param isBestFriend Information whether the user is a best friend of current user
 * @param wallComments Information whether current user can comment wall posts
 * @param canPost Information whether current user can post on the user's wall
 * @param canSeeAllPosts Information whether current user can see other users' audio on the wall
 * @param canSeeAudio Information whether current user can see the user's audio
 * @param email 
 * @param skype 
 * @param facebook 
 * @param facebookName 
 * @param twitter 
 * @param livejournal 
 * @param instagram 
 * @param test 
 * @param videoLive 
 * @param isVideoLiveNotificationsBlocked 
 * @param isService 
 * @param serviceDescription 
 * @param photoRec 
 * @param photoMedium 
 * @param photoMediumRec 
 * @param photo 
 * @param photoBig 
 * @param photo400 
 * @param photoMaxSize 
 * @param language 
 * @param storiesArchiveCount 
 * @param hasUnseenStories 
 * @param wallDefault 
 * @param canCall Information whether current user can call
 * @param canCallFromGroup Information whether group can call user
 * @param canSeeWishes Information whether current user can see the user's wishes
 * @param canSeeGifts Information whether current user can see the user's gifts
 * @param interests 
 * @param books 
 * @param tv 
 * @param quotes 
 * @param about 
 * @param games 
 * @param movies 
 * @param activities 
 * @param music 
 * @param canWritePrivateMessage Information whether current user can write private message
 * @param canSendFriendRequest Information whether current user can send a friend request
 * @param canBeInvitedGroup Information whether current user can be invited to the community
 * @param mobilePhone User's mobile phone number
 * @param homePhone User's additional phone number
 * @param site User's website
 * @param statusAudio 
 * @param status User's status
 * @param activity User's status
 * @param statusApp 
 * @param lastSeen 
 * @param exports 
 * @param cropPhoto 
 * @param followersCount Number of user's followers
 * @param videoLiveLevel User level in live streams achievements
 * @param videoLiveCount Number of user's live streams
 * @param clipsCount Number of user's clips
 * @param blacklisted Information whether current user is in the requested user's blacklist.
 * @param blacklistedByMe Information whether the requested user is in current user's blacklist
 * @param isFavorite Information whether the requested user is in faves of current user
 * @param isHiddenFromFeed Information whether the requested user is hidden from current user's newsfeed
 * @param commonCount Number of common friends with current user
 * @param occupation 
 * @param career 
 * @param military 
 * @param university University ID
 * @param universityName University name
 * @param universityGroupId 
 * @param faculty Faculty ID
 * @param facultyName Faculty name
 * @param graduation Graduation year
 * @param educationForm Education form
 * @param educationStatus User's education status
 * @param homeTown User hometown
 * @param relation User relationship status
 * @param relationPartner 
 * @param personal 
 * @param universities 
 * @param schools 
 * @param relatives 
 * @param isSubscribedPodcasts Information whether current user is subscribed to podcasts
 * @param canSubscribePodcasts Owner in whitelist or not
 * @param canSubscribePosts Can subscribe to wall
 * @param counters 
 * @param accessKey 
 * @param canUploadDoc 
 * @param canBan Information whether the user can be baned (added to black list) by me
 * @param hash 
 * @param isNoIndex Access to user profile is restricted for search engines
 * @param contactId Contact person ID
 * @param isMessageRequest 
 * @param descriptions 
 * @param lists 
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
data class UsersUserXtrType (
    @SerialName("id") val id: Long,
    @SerialName("tv") val tv: String? = null,
    @SerialName("sex") val sex: BaseSex? = null,
    @SerialName("hash") val hash: String? = null,
    @SerialName("site") val site: String? = null,
    @SerialName("hidden") val hidden: Int? = null,
    @SerialName("about") val about: String? = null,
    @SerialName("bdate") val bdate: String? = null,
    @SerialName("books") val books: String? = null,
    @SerialName("city") val city: BaseCity? = null,
    @SerialName("email") val email: String? = null,
    @SerialName("games") val games: String? = null,
    @SerialName("music") val music: String? = null,
    @SerialName("photo") val photo: String? = null,
    @SerialName("skype") val skype: String? = null,
    @SerialName("faculty") val faculty: Int? = null,
    @SerialName("domain") val domain: String? = null,
    @SerialName("movies") val movies: String? = null,
    @SerialName("quotes") val quotes: String? = null,
    @SerialName("status") val status: String? = null,
    @SerialName("lists") val lists: List<Int>? = null,
    @SerialName("test") val test: BaseBoolInt? = null,
    @SerialName("can_ban") val canBan: Boolean? = null,
    @SerialName("twitter") val twitter: String? = null,
    @SerialName("photo_50") val photo50: String? = null,
    @SerialName("photo_id") val photoId: String? = null,
    @SerialName("type") val type: UsersUserType? = null,
    @SerialName("activity") val activity: String? = null,
    @SerialName("can_call") val canCall: Boolean? = null,
    @SerialName("facebook") val facebook: String? = null,
    @SerialName("language") val language: String? = null,
    @SerialName("nickname") val nickname: String? = null,
    @SerialName("online_app") val onlineApp: Int? = null,
    @SerialName("timezone") val timezone: Double? = null,
    @SerialName("contact_id") val contactId: Long? = null,
    @SerialName("graduation") val graduation: Int? = null,
    @SerialName("home_town") val homeTown: String? = null,
    @SerialName("last_name") val lastName: String? = null,
    @SerialName("online") val online: BaseBoolInt? = null,
    @SerialName("photo_100") val photo100: String? = null,
    @SerialName("photo_200") val photo200: String? = null,
    @SerialName("photo_400") val photo400: String? = null,
    @SerialName("photo_big") val photoBig: String? = null,
    @SerialName("photo_max") val photoMax: String? = null,
    @SerialName("university") val university: Int? = null,
    @SerialName("clips_count") val clipsCount: Int? = null,
    @SerialName("instagram") val instagram: String? = null,
    @SerialName("interests") val interests: String? = null,
    @SerialName("is_closed") val isClosed: Boolean? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("country") val country: BaseCountry? = null,
    @SerialName("first_name") val firstName: String? = null,
    @SerialName("home_phone") val homePhone: String? = null,
    @SerialName("activities") val activities: String? = null,
    @SerialName("can_post") val canPost: BaseBoolInt? = null,
    @SerialName("common_count") val commonCount: Int? = null,
    @SerialName("exports") val exports: UsersExports? = null,
    @SerialName("is_service") val isService: Boolean? = null,
    @SerialName("is_no_index") val isNoIndex: Boolean? = null,
    @SerialName("maiden_name") val maidenName: String? = null,
    @SerialName("screen_name") val screenName: String? = null,
    @SerialName("trending") val trending: BaseBoolInt? = null,
    @SerialName("verified") val verified: BaseBoolInt? = null,
    @SerialName("deactivated") val deactivated: String? = null,
    @SerialName("has_photo") val hasPhoto: BaseBoolInt? = null,
    @SerialName("is_friend") val isFriend: BaseBoolInt? = null,
    @SerialName("livejournal") val livejournal: String? = null,
    @SerialName("career") val career: List<UsersCareer>? = null,
    @SerialName("contact_name") val contactName: String? = null,
    @SerialName("faculty_name") val facultyName: String? = null,
    @SerialName("mobile_phone") val mobilePhone: String? = null,
    @SerialName("personal") val personal: UsersPersonal? = null,
    @SerialName("status_app") val statusApp: AppsAppMin? = null,
    @SerialName("wall_default") val wallDefault: String? = null,
    @SerialName("has_mobile") val hasMobile: BaseBoolInt? = null,
    @SerialName("last_name_abl") val lastNameAbl: String? = null,
    @SerialName("last_name_acc") val lastNameAcc: String? = null,
    @SerialName("last_name_dat") val lastNameDat: String? = null,
    @SerialName("last_name_gen") val lastNameGen: String? = null,
    @SerialName("last_name_ins") val lastNameIns: String? = null,
    @SerialName("last_name_nom") val lastNameNom: String? = null,
    @SerialName("last_seen") val lastSeen: UsersLastSeen? = null,
    @SerialName("facebook_name") val facebookName: String? = null,
    @SerialName("owner_state") val ownerState: OwnerState? = null,
    @SerialName("schools") val schools: List<UsersSchool>? = null,
    @SerialName("crop_photo") val cropPhoto: BaseCropPhoto? = null,
    @SerialName("first_name_abl") val firstNameAbl: String? = null,
    @SerialName("first_name_acc") val firstNameAcc: String? = null,
    @SerialName("first_name_dat") val firstNameDat: String? = null,
    @SerialName("first_name_gen") val firstNameGen: String? = null,
    @SerialName("first_name_ins") val firstNameIns: String? = null,
    @SerialName("first_name_nom") val firstNameNom: String? = null,
    @SerialName("followers_count") val followersCount: Int? = null,
    @SerialName("is_favorite") val isFavorite: BaseBoolInt? = null,
    @SerialName("photo_200_orig") val photo200Orig: String? = null,
    @SerialName("photo_400_orig") val photo400Orig: String? = null,
    @SerialName("photo_max_orig") val photoMaxOrig: String? = null,
    @SerialName("video_live") val videoLive: VideoLiveInfo? = null,
    @SerialName("blacklisted") val blacklisted: BaseBoolInt? = null,
    @SerialName("can_see_wishes") val canSeeWishes: Boolean? = null,
    @SerialName("counters") val counters: UsersUserCounters? = null,
    @SerialName("education_form") val educationForm: String? = null,
    @SerialName("is_best_friend") val isBestFriend: Boolean? = null,
    @SerialName("mutual") val mutual: FriendsRequestsMutual? = null,
    @SerialName("relation") val relation: UsersUserRelation? = null,
    @SerialName("status_audio") val statusAudio: AudioAudio? = null,
    @SerialName("video_live_count") val videoLiveCount: Int? = null,
    @SerialName("video_live_level") val videoLiveLevel: Int? = null,
    @SerialName("can_see_audio") val canSeeAudio: BaseBoolInt? = null,
    @SerialName("can_see_gifts") val canSeeGifts: BaseBoolInt? = null,
    @SerialName("military") val military: List<UsersMilitary>? = null,
    @SerialName("occupation") val occupation: UsersOccupation? = null,
    @SerialName("university_name") val universityName: String? = null,
    @SerialName("descriptions") val descriptions: List<String>? = null,
    @SerialName("online_info") val onlineInfo: UsersOnlineInfo? = null,
    @SerialName("online_mobile") val onlineMobile: BaseBoolInt? = null,
    @SerialName("wall_comments") val wallComments: BaseBoolInt? = null,
    @SerialName("can_upload_doc") val canUploadDoc: BaseBoolInt? = null,
    @SerialName("education_status") val educationStatus: String? = null,
    @SerialName("photo_max_size") val photoMaxSize: PhotosPhoto? = null,
    @SerialName("photo_rec") val photoRec: PhotosPhotoFalseable? = null,
    @SerialName("relatives") val relatives: List<UsersRelative>? = null,
    @SerialName("can_access_closed") val canAccessClosed: Boolean? = null,
    @SerialName("university_group_id") val universityGroupId: Long? = null,
    @SerialName("has_unseen_stories") val hasUnseenStories: Boolean? = null,
    @SerialName("is_message_request") val isMessageRequest: Boolean? = null,
    @SerialName("can_call_from_group") val canCallFromGroup: Boolean? = null,
    @SerialName("can_see_all_posts") val canSeeAllPosts: BaseBoolInt? = null,
    @SerialName("blacklisted_by_me") val blacklistedByMe: BaseBoolInt? = null,
    @SerialName("can_subscribe_posts") val canSubscribePosts: Boolean? = null,
    @SerialName("photo_medium") val photoMedium: PhotosPhotoFalseable? = null,
    @SerialName("relation_partner") val relationPartner: UsersUserMin? = null,
    @SerialName("service_description") val serviceDescription: String? = null,
    @SerialName("stories_archive_count") val storiesArchiveCount: Int? = null,
    @SerialName("can_be_invited_group") val canBeInvitedGroup: Boolean? = null,
    @SerialName("universities") val universities: List<UsersUniversity>? = null,
    @SerialName("is_hidden_from_feed") val isHiddenFromFeed: BaseBoolInt? = null,
    @SerialName("can_subscribe_podcasts") val canSubscribePodcasts: Boolean? = null,
    @SerialName("is_subscribed_podcasts") val isSubscribedPodcasts: Boolean? = null,
    @SerialName("friend_status") val friendStatus: FriendsFriendStatusStatus? = null,
    @SerialName("photo_medium_rec") val photoMediumRec: PhotosPhotoFalseable? = null,
    @SerialName("can_send_friend_request") val canSendFriendRequest: BaseBoolInt? = null,
    @SerialName("can_write_private_message") val canWritePrivateMessage: BaseBoolInt? = null,
    @SerialName("is_video_live_notifications_blocked") val isVideoLiveNotificationsBlocked: BaseBoolInt? = null,
)
