package ru.krindra.vknorthtypes.types.events

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFullMemberStatus

/**
 *
 * @param address address of event
 * @param buttonText text of attach
 * @param friends array of friends ids
 * @param id event ID
 * @param isFavorite is favorite
 * @param memberStatus Current user's member status
 * @param text text of attach
 * @param time event start time
 */
@Serializable
data class EventsEventAttach (
    @SerialName("time") val time: Int? = null,
    @SerialName("member_status") val memberStatus: GroupsGroupFullMemberStatus? = null,
    @SerialName("id") val id: Long,
    @SerialName("is_favorite") val isFavorite: Boolean,
    @SerialName("button_text") val buttonText: String,
    @SerialName("address") val address: String? = null,
    @SerialName("friends") val friends: List<Int>,
    @SerialName("text") val text: String,
)
