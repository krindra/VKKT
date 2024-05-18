package ru.krindra.vknorthtypes.longpoll.user.serialization

import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.serializer

internal fun <T> encodeToList(serializer: SerializationStrategy<T>, value: T): List<Any> {
    val encoder = ListEncoder()
    encoder.encodeSerializableValue(serializer, value)
    return encoder.list
}

internal inline fun <reified T> encodeToList(value: T) = encodeToList(serializer(), value)
