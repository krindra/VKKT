package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Story id
 * @param ownerId Owner id
 * @param rawId Story raw id
 * @param date Date
 * @param time Time
 * @param type Type
 * @param unread Is unread
 * @param canLike Can like
 * @param canComment Can comment
 * @param canShare Can share
 * @param canRemove Can remove
 * @param canManage Can manage
 * @param canAsk Can ask
 * @param canAskAnonymous Can ask anonymous
 * @param isProfileQuestion Is profile question
 * @param stats 
 * @param link 
 * @param photoUrl Photo url
 * @param previewUrl Preview url
 * @param trackCode Track code
 * @param isPartOfNarrative Is part of narrative
 * @param isAds Is ads
 * @param videoUrl Video url
 * @param firstFrame First frame
 * @param smallPreview Small preview
 * @param isLiked Is liked
 */
@Serializable
data class AdsStoryItem (
    @SerialName("stats") val stats: AdsStoryItemStats? = null,
    @SerialName("preview_url") val previewUrl: String? = null,
    @SerialName("isAds") val isAds: Boolean? = null,
    @SerialName("date") val date: String? = null,
    @SerialName("id") val id: Long? = null,
    @SerialName("isLiked") val isLiked: Boolean? = null,
    @SerialName("isPartOfNarrative") val isPartOfNarrative: Boolean? = null,
    @SerialName("can_ask") val canAsk: Boolean? = null,
    @SerialName("first_frame") val firstFrame: String? = null,
    @SerialName("link") val link: AdsStoryItemLink? = null,
    @SerialName("can_comment") val canComment: Boolean? = null,
    @SerialName("can_manage") val canManage: Boolean? = null,
    @SerialName("can_share") val canShare: Boolean? = null,
    @SerialName("unread") val unread: Boolean? = null,
    @SerialName("isProfileQuestion") val isProfileQuestion: Boolean? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("time") val time: Int? = null,
    @SerialName("photo_url") val photoUrl: String? = null,
    @SerialName("can_remove") val canRemove: Boolean? = null,
    @SerialName("raw_id") val rawId: String? = null,
    @SerialName("canLike") val canLike: Boolean? = null,
    @SerialName("small_preview") val smallPreview: String? = null,
    @SerialName("owner_id") val ownerId: Long? = null,
    @SerialName("can_ask_anonymous") val canAskAnonymous: Boolean? = null,
    @SerialName("track_code") val trackCode: String? = null,
    @SerialName("video_url") val videoUrl: String? = null,
)
