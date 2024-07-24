package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.orders.*
import ru.krindra.vkkt.objects.orders.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseBoolResponse

class Orders(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param userId 
     * @param subscriptionId 
     * @param pendingCancel 
     */
    suspend fun cancelSubscription(userId: Int, subscriptionId: Int, pendingCancel: Boolean? = false): BaseBoolResponse {
        val response = method("orders.cancelSubscription", mapOf("user_id" to userId, "subscription_id" to subscriptionId, "pending_cancel" to pendingCancel))
        return decodeResponse(response, json)
    }

    /**
     *
     * Changes order status.
     * 
     * @param orderId order ID.
     * @param action action to be done with the order. Available actions: *cancel - to cancel unconfirmed order. *charge - to confirm unconfirmed order. Applies only if processing of [vk.com/dev/payments_status|order_change_state] notification failed. *refund - to cancel confirmed order.
     * @param appOrderId internal ID of the order in the application.
     * @param testMode if this parameter is set to 1, this method returns a list of test mode orders. By default - 0.
     */
    suspend fun changeState(orderId: Int, action: String, appOrderId: Int? = null, testMode: Boolean? = false): OrdersChangeStateResponse {
        val response = method("orders.changeState", mapOf("order_id" to orderId, "action" to action, "app_order_id" to appOrderId, "test_mode" to testMode))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of orders.
     * 
     * @param offset 
     * @param count number of returned orders.
     * @param testMode if this parameter is set to 1, this method returns a list of test mode orders. By default - 0.
     */
    suspend fun get(offset: Int? = 0, count: Int? = 100, testMode: Boolean? = false): OrdersGetResponse {
        val response = method("orders.get", mapOf("offset" to offset, "count" to count, "test_mode" to testMode))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param userId 
     * @param votes 
     */
    suspend fun getAmount(userId: Int, votes: List<String>): OrdersGetAmountResponse {
        val response = method("orders.getAmount", mapOf("user_id" to userId, "votes" to votes))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns information about orders by their IDs.
     * 
     * @param orderId order ID.
     * @param orderIds order IDs (when information about several orders is requested).
     * @param testMode if this parameter is set to 1, this method returns a list of test mode orders. By default - 0.
     */
    suspend fun getById(orderId: Int? = null, orderIds: List<Int>? = null, testMode: Boolean? = false): OrdersGetByIdResponse {
        val response = method("orders.getById", mapOf("order_id" to orderId, "order_ids" to orderIds, "test_mode" to testMode))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param userId 
     * @param subscriptionId 
     */
    suspend fun getUserSubscriptionById(userId: Int, subscriptionId: Int): OrdersGetUserSubscriptionByIdResponse {
        val response = method("orders.getUserSubscriptionById", mapOf("user_id" to userId, "subscription_id" to subscriptionId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param userId 
     */
    suspend fun getUserSubscriptions(userId: Int): OrdersGetUserSubscriptionsResponse {
        val response = method("orders.getUserSubscriptions", mapOf("user_id" to userId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param userId 
     * @param subscriptionId 
     * @param price 
     */
    suspend fun updateSubscription(userId: Int, subscriptionId: Int, price: Int): BaseBoolResponse {
        val response = method("orders.updateSubscription", mapOf("user_id" to userId, "subscription_id" to subscriptionId, "price" to price))
        return decodeResponse(response, json)
    }

}
