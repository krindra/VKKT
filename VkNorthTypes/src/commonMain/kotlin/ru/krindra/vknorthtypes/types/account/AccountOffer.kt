package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param description Offer description
 * @param id Offer ID
 * @param img URL of the preview image
 * @param instruction Instruction how to process the offer
 * @param instructionHtml Instruction how to process the offer (HTML format)
 * @param price Offer price
 * @param shortDescription Offer short description
 * @param tag Offer tag
 * @param title Offer title
 * @param currencyAmount Currency amount
 * @param linkId Link id
 * @param linkType Link type
 */
@Serializable
data class AccountOffer (
    @SerialName("link_id") val linkId: Long? = null,
    @SerialName("tag") val tag: String? = null,
    @SerialName("currency_amount") val currencyAmount: Double? = null,
    @SerialName("short_description") val shortDescription: String? = null,
    @SerialName("img") val img: String? = null,
    @SerialName("id") val id: Long? = null,
    @SerialName("price") val price: Int? = null,
    @SerialName("link_type") val linkType: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("instruction_html") val instructionHtml: String? = null,
    @SerialName("instruction") val instruction: String? = null,
)
