package ru.krindra.vknorthtypes.types.docs

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DocsGetTypesResponse (
    val response: DocsGetTypesRawResponse
) {
    /**
     *
     * @param count Total number
     * @param items 
     */
    @Serializable
    data class DocsGetTypesRawResponse (
        @SerialName("count") val count: Int,
        @SerialName("items") val items: List<DocsDocTypes>,
    )
}
