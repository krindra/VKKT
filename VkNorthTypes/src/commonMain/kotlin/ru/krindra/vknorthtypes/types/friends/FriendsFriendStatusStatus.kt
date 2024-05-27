package ru.krindra.vknorthtypes.types.friends

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

/**
 *
 * Friend status with the user
 * 
 */
private class FriendsFriendStatusStatusSerializer: EnumAsIntSerializer<FriendsFriendStatusStatus>(
    "FriendsFriendStatusStatus", { it.value }, { v -> FriendsFriendStatusStatus.values().first { it.value == v } }
)

@Serializable(with = FriendsFriendStatusStatusSerializer::class)
enum class FriendsFriendStatusStatus(val value: Int){
    NOT_A_FRIEND(0),
    OUTCOMING_REQUEST(1),
    INCOMING_REQUEST(2),
    IS_FRIEND(3),
}
