package ru.krindra.vkkt.longpoll

import kotlinx.coroutines.flow.Flow

internal interface AbstractLongPoll<T> {
    suspend fun listen(): Flow<T>
}
