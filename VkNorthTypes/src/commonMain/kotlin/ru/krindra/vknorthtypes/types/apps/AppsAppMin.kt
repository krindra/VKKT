package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
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
data class AppsAppMin (
    @SerialName("type") val type: AppsAppType,
    @SerialName("background_loader_color") val backgroundLoaderColor: String? = null,
    @SerialName("title") val title: String,
    @SerialName("icon_150") val icon150: String? = null,
    @SerialName("icon_75") val icon75: String? = null,
    @SerialName("id") val id: Long,
    @SerialName("screen_orientation") val screenOrientation: Int? = null,
    @SerialName("icon_278") val icon278: String? = null,
    @SerialName("author_owner_id") val authorOwnerId: Long? = null,
    @SerialName("icon_576") val icon576: String? = null,
    @SerialName("loader_icon") val loaderIcon: String? = null,
    @SerialName("is_installed") val isInstalled: Boolean? = null,
    @SerialName("icon_139") val icon139: String? = null,
)
