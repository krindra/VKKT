package ru.krindra.vknorthtypes.types.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Object type
 * 
 */
@Serializable
enum class UtilsDomainResolvedType(val value: String){
    @SerialName("user") USER("user"),
    @SerialName("group") GROUP("group"),
    @SerialName("application") APPLICATION("application"),
    @SerialName("page") PAGE("page"),
    @SerialName("vk_app") VK_APP("vk_app"),
    @SerialName("community_application") COMMUNITY_APPLICATION("community_application"),
}
