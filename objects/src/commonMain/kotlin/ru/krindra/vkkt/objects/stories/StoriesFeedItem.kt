package ru.krindra.vkkt.objects.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.apps.AppsAppMin

/**
 *
 * @param type Type of Feed Item
 * @param id 
 * @param ownerId 
 * @param stories Author stories
 * @param grouped Grouped stories of various authors (for types community_grouped_stories/app_grouped_stories type)
 * @param app App, which stories has been grouped (for type app_grouped_stories)
 * @param promoData Additional data for promo stories (for type promo_stories)
 * @param trackCode 
 * @param hasUnseen 
 * @param name 
 */
@Serializable
data class StoriesFeedItem (
    @SerialName("type") val type: String,
    @SerialName("id") val id: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("app") val app: AppsAppMin? = null,
    @SerialName("owner_id") val ownerId: Int? = null,
    @SerialName("track_code") val trackCode: String? = null,
    @SerialName("has_unseen") val hasUnseen: Boolean? = null,
    @SerialName("stories") val stories: List<StoriesStory>? = null,
    @SerialName("grouped") val grouped: List<StoriesFeedItem>? = null,
    @SerialName("promo_data") val promoData: StoriesPromoBlock? = null,
)
