package ru.krindra.vknorthtypes.types.video

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param enabled 
 * @param isNotificationsBlocked 
 */
@Serializable
data class VideoLiveInfo (
    @SerialName("enabled") val enabled: BaseBoolInt,
    @SerialName("is_notifications_blocked") val isNotificationsBlocked: BaseBoolInt? = null,
)