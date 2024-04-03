package ru.krindra.vknorthtypes.methods

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********


import ru.krindra.vknorthtypes.types.store.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.base.BaseOkResponse

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
        val response = method("addStickersToFavorite", mapOf("sticker_ids" to stickerIds))
        return json.decodeFromString<BaseOkResponse>(response)
    }

    /**
     *
     */
    suspend fun getFavoriteStickers(): StoreGetFavoriteStickersResponse {
        val response = method("getFavoriteStickers", mapOf())
        return json.decodeFromString<StoreGetFavoriteStickersResponse>(response)
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
        val response = method("getProducts", mapOf("type" to type, "merchant" to merchant, "section" to section, "product_ids" to productIds, "filters" to filters, "extended" to extended))
        return json.decodeFromString<StoreGetProductsResponse>(response)
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
        val response = method("getStickersKeywords", mapOf("stickers_ids" to stickersIds, "products_ids" to productsIds, "aliases" to aliases, "all_products" to allProducts, "need_stickers" to needStickers))
        return json.decodeFromString<StoreGetStickersKeywordsResponse>(response)
    }

    /**
     *
     * Removes given sticker IDs from the list of user's favorite stickers
     * 
     * @param stickerIds Sticker IDs to be removed.
     */
    suspend fun removeStickersFromFavorite(stickerIds: List<Int>): BaseOkResponse {
        val response = method("removeStickersFromFavorite", mapOf("sticker_ids" to stickerIds))
        return json.decodeFromString<BaseOkResponse>(response)
    }

}
