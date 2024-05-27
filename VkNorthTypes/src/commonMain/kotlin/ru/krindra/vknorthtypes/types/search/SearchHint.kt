package ru.krindra.vknorthtypes.types.search

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.groups.GroupsGroup
import ru.krindra.vknorthtypes.types.base.BaseLink
import ru.krindra.vknorthtypes.types.users.UsersUserMin
import ru.krindra.vknorthtypes.types.apps.AppsApp

/**
 *
 * @param app 
 * @param description Object description
 * @param global_ Information whether the object has been found globally
 * @param group 
 * @param profile 
 * @param section 
 * @param type 
 * @param link 
 */
@Serializable
data class SearchHint (
    @SerialName("app") val app: AppsApp? = null,
    @SerialName("global_") val global_: BaseBoolInt? = null,
    @SerialName("description") val description: String,
    @SerialName("link") val link: BaseLink? = null,
    @SerialName("group") val group: GroupsGroup? = null,
    @SerialName("type") val type: SearchHintType,
    @SerialName("section") val section: SearchHintSection? = null,
    @SerialName("profile") val profile: UsersUserMin? = null,
)
