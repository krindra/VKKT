package ru.krindra.vknorthtypes.types.photos

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.Serializable

typealias PhotosGetTagsRawResponse = List<PhotosPhotoTag>
@Serializable
data class PhotosGetTagsResponse (
    val response: PhotosGetTagsRawResponse
)
