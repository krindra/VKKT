package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.groups.*

/**
 * @param enabled Information whether catalog is enabled for current user
 * @param categories 
 */
@Serializable
data class GroupsGetCatalogInfoResponse (
    @SerialName("enabled") val enabled: BaseBoolInt,
    @SerialName("categories") val categories: List<GroupsGroupCategory>? = null,
)

