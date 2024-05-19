package ru.krindra.vknorthtypes.longpoll.user.updates

internal inline fun <reified T> List<*>.getOrNullAs(index: Int): T? {
    with(this.getOrNull(index)) {
        if (this == null) return null
        else return this as T
    }
}