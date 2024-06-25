package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// TODO! temporally
@Serializable
data class UserLPAttachments(
    @SerialName("attach1_type") val attach1Type: String? = null,
    @SerialName("attach2_type") val attach2Type: String? = null,
    @SerialName("attach3_type") val attach3Type: String? = null,
    @SerialName("attach4_type") val attach4Type: String? = null,
    @SerialName("attach5_type") val attach5Type: String? = null,
    @SerialName("attach6_type") val attach6Type: String? = null,
    @SerialName("attach7_type") val attach7Type: String? = null,
    @SerialName("attach8_type") val attach8Type: String? = null,
    @SerialName("attach9_type") val attach9Type: String? = null,
    @SerialName("attach10_type") val attach10Type: String? = null,
    @SerialName("attach1") val attach1: String? = null,
    @SerialName("attach2") val attach2: String? = null,
    @SerialName("attach3") val attach3: String? = null,
    @SerialName("attach4") val attach4: String? = null,
    @SerialName("attach5") val attach5: String? = null,
    @SerialName("attach6") val attach6: String? = null,
    @SerialName("attach7") val attach7: String? = null,
    @SerialName("attach8") val attach8: String? = null,
    @SerialName("attach9") val attach9: String? = null,
    @SerialName("attach10") val attach10: String? = null,
)
