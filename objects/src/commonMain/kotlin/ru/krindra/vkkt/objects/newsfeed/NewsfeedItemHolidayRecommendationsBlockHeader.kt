package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseImage
import ru.krindra.vkkt.objects.base.BaseLinkButtonAction

/**
 *
 * @param title Title of the header
 * @param subtitle Subtitle of the header
 * @param image 
 * @param action 
 */
@Serializable
data class NewsfeedItemHolidayRecommendationsBlockHeader (
    @SerialName("title") val title: String? = null,
    @SerialName("subtitle") val subtitle: String? = null,
    @SerialName("image") val image: List<BaseImage>? = null,
    @SerialName("action") val action: BaseLinkButtonAction? = null,
)
