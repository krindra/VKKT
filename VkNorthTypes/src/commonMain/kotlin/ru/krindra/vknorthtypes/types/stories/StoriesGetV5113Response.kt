package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

import ru.krindra.vknorthtypes.types.users.UsersUserFull


/**
 * @param count 
 * @param items 
 * @param profiles 
 * @param groups 
 * @param needUploadScreen 
 * @param trackCode 
 * @param nextFrom 
 */
@Serializable
data class StoriesGetV5113Response (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<StoriesFeedItem>,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("need_upload_screen") val needUploadScreen: Boolean? = null,
    @SerialName("track_code") val trackCode: String? = null,
    @SerialName("next_from") val nextFrom: String? = null,
)

