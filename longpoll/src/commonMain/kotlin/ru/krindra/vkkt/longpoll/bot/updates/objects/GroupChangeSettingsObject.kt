package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
data class GroupChangeSettingsObject(
    @SerialName("user_id") val userId: Int,
    @SerialName("changes") val changes: JsonObject,
)