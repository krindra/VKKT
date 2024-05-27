package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * App fields available for response
 * 
 */
@Serializable
enum class AppsAppFields(val value: String){
    @SerialName("author_group") AUTHOR_GROUP("author_group"),
    @SerialName("author_id") AUTHOR_ID("author_id"),
    @SerialName("author_url") AUTHOR_URL("author_url"),
    @SerialName("banner_1120") BANNER_1120("banner_1120"),
    @SerialName("banner_560") BANNER_560("banner_560"),
    @SerialName("banner_186") BANNER_186("banner_186"),
    @SerialName("banner_896") BANNER_896("banner_896"),
    @SerialName("icon_16") ICON_16("icon_16"),
    @SerialName("icon_25") ICON_25("icon_25"),
    @SerialName("icon_50") ICON_50("icon_50"),
    @SerialName("icon_100") ICON_100("icon_100"),
    @SerialName("icon_200") ICON_200("icon_200"),
    @SerialName("icon_128") ICON_128("icon_128"),
    @SerialName("icon_256") ICON_256("icon_256"),
    @SerialName("is_new") IS_NEW("is_new"),
    @SerialName("new") NEW("new"),
    @SerialName("is_html5_app") IS_HTML5_APP("is_html5_app"),
    @SerialName("push_enabled") PUSH_ENABLED("push_enabled"),
    @SerialName("catalog_banner") CATALOG_BANNER("catalog_banner"),
    @SerialName("friends") FRIENDS("friends"),
    @SerialName("catalog_position") CATALOG_POSITION("catalog_position"),
    @SerialName("description") DESCRIPTION("description"),
    @SerialName("genre") GENRE("genre"),
    @SerialName("genre_id") GENRE_ID("genre_id"),
    @SerialName("international") INTERNATIONAL("international"),
    @SerialName("is_in_catalog") IS_IN_CATALOG("is_in_catalog"),
    @SerialName("installed") INSTALLED("installed"),
    @SerialName("leaderboard_type") LEADERBOARD_TYPE("leaderboard_type"),
    @SerialName("members_count") MEMBERS_COUNT("members_count"),
    @SerialName("platform_id") PLATFORM_ID("platform_id"),
    @SerialName("published_date") PUBLISHED_DATE("published_date"),
    @SerialName("screen_name") SCREEN_NAME("screen_name"),
    @SerialName("section") SECTION("section"),
    @SerialName("type") TYPE("type"),
    @SerialName("id") ID("id"),
    @SerialName("title") TITLE("title"),
    @SerialName("author_owner_id") AUTHOR_OWNER_ID("author_owner_id"),
    @SerialName("is_installed") IS_INSTALLED("is_installed"),
    @SerialName("icon_139") ICON_139("icon_139"),
    @SerialName("icon_150") ICON_150("icon_150"),
    @SerialName("icon_278") ICON_278("icon_278"),
    @SerialName("icon_576") ICON_576("icon_576"),
    @SerialName("background_loader_color") BACKGROUND_LOADER_COLOR("background_loader_color"),
    @SerialName("loader_icon") LOADER_ICON("loader_icon"),
    @SerialName("icon_75") ICON_75("icon_75"),
    @SerialName("open_in_external_browser") OPEN_IN_EXTERNAL_BROWSER("open_in_external_browser"),
    @SerialName("ad_config") AD_CONFIG("ad_config"),
    @SerialName("screen_orientation") SCREEN_ORIENTATION("screen_orientation"),
}
