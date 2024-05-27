package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserMin

/**
 *
 * @param count Total number
 * @param items 
 * @param profiles 
 */
@Serializable
data class AppsCatalogList (
    @SerialName("items") val items: List<AppsApp>,
    @SerialName("count") val count: Int,
    @SerialName("profiles") val profiles: List<UsersUserMin>? = null,
)
