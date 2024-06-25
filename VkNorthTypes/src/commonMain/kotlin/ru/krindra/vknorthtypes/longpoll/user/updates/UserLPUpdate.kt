package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.elementNames
import kotlinx.serialization.json.buildJsonObject
import ru.krindra.vknorthtypes.JsonSingleton

@Serializable
abstract class UserLPUpdate {
}