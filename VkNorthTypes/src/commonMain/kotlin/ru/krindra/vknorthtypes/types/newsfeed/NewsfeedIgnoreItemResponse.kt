package ru.krindra.vknorthtypes.types.newsfeed

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NewsfeedIgnoreItemResponse (
    val response: NewsfeedIgnoreItemRawResponse
) {
    /**
     *
     * @param status 
     */
    @Serializable
    data class NewsfeedIgnoreItemRawResponse (
        @SerialName("status") val status: Boolean,
    )
}
