package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

/**
 *
 * Leaderboard type
 * 
 */
private class AppsAppLeaderboardTypeSerializer: EnumAsIntSerializer<AppsAppLeaderboardType>(
    "AppsAppLeaderboardType", { it.value }, { v -> AppsAppLeaderboardType.values().first { it.value == v } }
)

@Serializable(with = AppsAppLeaderboardTypeSerializer::class)
enum class AppsAppLeaderboardType(val value: Int){
    NOT_SUPPORTED(0),
    LEVELS(1),
    POINTS(2),
}
