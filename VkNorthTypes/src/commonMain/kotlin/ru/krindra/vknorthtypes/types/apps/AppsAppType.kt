package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Application type
 * 
 */
@Serializable
enum class AppsAppType(val value: String){
    @SerialName("app") APP("app"),
    @SerialName("game") GAME("game"),
    @SerialName("site") SITE("site"),
    @SerialName("standalone") STANDALONE("standalone"),
    @SerialName("vk_app") VK_APP("vk_app"),
    @SerialName("community_app") COMMUNITY_APP("community_app"),
    @SerialName("html5_game") HTML5_GAME("html5_game"),
    @SerialName("mini_app") MINI_APP("mini_app"),
}
