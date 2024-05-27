package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class GroupsFields(val value: String){
    @SerialName("id") ID("id"),
    @SerialName("name") NAME("name"),
    @SerialName("screen_name") SCREEN_NAME("screen_name"),
    @SerialName("is_closed") IS_CLOSED("is_closed"),
    @SerialName("type") TYPE("type"),
    @SerialName("is_admin") IS_ADMIN("is_admin"),
    @SerialName("admin_level") ADMIN_LEVEL("admin_level"),
    @SerialName("is_member") IS_MEMBER("is_member"),
    @SerialName("is_advertiser") IS_ADVERTISER("is_advertiser"),
    @SerialName("start_date") START_DATE("start_date"),
    @SerialName("finish_date") FINISH_DATE("finish_date"),
    @SerialName("deactivated") DEACTIVATED("deactivated"),
    @SerialName("photo_50") PHOTO_50("photo_50"),
    @SerialName("photo_100") PHOTO_100("photo_100"),
    @SerialName("photo_200") PHOTO_200("photo_200"),
    @SerialName("photo_200_orig") PHOTO_200_ORIG("photo_200_orig"),
    @SerialName("photo_400") PHOTO_400("photo_400"),
    @SerialName("photo_400_orig") PHOTO_400_ORIG("photo_400_orig"),
    @SerialName("photo_max") PHOTO_MAX("photo_max"),
    @SerialName("photo_max_orig") PHOTO_MAX_ORIG("photo_max_orig"),
    @SerialName("est_date") EST_DATE("est_date"),
    @SerialName("public_date_label") PUBLIC_DATE_LABEL("public_date_label"),
    @SerialName("photo_max_size") PHOTO_MAX_SIZE("photo_max_size"),
    @SerialName("is_video_live_notifications_blocked") IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED("is_video_live_notifications_blocked"),
    @SerialName("video_live") VIDEO_LIVE("video_live"),
    @SerialName("market") MARKET("market"),
    @SerialName("member_status") MEMBER_STATUS("member_status"),
    @SerialName("is_adult") IS_ADULT("is_adult"),
    @SerialName("is_hidden_from_feed") IS_HIDDEN_FROM_FEED("is_hidden_from_feed"),
    @SerialName("is_favorite") IS_FAVORITE("is_favorite"),
    @SerialName("is_subscribed") IS_SUBSCRIBED("is_subscribed"),
    @SerialName("city") CITY("city"),
    @SerialName("country") COUNTRY("country"),
    @SerialName("verified") VERIFIED("verified"),
    @SerialName("description") DESCRIPTION("description"),
    @SerialName("wiki_page") WIKI_PAGE("wiki_page"),
    @SerialName("members_count") MEMBERS_COUNT("members_count"),
    @SerialName("members_count_text") MEMBERS_COUNT_TEXT("members_count_text"),
    @SerialName("requests_count") REQUESTS_COUNT("requests_count"),
    @SerialName("video_live_level") VIDEO_LIVE_LEVEL("video_live_level"),
    @SerialName("video_live_count") VIDEO_LIVE_COUNT("video_live_count"),
    @SerialName("clips_count") CLIPS_COUNT("clips_count"),
    @SerialName("textlives_count") TEXTLIVES_COUNT("textlives_count"),
    @SerialName("counters") COUNTERS("counters"),
    @SerialName("cover") COVER("cover"),
    @SerialName("can_post") CAN_POST("can_post"),
    @SerialName("can_suggest") CAN_SUGGEST("can_suggest"),
    @SerialName("can_upload_story") CAN_UPLOAD_STORY("can_upload_story"),
    @SerialName("can_upload_doc") CAN_UPLOAD_DOC("can_upload_doc"),
    @SerialName("can_upload_video") CAN_UPLOAD_VIDEO("can_upload_video"),
    @SerialName("can_upload_clip") CAN_UPLOAD_CLIP("can_upload_clip"),
    @SerialName("can_see_all_posts") CAN_SEE_ALL_POSTS("can_see_all_posts"),
    @SerialName("can_create_topic") CAN_CREATE_TOPIC("can_create_topic"),
    @SerialName("activity") ACTIVITY("activity"),
    @SerialName("fixed_post") FIXED_POST("fixed_post"),
    @SerialName("has_photo") HAS_PHOTO("has_photo"),
    @SerialName("crop_photo") CROP_PHOTO("crop_photo"),
    @SerialName("status") STATUS("status"),
    @SerialName("status_audio") STATUS_AUDIO("status_audio"),
    @SerialName("main_album_id") MAIN_ALBUM_ID("main_album_id"),
    @SerialName("links") LINKS("links"),
    @SerialName("contacts") CONTACTS("contacts"),
    @SerialName("wall") WALL("wall"),
    @SerialName("site") SITE("site"),
    @SerialName("main_section") MAIN_SECTION("main_section"),
    @SerialName("secondary_section") SECONDARY_SECTION("secondary_section"),
    @SerialName("trending") TRENDING("trending"),
    @SerialName("can_message") CAN_MESSAGE("can_message"),
    @SerialName("is_messages_blocked") IS_MESSAGES_BLOCKED("is_messages_blocked"),
    @SerialName("can_send_notify") CAN_SEND_NOTIFY("can_send_notify"),
    @SerialName("online_status") ONLINE_STATUS("online_status"),
    @SerialName("invited_by") INVITED_BY("invited_by"),
    @SerialName("age_limits") AGE_LIMITS("age_limits"),
    @SerialName("ban_info") BAN_INFO("ban_info"),
    @SerialName("has_market_app") HAS_MARKET_APP("has_market_app"),
    @SerialName("using_vkpay_market_app") USING_VKPAY_MARKET_APP("using_vkpay_market_app"),
    @SerialName("has_group_channel") HAS_GROUP_CHANNEL("has_group_channel"),
    @SerialName("addresses") ADDRESSES("addresses"),
    @SerialName("is_subscribed_podcasts") IS_SUBSCRIBED_PODCASTS("is_subscribed_podcasts"),
    @SerialName("can_subscribe_podcasts") CAN_SUBSCRIBE_PODCASTS("can_subscribe_podcasts"),
    @SerialName("can_subscribe_posts") CAN_SUBSCRIBE_POSTS("can_subscribe_posts"),
    @SerialName("live_covers") LIVE_COVERS("live_covers"),
    @SerialName("stories_archive_count") STORIES_ARCHIVE_COUNT("stories_archive_count"),
    @SerialName("has_unseen_stories") HAS_UNSEEN_STORIES("has_unseen_stories"),
    @SerialName("rating") RATING("rating"),
}
