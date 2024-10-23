package ru.krindra.vkkt.core.longpoll

internal data class LongPollParameters(
    val server: String,
    val key: String,
    var ts: Int,
    val wait: Int = 10,
) {
    fun toBotURL() =
        "${this.server}?act=a_check&key=${this.key}&ts=${this.ts}&wait=${this.wait}"

    fun toUserURL(mode: Int = 255, userVersion: Int = 3) =
        "https://${server}?act=a_check&key=${key}&ts=${ts}&wait=${this.wait}&mode=${mode}&version=${userVersion}"
}
