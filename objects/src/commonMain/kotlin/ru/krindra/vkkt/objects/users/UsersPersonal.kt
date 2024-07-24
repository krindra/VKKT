package ru.krindra.vkkt.objects.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.database.DatabaseLanguageFull

/**
 *
 * @param alcohol User's views on alcohol
 * @param inspiredBy User's inspired by
 * @param langs 
 * @param langsFull User's languages with full info
 * @param lifeMain User's personal priority in life
 * @param peopleMain User's personal priority in people
 * @param political User's political views
 * @param religion User's religion
 * @param religionId User's religion id
 * @param smoking User's views on smoking
 */
@Serializable
data class UsersPersonal (
    @SerialName("alcohol") val alcohol: Int? = null,
    @SerialName("smoking") val smoking: Int? = null,
    @SerialName("life_main") val lifeMain: Int? = null,
    @SerialName("political") val political: Int? = null,
    @SerialName("langs") val langs: List<String>? = null,
    @SerialName("religion") val religion: String? = null,
    @SerialName("people_main") val peopleMain: Int? = null,
    @SerialName("religion_id") val religionId: Int? = null,
    @SerialName("inspired_by") val inspiredBy: String? = null,
    @SerialName("langs_full") val langsFull: List<DatabaseLanguageFull>? = null,
)
