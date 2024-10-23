package ru.krindra.vkkt.core.longpoll

import kotlinx.coroutines.flow.Flow

interface AbstractLongPoll<T> {
    abstract suspend fun listen(): Flow<T>
}
