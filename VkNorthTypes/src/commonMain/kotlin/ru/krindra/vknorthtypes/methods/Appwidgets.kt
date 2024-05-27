package ru.krindra.vknorthtypes.methods

import ru.krindra.vknorthtypes.types.appWidgets.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.base.BaseOkResponse

class Appwidgets(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Returns a URL for uploading a photo to the community collection for community app widgets
     * 
     * @param imageType 
     */
    suspend fun getAppImageUploadServer(imageType: String): AppWidgetsGetAppImageUploadServerResponse {
        val response = method("appWidgets.getAppImageUploadServer", mapOf("image_type" to imageType))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns an app collection of images for community app widgets
     * 
     * @param offset Offset needed to return a specific subset of images.
     * @param count Maximum count of results.
     * @param imageType 
     */
    suspend fun getAppImages(offset: Int? = null, count: Int? = 20, imageType: String? = null): AppWidgetsGetAppImagesResponse {
        val response = method("appWidgets.getAppImages", mapOf("offset" to offset, "count" to count, "image_type" to imageType))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a URL for uploading a photo to the community collection for community app widgets
     * 
     * @param imageType 
     */
    suspend fun getGroupImageUploadServer(imageType: String): AppWidgetsGetGroupImageUploadServerResponse {
        val response = method("appWidgets.getGroupImageUploadServer", mapOf("image_type" to imageType))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a community collection of images for community app widgets
     * 
     * @param offset Offset needed to return a specific subset of images.
     * @param count Maximum count of results.
     * @param imageType 
     */
    suspend fun getGroupImages(offset: Int? = null, count: Int? = 20, imageType: String? = null): AppWidgetsGetGroupImagesResponse {
        val response = method("appWidgets.getGroupImages", mapOf("offset" to offset, "count" to count, "image_type" to imageType))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns an image for community app widgets by its ID
     * 
     * @param images List of images IDs.
     */
    suspend fun getImagesById(images: List<String>): AppWidgetsGetImagesByIdResponse {
        val response = method("appWidgets.getImagesById", mapOf("images" to images))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to save image into app collection for community app widgets
     * 
     * @param hash Parameter returned when photo is uploaded to server.
     * @param image Parameter returned when photo is uploaded to server.
     */
    suspend fun saveAppImage(hash: String, image: String): AppWidgetsSaveAppImageResponse {
        val response = method("appWidgets.saveAppImage", mapOf("hash" to hash, "image" to image))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to save image into community collection for community app widgets
     * 
     * @param hash Parameter returned when photo is uploaded to server.
     * @param image Parameter returned when photo is uploaded to server.
     */
    suspend fun saveGroupImage(hash: String, image: String): AppWidgetsSaveGroupImageResponse {
        val response = method("appWidgets.saveGroupImage", mapOf("hash" to hash, "image" to image))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to update community app widget
     * 
     * @param code 
     * @param type 
     */
    suspend fun update(code: String, type: String): BaseOkResponse {
        val response = method("appWidgets.update", mapOf("code" to code, "type" to type))
        return decodeResponse(response, json)
    }

}
