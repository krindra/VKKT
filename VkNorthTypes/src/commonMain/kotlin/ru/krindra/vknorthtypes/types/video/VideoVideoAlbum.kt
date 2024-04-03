package ru.krindra.vknorthtypes.types.video

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Album ID
 * @param ownerId Album owner's ID
 * @param title Album title
 * @param trackCode Album trackcode
 * @param responseType 
 */
@Serializable
data class VideoVideoAlbum (
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("response_type") val responseType: String? = null,
    @SerialName("id") val id: Long,
    @SerialName("track_code") val trackCode: String? = null,
    @SerialName("title") val title: String,
)