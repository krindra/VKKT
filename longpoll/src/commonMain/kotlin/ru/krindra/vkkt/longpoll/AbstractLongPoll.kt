package ru.krindra.vkkt.longpoll

import kotlinx.coroutines.flow.Flow

interface AbstractLongPoll<T> {
    suspend fun listen(): Flow<T>
}
