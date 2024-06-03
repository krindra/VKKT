package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param _2faRequired Two factor authentication is enabled
 * @param country Country code
 * @param httpsRequired Information whether HTTPS-only is enabled
 * @param intro Information whether user has been processed intro
 * @param lang Language ID
 * @param noWallReplies Information whether wall comments should be hidden
 * @param ownPostsDefault Information whether only owners posts should be shown
 */
@Serializable
data class AccountInfo (
    @SerialName("lang") val lang: Int? = null,
    @SerialName("country") val country: String? = null,
    @SerialName("intro") val intro: BaseBoolInt? = null,
    @SerialName("_2fa_required") val _2faRequired: BaseBoolInt? = null,
    @SerialName("https_required") val httpsRequired: BaseBoolInt? = null,
    @SerialName("no_wall_replies") val noWallReplies: BaseBoolInt? = null,
    @SerialName("own_posts_default") val ownPostsDefault: BaseBoolInt? = null,
)
