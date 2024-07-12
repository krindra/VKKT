package ru.krindra.vkkt.objects.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param msg 
 * @param chat 
 * @param like 
 * @param repost 
 * @param comment 
 * @param mention 
 * @param reply 
 * @param newPost 
 * @param wallPost 
 * @param wallPublish 
 * @param friend 
 * @param friendFound 
 * @param friendAccepted 
 * @param groupInvite 
 * @param groupAccepted 
 * @param birthday 
 * @param eventSoon 
 * @param appRequest 
 * @param sdkOpen 
 */
@Serializable
data class AccountPushParams (
    @SerialName("msg") val msg: List<AccountPushParamsMode>? = null,
    @SerialName("chat") val chat: List<AccountPushParamsMode>? = null,
    @SerialName("reply") val reply: List<AccountPushParamsOnoff>? = null,
    @SerialName("like") val like: List<AccountPushParamsSettings>? = null,
    @SerialName("friend") val friend: List<AccountPushParamsOnoff>? = null,
    @SerialName("new_post") val newPost: List<AccountPushParamsOnoff>? = null,
    @SerialName("repost") val repost: List<AccountPushParamsSettings>? = null,
    @SerialName("sdk_open") val sdkOpen: List<AccountPushParamsOnoff>? = null,
    @SerialName("birthday") val birthday: List<AccountPushParamsOnoff>? = null,
    @SerialName("comment") val comment: List<AccountPushParamsSettings>? = null,
    @SerialName("mention") val mention: List<AccountPushParamsSettings>? = null,
    @SerialName("wall_post") val wallPost: List<AccountPushParamsOnoff>? = null,
    @SerialName("event_soon") val eventSoon: List<AccountPushParamsOnoff>? = null,
    @SerialName("app_request") val appRequest: List<AccountPushParamsOnoff>? = null,
    @SerialName("friend_found") val friendFound: List<AccountPushParamsOnoff>? = null,
    @SerialName("group_invite") val groupInvite: List<AccountPushParamsOnoff>? = null,
    @SerialName("wall_publish") val wallPublish: List<AccountPushParamsOnoff>? = null,
    @SerialName("group_accepted") val groupAccepted: List<AccountPushParamsOnoff>? = null,
    @SerialName("friend_accepted") val friendAccepted: List<AccountPushParamsOnoff>? = null,
)
