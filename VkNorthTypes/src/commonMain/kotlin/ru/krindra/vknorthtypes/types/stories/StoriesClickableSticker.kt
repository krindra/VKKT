package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseLink
import ru.krindra.vknorthtypes.types.audio.AudioAudio
import ru.krindra.vknorthtypes.types.polls.PollsPoll
import ru.krindra.vknorthtypes.types.apps.AppsAppMin
import ru.krindra.vknorthtypes.types.market.MarketMarketItem

/**
 *
 * @param clickableArea 
 * @param id Clickable sticker ID
 * @param hashtag 
 * @param linkObject 
 * @param mention 
 * @param tooltipText 
 * @param ownerId 
 * @param storyId 
 * @param clipId 
 * @param question 
 * @param questionButton 
 * @param placeId 
 * @param marketItem 
 * @param audio 
 * @param audioStartTime 
 * @param style 
 * @param type 
 * @param subtype 
 * @param postOwnerId 
 * @param postId 
 * @param poll 
 * @param color Color, hex format
 * @param stickerId Sticker ID
 * @param stickerPackId Sticker pack ID
 * @param app 
 * @param appContext Additional context for app sticker
 * @param hasNewInteractions Whether current user has unread interaction with this app
 * @param isBroadcastNotifyAllowed Whether current user allowed broadcast notify from this app
 * @param situationalThemeId 
 * @param situationalAppUrl 
 */
@Serializable
data class StoriesClickableSticker (
    @SerialName("audio_start_time") val audioStartTime: Int? = null,
    @SerialName("link_object") val linkObject: BaseLink? = null,
    @SerialName("post_owner_id") val postOwnerId: Long? = null,
    @SerialName("poll") val poll: PollsPoll? = null,
    @SerialName("has_new_interactions") val hasNewInteractions: Boolean? = null,
    @SerialName("market_item") val marketItem: MarketMarketItem? = null,
    @SerialName("story_id") val storyId: Long? = null,
    @SerialName("sticker_id") val stickerId: Long? = null,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("tooltip_text") val tooltipText: String? = null,
    @SerialName("mention") val mention: String? = null,
    @SerialName("style") val style: String? = null,
    @SerialName("id") val id: Long,
    @SerialName("hashtag") val hashtag: String? = null,
    @SerialName("clickable_area") val clickableArea: List<StoriesClickableArea>,
    @SerialName("situational_theme_id") val situationalThemeId: Long? = null,
    @SerialName("audio") val audio: AudioAudio? = null,
    @SerialName("type") val type: String,
    @SerialName("subtype") val subtype: String? = null,
    @SerialName("sticker_pack_id") val stickerPackId: Long? = null,
    @SerialName("situational_app_url") val situationalAppUrl: String? = null,
    @SerialName("clip_id") val clipId: Long? = null,
    @SerialName("place_id") val placeId: Long? = null,
    @SerialName("is_broadcast_notify_allowed") val isBroadcastNotifyAllowed: Boolean? = null,
    @SerialName("app") val app: AppsAppMin? = null,
    @SerialName("question") val question: String? = null,
    @SerialName("owner_id") val ownerId: Long? = null,
    @SerialName("question_button") val questionButton: String? = null,
    @SerialName("app_context") val appContext: String? = null,
    @SerialName("color") val color: String? = null,
)
