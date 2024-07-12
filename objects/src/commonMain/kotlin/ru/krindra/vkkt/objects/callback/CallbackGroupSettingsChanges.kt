package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupVideo
import ru.krindra.vkkt.objects.groups.GroupsGroupIsClosed
import ru.krindra.vkkt.objects.groups.GroupsGroupWall
import ru.krindra.vkkt.objects.groups.GroupsGroupPhotos
import ru.krindra.vkkt.objects.groups.GroupsGroupAudio
import ru.krindra.vkkt.objects.groups.GroupsGroupFullAgeLimits

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
    @SerialName("title") val title: String? = null,
    @SerialName("website") val website: String? = null,
    @SerialName("screen_name") val screenName: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("access") val access: GroupsGroupIsClosed? = null,
    @SerialName("public_category") val publicCategory: Int? = null,
    @SerialName("public_subcategory") val publicSubcategory: Int? = null,
    @SerialName("enable_audio") val enableAudio: GroupsGroupAudio? = null,
    @SerialName("enable_video") val enableVideo: GroupsGroupVideo? = null,
    @SerialName("enable_photo") val enablePhoto: GroupsGroupPhotos? = null,
    @SerialName("age_limits") val ageLimits: GroupsGroupFullAgeLimits? = null,
    @SerialName("enable_market") val enableMarket: CallbackGroupMarket? = null,
    @SerialName("enable_status_default") val enableStatusDefault: GroupsGroupWall? = null,
)
