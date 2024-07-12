package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param isEnabled Information whether addresses is enabled
 * @param mainAddressId Main address id for group
 * @param mainAddress Main address
 * @param count Count of addresses
 */
@Serializable
data class GroupsAddressesInfo (
    @SerialName("count") val count: Int? = null,
    @SerialName("is_enabled") val isEnabled: Boolean,
    @SerialName("main_address_id") val mainAddressId: Long? = null,
    @SerialName("main_address") val mainAddress: GroupsAddress? = null,
)
