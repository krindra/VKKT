package ru.krindra.vknorthtypes.types.prettyCards

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseImage

/**
 *
 * @param button Button key
 * @param buttonText Button text in current language
 * @param cardId Card ID (long int returned as string)
 * @param images 
 * @param linkUrl Link URL
 * @param photo Photo ID (format "<owner_id>_<media_id>")
 * @param price Price if set (decimal number returned as string)
 * @param priceOld Old price if set (decimal number returned as string)
 * @param title Title
 */
@Serializable
data class PrettyCardsPrettyCard (
    @SerialName("photo") val photo: String,
    @SerialName("title") val title: String,
    @SerialName("card_id") val cardId: String,
    @SerialName("link_url") val linkUrl: String,
    @SerialName("price") val price: String? = null,
    @SerialName("price_old") val priceOld: String? = null,
    @SerialName("button_text") val buttonText: String? = null,
    @SerialName("images") val images: List<BaseImage>? = null,
    @SerialName("button") val button: PrettyCardsButtonOneOf? = null,
)
