package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.prettyCards.*
import ru.krindra.vkkt.objects.prettyCards.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json

class Prettycards(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param ownerId 
     * @param photo 
     * @param title 
     * @param link 
     * @param price 
     * @param priceOld 
     * @param button 
     */
    suspend fun create(ownerId: Int, photo: String, title: String, link: String, price: String? = null, priceOld: String? = null, button: String? = null): PrettyCardsCreateResponse {
        val response = method("prettyCards.create", mapOf("owner_id" to ownerId, "photo" to photo, "title" to title, "link" to link, "price" to price, "price_old" to priceOld, "button" to button))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param ownerId 
     * @param cardId 
     */
    suspend fun delete(ownerId: Int, cardId: Int): PrettyCardsDeleteResponse {
        val response = method("prettyCards.delete", mapOf("owner_id" to ownerId, "card_id" to cardId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param ownerId 
     * @param cardId 
     * @param photo 
     * @param title 
     * @param link 
     * @param price 
     * @param priceOld 
     * @param button 
     */
    suspend fun edit(ownerId: Int, cardId: Int, photo: String? = null, title: String? = null, link: String? = null, price: String? = null, priceOld: String? = null, button: String? = null): PrettyCardsEditResponse {
        val response = method("prettyCards.edit", mapOf("owner_id" to ownerId, "card_id" to cardId, "photo" to photo, "title" to title, "link" to link, "price" to price, "price_old" to priceOld, "button" to button))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param ownerId 
     * @param offset 
     * @param count 
     */
    suspend fun get(ownerId: Int, offset: Int? = 0, count: Int? = 10): PrettyCardsGetResponse {
        val response = method("prettyCards.get", mapOf("owner_id" to ownerId, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param ownerId 
     * @param cardIds 
     */
    suspend fun getById(ownerId: Int, cardIds: List<Int>): PrettyCardsGetByIdResponse {
        val response = method("prettyCards.getById", mapOf("owner_id" to ownerId, "card_ids" to cardIds))
        return decodeResponse(response, json)
    }

    /**
     *
     */
    suspend fun getUploadURL(): PrettyCardsGetUploadURLResponse {
        val response = method("prettyCards.getUploadURL", mapOf())
        return decodeResponse(response, json)
    }

}
