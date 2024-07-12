package ru.krindra.vkkt.objects.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param chair Chair ID
 * @param chairName Chair name
 * @param city City ID
 * @param country Country ID
 * @param educationForm Education form
 * @param educationFormId Education form id
 * @param educationStatus Education status
 * @param educationStatusId Education status id
 * @param faculty Faculty ID
 * @param facultyName Faculty name
 * @param graduation Graduation year
 * @param id University ID
 * @param name University name
 * @param universityGroupId 
 */
@Serializable
data class UsersUniversity (
    @SerialName("id") val id: Long? = null,
    @SerialName("city") val city: Int? = null,
    @SerialName("chair") val chair: Int? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("country") val country: Int? = null,
    @SerialName("faculty") val faculty: Int? = null,
    @SerialName("graduation") val graduation: Int? = null,
    @SerialName("chair_name") val chairName: String? = null,
    @SerialName("faculty_name") val facultyName: String? = null,
    @SerialName("education_form") val educationForm: String? = null,
    @SerialName("education_form_id") val educationFormId: Long? = null,
    @SerialName("education_status") val educationStatus: String? = null,
    @SerialName("education_status_id") val educationStatusId: Long? = null,
    @SerialName("university_group_id") val universityGroupId: Long? = null,
)
