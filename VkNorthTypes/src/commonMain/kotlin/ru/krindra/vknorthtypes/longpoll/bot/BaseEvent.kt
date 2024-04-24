package ru.krindra.vknorthtypes.longpoll.bot

import kotlinx.serialization.Serializable

@Serializable()
abstract class BaseEvent {
    abstract val type: String
    abstract val eventId: String
    abstract val v: String
    abstract val groupId: Int
}
