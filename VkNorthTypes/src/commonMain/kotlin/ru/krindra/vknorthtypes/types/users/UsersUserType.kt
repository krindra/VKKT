package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Object type
 * 
 */
@Serializable
enum class UsersUserType(val value: String){
    @SerialName("profile") PROFILE("profile"),
}
