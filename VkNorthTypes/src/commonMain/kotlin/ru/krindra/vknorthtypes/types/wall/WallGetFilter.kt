package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Filter to apply: 'owner' - posts by the wall owner, 'others' - posts by someone else, 'all' - posts by the wall owner and others (default), 'postponed' - timed posts (only available for calls with an 'access_token'), 'suggests' - suggested posts on a community wall
 * 
 */
@Serializable
enum class WallGetFilter(val value: String){
    @SerialName("owner") OWNER("owner"),
    @SerialName("others") OTHERS("others"),
    @SerialName("all") ALL("all"),
    @SerialName("postponed") POSTPONED("postponed"),
    @SerialName("suggests") SUGGESTS("suggests"),
    @SerialName("archived") ARCHIVED("archived"),
    @SerialName("donut") DONUT("donut"),
}
