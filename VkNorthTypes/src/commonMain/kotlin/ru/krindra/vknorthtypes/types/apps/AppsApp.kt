package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param authorUrl Application author's URL
 * @param banner1120 URL of the app banner with 1120 px in width
 * @param banner560 URL of the app banner with 560 px in width
 * @param icon16 URL of the app icon with 16 px in width
 * @param isNew Is new flag
 * @param pushEnabled Is push enabled
 * @param friends 
 * @param catalogPosition Catalog position
 * @param description Application description
 * @param genre Genre name
 * @param genreId Genre ID
 * @param international Information whether the application is multilanguage
 * @param isInCatalog Information whether application is in mobile catalog
 * @param leaderboardType 
 * @param membersCount Members number
 * @param platformId Application ID in store
 * @param publishedDate Date when the application has been published in Unixtime
 * @param screenName Screen name
 * @param section Application section name
 * @param type 
 * @param id Application ID
 * @param title Application title
 * @param authorOwnerId Application author's ID
 * @param isInstalled Is application installed
 * @param icon139 URL of the app icon with 139 px in width
 * @param icon150 URL of the app icon with 150 px in width
 * @param icon278 URL of the app icon with 278 px in width
 * @param icon576 URL of the app icon with 576 px in width
 * @param backgroundLoaderColor Hex color code without hash sign
 * @param loaderIcon SVG data
 * @param icon75 URL of the app icon with 75 px in width
 * @param screenOrientation Screen orientation
 */
@Serializable
data class AppsApp (
    @SerialName("screen_orientation") val screenOrientation: Int? = null,
    @SerialName("international") val international: Boolean? = null,
    @SerialName("friends") val friends: List<Int>? = null,
    @SerialName("loader_icon") val loaderIcon: String? = null,
    @SerialName("banner_560") val banner560: String? = null,
    @SerialName("icon_576") val icon576: String? = null,
    @SerialName("is_installed") val isInstalled: Boolean? = null,
    @SerialName("author_url") val authorUrl: String? = null,
    @SerialName("icon_139") val icon139: String? = null,
    @SerialName("icon_75") val icon75: String? = null,
    @SerialName("title") val title: String,
    @SerialName("icon_150") val icon150: String? = null,
    @SerialName("is_in_catalog") val isInCatalog: Int? = null,
    @SerialName("genre") val genre: String? = null,
    @SerialName("leaderboard_type") val leaderboardType: AppsAppLeaderboardType? = null,
    @SerialName("members_count") val membersCount: Int? = null,
    @SerialName("catalog_position") val catalogPosition: Int? = null,
    @SerialName("type") val type: AppsAppType,
    @SerialName("is_new") val isNew: BaseBoolInt? = null,
    @SerialName("background_loader_color") val backgroundLoaderColor: String? = null,
    @SerialName("screen_name") val screenName: String? = null,
    @SerialName("id") val id: Long,
    @SerialName("genre_id") val genreId: Long? = null,
    @SerialName("author_owner_id") val authorOwnerId: Long? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("icon_16") val icon16: String? = null,
    @SerialName("push_enabled") val pushEnabled: BaseBoolInt? = null,
    @SerialName("section") val section: String? = null,
    @SerialName("platform_id") val platformId: String? = null,
    @SerialName("icon_278") val icon278: String? = null,
    @SerialName("banner_1120") val banner1120: String? = null,
    @SerialName("published_date") val publishedDate: Int? = null,
)
