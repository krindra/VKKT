package ru.krindra.vkkt.responses.notifications

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.photos.PhotosPhoto
import ru.krindra.vkkt.objects.video.VideoVideo
import ru.krindra.vkkt.objects.groups.GroupsGroup
import ru.krindra.vkkt.objects.apps.AppsApp
import ru.krindra.vkkt.objects.users.UsersUser
import ru.krindra.vkkt.objects.notifications.*

/**
 * @param count Total number
 * @param items 
 * @param profiles 
 * @param groups 
 * @param lastViewed Time when user has been checked notifications last time
 * @param photos 
 * @param videos 
 * @param apps 
 * @param nextFrom 
 * @param ttl 
 */
@Serializable
data class NotificationsGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("ttl") val ttl: Int? = null,
    @SerialName("apps") val apps: List<AppsApp>? = null,
    @SerialName("next_from") val nextFrom: String? = null,
    @SerialName("last_viewed") val lastViewed: Int? = null,
    @SerialName("videos") val videos: List<VideoVideo>? = null,
    @SerialName("groups") val groups: List<GroupsGroup>? = null,
    @SerialName("photos") val photos: List<PhotosPhoto>? = null,
    @SerialName("profiles") val profiles: List<UsersUser>? = null,
    @SerialName("items") val items: List<NotificationsNotificationItem>,
)

