package ru.krindra.vkkt.objects.orders

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param cancelReason Cancel reason
 * @param createTime Date of creation in Unixtime
 * @param id Subscription ID
 * @param itemId Subscription order item
 * @param nextBillTime Date of next bill in Unixtime
 * @param expireTime Subscription expiration time in Unixtime
 * @param pendingCancel Pending cancel state
 * @param period Subscription period
 * @param periodStartTime Date of last period start in Unixtime
 * @param price Subscription price
 * @param title Subscription name
 * @param appId Subscription's application id
 * @param applicationName Subscription's application name
 * @param photoUrl Item photo image url
 * @param status Subscription status
 * @param testMode Is test subscription
 * @param trialExpireTime Date of trial expire in Unixtime
 * @param updateTime Date of last change in Unixtime
 * @param isGame Is game (not miniapp) subscription
 */
@Serializable
data class OrdersSubscription (
    @SerialName("id") val id: Long,
    @SerialName("price") val price: Int,
    @SerialName("period") val period: Int,
    @SerialName("status") val status: String,
    @SerialName("item_id") val itemId: String,
    @SerialName("app_id") val appId: Long? = null,
    @SerialName("create_time") val createTime: Int,
    @SerialName("title") val title: String? = null,
    @SerialName("update_time") val updateTime: Int,
    @SerialName("is_game") val isGame: Boolean? = null,
    @SerialName("photo_url") val photoUrl: String? = null,
    @SerialName("expire_time") val expireTime: Int? = null,
    @SerialName("test_mode") val testMode: Boolean? = null,
    @SerialName("period_start_time") val periodStartTime: Int,
    @SerialName("next_bill_time") val nextBillTime: Int? = null,
    @SerialName("cancel_reason") val cancelReason: String? = null,
    @SerialName("pending_cancel") val pendingCancel: Boolean? = null,
    @SerialName("trial_expire_time") val trialExpireTime: Int? = null,
    @SerialName("application_name") val applicationName: String? = null,
)
