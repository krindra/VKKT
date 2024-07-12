package ru.krindra.vkkt.objects.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class StoriesUploadLinkText(val value: String){
    @SerialName("to_store") TO_STORE("to_store"),
    @SerialName("vote") VOTE("vote"),
    @SerialName("more") MORE("more"),
    @SerialName("book") BOOK("book"),
    @SerialName("order") ORDER("order"),
    @SerialName("enroll") ENROLL("enroll"),
    @SerialName("fill") FILL("fill"),
    @SerialName("signup") SIGNUP("signup"),
    @SerialName("buy") BUY("buy"),
    @SerialName("ticket") TICKET("ticket"),
    @SerialName("write") WRITE("write"),
    @SerialName("open") OPEN("open"),
    @SerialName("learn_more") LEARN_MORE("learn_more"),
    @SerialName("view") VIEW("view"),
    @SerialName("go_to") GO_TO("go_to"),
    @SerialName("contact") CONTACT("contact"),
    @SerialName("watch") WATCH("watch"),
    @SerialName("play") PLAY("play"),
    @SerialName("install") INSTALL("install"),
    @SerialName("read") READ("read"),
    @SerialName("calendar") CALENDAR("calendar"),
}
