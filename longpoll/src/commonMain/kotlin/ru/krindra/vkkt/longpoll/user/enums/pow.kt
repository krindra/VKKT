package ru.krindra.vkkt.longpoll.user.enums

internal fun Int.pow(x: Int): Int = (2..x).fold(this) { r, _ -> r * this }