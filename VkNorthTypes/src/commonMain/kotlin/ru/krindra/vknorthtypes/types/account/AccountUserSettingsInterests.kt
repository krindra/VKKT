package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param activities 
 * @param interests 
 * @param music 
 * @param tv 
 * @param movies 
 * @param books 
 * @param games 
 * @param quotes 
 * @param about 
 */
@Serializable
data class AccountUserSettingsInterests (
    @SerialName("tv") val tv: AccountUserSettingsInterest? = null,
    @SerialName("quotes") val quotes: AccountUserSettingsInterest? = null,
    @SerialName("about") val about: AccountUserSettingsInterest? = null,
    @SerialName("movies") val movies: AccountUserSettingsInterest? = null,
    @SerialName("music") val music: AccountUserSettingsInterest? = null,
    @SerialName("interests") val interests: AccountUserSettingsInterest? = null,
    @SerialName("games") val games: AccountUserSettingsInterest? = null,
    @SerialName("books") val books: AccountUserSettingsInterest? = null,
    @SerialName("activities") val activities: AccountUserSettingsInterest? = null,
)
