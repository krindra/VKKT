package ru.krindra.vknorthtypes.longpoll.bot.events

import kotlinx.serialization.Serializable

@Serializable(ru.krindra.vknorthtypes.longpoll.bot.events.EventsSerializer::class)
abstract class BaseEvent {
    abstract val type: String
    abstract val eventId: String
    abstract val v: String
    abstract val groupId: Int

}

