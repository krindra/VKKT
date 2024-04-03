package ru.krindra.vknorthtypes.types.stories

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StoriesGetBannedResponse (
    val response: StoriesGetBannedRawResponse
) {
    /**
     *
     * @param count Stories count
     * @param items 
     */
    @Serializable
    data class StoriesGetBannedRawResponse (
        @SerialName("count") val count: Int,
        @SerialName("items") val items: List<Int>,
    )
}
