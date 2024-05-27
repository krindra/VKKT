package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Owner id
 * @param href Href
 * @param name Name
 * @param photo Photo
 * @param verify Verify
 * @param gender Gender
 * @param nameGet Name get
 * @param firstName First name
 * @param firstNameGen First name gen
 * @param firstNameIns First name ins
 * @param canFollow Can follow
 */
@Serializable
data class AdsStoriesOwner (
    @SerialName("gender") val gender: String? = null,
    @SerialName("name_get") val nameGet: String? = null,
    @SerialName("verify") val verify: String? = null,
    @SerialName("href") val href: String? = null,
    @SerialName("firstName") val firstName: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("id") val id: Long? = null,
    @SerialName("first_name_gen") val firstNameGen: String? = null,
    @SerialName("first_name_ins") val firstNameIns: String? = null,
    @SerialName("photo") val photo: String? = null,
    @SerialName("can_follow") val canFollow: Boolean? = null,
)
