package ru.krindra.vknorthtypes.types.newsfeed

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NewsfeedGetBannedResponse (
    val response: NewsfeedGetBannedRawResponse
) {
    /**
     *
     * @param groups 
     * @param members 
     */
    @Serializable
    data class NewsfeedGetBannedRawResponse (
        @SerialName("groups") val groups: List<Int>? = null,
        @SerialName("members") val members: List<Int>? = null,
    )
}
