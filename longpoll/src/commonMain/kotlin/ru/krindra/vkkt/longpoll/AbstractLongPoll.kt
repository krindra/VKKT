package ru.krindra.vkkt.longpoll

import kotlinx.coroutines.flow.Flow

interface AbstractLongPoll<T> {
    abstract suspend fun listen(): Flow<T>
}
