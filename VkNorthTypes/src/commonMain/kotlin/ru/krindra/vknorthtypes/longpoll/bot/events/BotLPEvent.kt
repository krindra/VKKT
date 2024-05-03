package ru.krindra.vknorthtypes.longpoll.bot.events

import kotlinx.serialization.Serializable

@Serializable(EventsSerializer::class)
abstract class BotLPEvent {
    abstract val type: String
    abstract val eventId: String
    abstract val v: String
    abstract val groupId: Int

}

