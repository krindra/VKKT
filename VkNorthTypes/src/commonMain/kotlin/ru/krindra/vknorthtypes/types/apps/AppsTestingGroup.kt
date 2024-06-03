package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userIds 
 * @param groupId 
 * @param name 
 * @param webview 
 * @param platforms 
 */
@Serializable
data class AppsTestingGroup (
    @SerialName("group_id") val groupId: Long,
    @SerialName("name") val name: String? = null,
    @SerialName("user_ids") val userIds: List<Int>,
    @SerialName("webview") val webview: String? = null,
    @SerialName("platforms") val platforms: List<String>? = null,
)
