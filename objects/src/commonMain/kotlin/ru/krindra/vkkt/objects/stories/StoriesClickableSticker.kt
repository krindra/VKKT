package ru.krindra.vkkt.objects.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseLink
import ru.krindra.vkkt.objects.audio.AudioAudio
import ru.krindra.vkkt.objects.polls.PollsPoll
import ru.krindra.vkkt.objects.market.MarketMarketItem
import ru.krindra.vkkt.objects.apps.AppsAppMin

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
    @SerialName("id") val id: Int,
    @SerialName("type") val type: String,
    @SerialName("app") val app: AppsAppMin? = null,
    @SerialName("color") val color: String? = null,
    @SerialName("style") val style: String? = null,
    @SerialName("clip_id") val clipId: Int? = null,
    @SerialName("poll") val poll: PollsPoll? = null,
    @SerialName("post_id") val postId: Int? = null,
    @SerialName("owner_id") val ownerId: Int? = null,
    @SerialName("place_id") val placeId: Int? = null,
    @SerialName("story_id") val storyId: Int? = null,
    @SerialName("audio") val audio: AudioAudio? = null,
    @SerialName("hashtag") val hashtag: String? = null,
    @SerialName("mention") val mention: String? = null,
    @SerialName("subtype") val subtype: String? = null,
    @SerialName("question") val question: String? = null,
    @SerialName("sticker_id") val stickerId: Int? = null,
    @SerialName("app_context") val appContext: String? = null,
    @SerialName("post_owner_id") val postOwnerId: Int? = null,
    @SerialName("link_object") val linkObject: BaseLink? = null,
    @SerialName("tooltip_text") val tooltipText: String? = null,
    @SerialName("sticker_pack_id") val stickerPackId: Int? = null,
    @SerialName("audio_start_time") val audioStartTime: Int? = null,
    @SerialName("question_button") val questionButton: String? = null,
    @SerialName("market_item") val marketItem: MarketMarketItem? = null,
    @SerialName("situational_app_url") val situationalAppUrl: String? = null,
    @SerialName("situational_theme_id") val situationalThemeId: Int? = null,
    @SerialName("clickable_area") val clickableArea: List<StoriesClickableArea>,
    @SerialName("has_new_interactions") val hasNewInteractions: Boolean? = null,
    @SerialName("is_broadcast_notify_allowed") val isBroadcastNotifyAllowed: Boolean? = null,
)
