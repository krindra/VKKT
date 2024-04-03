package ru.krindra.vknorthtypes.types.callback

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupPhotos
import ru.krindra.vknorthtypes.types.groups.GroupsGroupIsClosed
import ru.krindra.vknorthtypes.types.groups.GroupsGroupAudio
import ru.krindra.vknorthtypes.types.groups.GroupsGroupWall
import ru.krindra.vknorthtypes.types.groups.GroupsGroupVideo
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFullAgeLimits

/**
 *
 * @param title 
 * @param description 
 * @param access 
 * @param screenName 
 * @param publicCategory 
 * @param publicSubcategory 
 * @param ageLimits 
 * @param website 
 * @param enableStatusDefault 
 * @param enableAudio 
 * @param enableVideo 
 * @param enablePhoto 
 * @param enableMarket 
 */
@Serializable
data class CallbackGroupSettingsChanges (
    @SerialName("enable_status_default") val enableStatusDefault: GroupsGroupWall? = null,
    @SerialName("age_limits") val ageLimits: GroupsGroupFullAgeLimits? = null,
    @SerialName("enable_audio") val enableAudio: GroupsGroupAudio? = null,
    @SerialName("access") val access: GroupsGroupIsClosed? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("website") val website: String? = null,
    @SerialName("enable_video") val enableVideo: GroupsGroupVideo? = null,
    @SerialName("screen_name") val screenName: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("public_category") val publicCategory: Int? = null,
    @SerialName("enable_market") val enableMarket: CallbackGroupMarket? = null,
    @SerialName("public_subcategory") val publicSubcategory: Int? = null,
    @SerialName("enable_photo") val enablePhoto: GroupsGroupPhotos? = null,
)