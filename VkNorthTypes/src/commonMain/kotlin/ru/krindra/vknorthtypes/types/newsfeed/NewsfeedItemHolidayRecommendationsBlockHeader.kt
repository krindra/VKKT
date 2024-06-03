package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseImage
import ru.krindra.vknorthtypes.types.base.BaseLinkButtonAction

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
