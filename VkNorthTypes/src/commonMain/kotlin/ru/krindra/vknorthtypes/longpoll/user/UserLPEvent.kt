package ru.krindra.vknorthtypes.longpoll.user

import ru.krindra.vknorthtypes.longpoll.user.updates.UserLPUpdate

data class UserLPEvent(
    val ts: Int,
    val updates: List<UserLPUpdate>,
)