package ru.krindra.vknorthtypes.types.store

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.base.BaseImage
import ru.krindra.vknorthtypes.types.base.BaseStickersList

/**
 *
 * @param id Id of the product
 * @param type Product type
 * @param isNew Information whether sticker product wasn't used after being purchased
 * @param copyright Product copyright information
 * @param baseId Id of the base pack (for sticker pack styles)
 * @param styleIds Array of style ids available for the sticker pack
 * @param purchased Information whether the product is purchased (1 - yes, 0 - no)
 * @param active Information whether the product is active (1 - yes, 0 - no)
 * @param promoted Information whether the product is promoted (1 - yes, 0 - no)
 * @param purchaseDate Date (Unix time) when the product was purchased
 * @param title Title of the product
 * @param stickers 
 * @param styleStickerIds Array of style sticker ids (for sticker pack styles)
 * @param icon Array of icon images or icon set object of the product (for stickers product type)
 * @param previews Array of preview images of the product (for stickers product type)
 * @param hasAnimation Information whether the product is an animated sticker pack (for stickers product type)
 * @param subtitle Subtitle of the product
 * @param paymentRegion 
 * @param isVmoji Information whether sticker pack is a vmoji pack
 * @param titleLangKey 
 * @param descriptionLangKey 
 * @param url 
 */
@Serializable
data class StoreProduct (
    @SerialName("id") val id: Long,
    @SerialName("type") val type: String,
    @SerialName("url") val url: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("base_id") val baseId: Long? = null,
    @SerialName("is_new") val isNew: Boolean? = null,
    @SerialName("is_vmoji") val isVmoji: Boolean? = null,
    @SerialName("subtitle") val subtitle: String? = null,
    @SerialName("active") val active: BaseBoolInt? = null,
    @SerialName("copyright") val copyright: String? = null,
    @SerialName("icon") val icon: StoreProductIcon? = null,
    @SerialName("style_ids") val styleIds: List<Int>? = null,
    @SerialName("promoted") val promoted: BaseBoolInt? = null,
    @SerialName("purchase_date") val purchaseDate: Int? = null,
    @SerialName("purchased") val purchased: BaseBoolInt? = null,
    @SerialName("previews") val previews: List<BaseImage>? = null,
    @SerialName("has_animation") val hasAnimation: Boolean? = null,
    @SerialName("stickers") val stickers: BaseStickersList? = null,
    @SerialName("title_lang_key") val titleLangKey: String? = null,
    @SerialName("payment_region") val paymentRegion: String? = null,
    @SerialName("style_sticker_ids") val styleStickerIds: List<Int>? = null,
    @SerialName("description_lang_key") val descriptionLangKey: String? = null,
)
