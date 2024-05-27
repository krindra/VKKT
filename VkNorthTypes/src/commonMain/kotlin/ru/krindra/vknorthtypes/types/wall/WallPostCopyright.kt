package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param link 
 * @param name 
 * @param type 
 */
@Serializable
data class WallPostCopyright (
    @SerialName("name") val name: String,
    @SerialName("link") val link: String,
    @SerialName("id") val id: Long? = null,
    @SerialName("type") val type: String,
)
