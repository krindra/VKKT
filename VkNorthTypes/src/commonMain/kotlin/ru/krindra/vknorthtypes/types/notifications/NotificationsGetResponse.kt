package ru.krindra.vknorthtypes.types.notifications

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.video.VideoVideo

import ru.krindra.vknorthtypes.types.photos.PhotosPhoto

import ru.krindra.vknorthtypes.types.groups.GroupsGroup

import ru.krindra.vknorthtypes.types.users.UsersUser

import ru.krindra.vknorthtypes.types.apps.AppsApp


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
    @SerialName("items") val items: List<NotificationsNotificationItem>,
    @SerialName("profiles") val profiles: List<UsersUser>? = null,
    @SerialName("groups") val groups: List<GroupsGroup>? = null,
    @SerialName("last_viewed") val lastViewed: Int? = null,
    @SerialName("photos") val photos: List<PhotosPhoto>? = null,
    @SerialName("videos") val videos: List<VideoVideo>? = null,
    @SerialName("apps") val apps: List<AppsApp>? = null,
    @SerialName("next_from") val nextFrom: String? = null,
    @SerialName("ttl") val ttl: Int? = null,
)

