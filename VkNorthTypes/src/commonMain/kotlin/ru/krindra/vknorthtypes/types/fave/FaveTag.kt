package ru.krindra.vknorthtypes.types.fave

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Tag id
 * @param name Tag name
 */
@Serializable
data class FaveTag (
    @SerialName("name") val name: String? = null,
    @SerialName("id") val id: Long? = null,
)