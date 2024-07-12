package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.store.*
import ru.krindra.vkkt.objects.store.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseOkResponse

class Store(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Adds given sticker IDs to the list of user's favorite stickers
     * 
     * @param stickerIds Sticker IDs to be added.
     */
    suspend fun addStickersToFavorite(stickerIds: List<Int>): BaseOkResponse {
        val response = method("store.addStickersToFavorite", mapOf("sticker_ids" to stickerIds))
        return decodeResponse(response, json)
    }

    /**
     *
     */
    suspend fun getFavoriteStickers(): StoreGetFavoriteStickersResponse {
        val response = method("store.getFavoriteStickers", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * @param type 
     * @param merchant 
     * @param section 
     * @param productIds 
     * @param filters 
     * @param extended 
     */
    suspend fun getProducts(type: String? = null, merchant: String? = null, section: String? = null, productIds: List<Int>? = null, filters: List<String>? = null, extended: Boolean? = false): StoreGetProductsResponse {
        val response = method("store.getProducts", mapOf("type" to type, "merchant" to merchant, "section" to section, "product_ids" to productIds, "filters" to filters, "extended" to extended))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param stickersIds 
     * @param productsIds 
     * @param aliases 
     * @param allProducts 
     * @param needStickers 
     */
    suspend fun getStickersKeywords(stickersIds: List<Int>? = null, productsIds: List<Int>? = null, aliases: Boolean? = true, allProducts: Boolean? = false, needStickers: Boolean? = true): StoreGetStickersKeywordsResponse {
        val response = method("store.getStickersKeywords", mapOf("stickers_ids" to stickersIds, "products_ids" to productsIds, "aliases" to aliases, "all_products" to allProducts, "need_stickers" to needStickers))
        return decodeResponse(response, json)
    }

    /**
     *
     * Removes given sticker IDs from the list of user's favorite stickers
     * 
     * @param stickerIds Sticker IDs to be removed.
     */
    suspend fun removeStickersFromFavorite(stickerIds: List<Int>): BaseOkResponse {
        val response = method("store.removeStickersFromFavorite", mapOf("sticker_ids" to stickerIds))
        return decodeResponse(response, json)
    }

}
