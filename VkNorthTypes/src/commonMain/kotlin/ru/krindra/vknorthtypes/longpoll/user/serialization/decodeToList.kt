package ru.krindra.vknorthtypes.longpoll.user.serialization

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.serializer

internal fun <T> decodeFromList(list: List<Any>, deserializer: DeserializationStrategy<T>): T {
    val decoder = ListDecoder(ArrayDeque(list))
    return decoder.decodeSerializableValue(deserializer)
}

internal inline fun <reified T> decodeFromList(list: List<Any>): T = decodeFromList(list, serializer())