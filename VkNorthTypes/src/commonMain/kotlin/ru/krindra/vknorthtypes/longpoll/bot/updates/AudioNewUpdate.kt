package ru.krindra.vknorthtypes.longpoll.bot.updates

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.longpoll.bot.updates.objects.AudioNewObject


@Serializable
data class AudioNewUpdate(
    @SerialName("type") override val type: String,
    @SerialName("event_id") override val eventId: String,
    @SerialName("v") override val v: String,
    @SerialName("group_id") override val groupId: Int,
    @SerialName("object") val `object`: AudioNewObject,
) : BotLPUpdate() {
    companion object {
        val type = "audio_new"
    }
}