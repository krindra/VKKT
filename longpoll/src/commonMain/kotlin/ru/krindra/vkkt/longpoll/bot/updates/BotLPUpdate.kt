package ru.krindra.vkkt.longpoll.bot.updates

import kotlinx.serialization.Serializable

@Serializable(UpdatesSerializer::class)
abstract class BotLPUpdate {
    abstract val type: String
    abstract val eventId: String
    abstract val v: String
    abstract val groupId: Int

}

