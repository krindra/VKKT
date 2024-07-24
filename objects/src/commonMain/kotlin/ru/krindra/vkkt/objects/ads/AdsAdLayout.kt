package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param adFormat Ad format
 * @param campaignId Campaign ID
 * @param costType 
 * @param description Ad description
 * @param id Ad ID
 * @param imageSrc Image URL
 * @param imageSrc2x URL of the preview image in double size
 * @param linkDomain Domain of advertised object
 * @param linkUrl URL of advertised object
 * @param linkType Type of advertised object
 * @param previewLink link to preview an ad as it is shown on the website
 * @param title Ad title
 * @param video Information whether the ad is a video
 * @param social Social
 * @param okved Okved
 * @param ageRestriction Age restriction
 * @param goalType Goal type
 * @param linkTitle Link title
 * @param linkButton Link button
 * @param repeatVideo Repeat video
 * @param videoSrc240 Video source 240p
 * @param videoSrc360 Video source 360p
 * @param videoSrc480 Video source 480p
 * @param videoSrc720 Video source 720p
 * @param videoSrc1080 Video source 1080p
 * @param videoImageSrc Video image source
 * @param videoImageSrc2x Video image source 2x
 * @param videoDuration Video duration
 * @param iconSrc Icon source
 * @param iconSrc2x Icon source 2x
 * @param post 
 * @param storiesData 
 * @param clipsList 
 */
@Serializable
data class AdsAdLayout (
    @SerialName("id") val id: Int,
    @SerialName("title") val title: String,
    @SerialName("ad_format") val adFormat: Int,
    @SerialName("link_type") val linkType: Int,
    @SerialName("link_url") val linkUrl: String,
    @SerialName("image_src") val imageSrc: String,
    @SerialName("post") val post: AdsPost? = null,
    @SerialName("campaign_id") val campaignId: Int,
    @SerialName("okved") val okved: String? = null,
    @SerialName("social") val social: Boolean? = null,
    @SerialName("description") val description: String,
    @SerialName("goal_type") val goalType: Int? = null,
    @SerialName("icon_src") val iconSrc: String? = null,
    @SerialName("video") val video: BaseBoolInt? = null,
    @SerialName("cost_type") val costType: AdsAdCostType,
    @SerialName("link_title") val linkTitle: String? = null,
    @SerialName("icon_src_2x") val iconSrc2x: String? = null,
    @SerialName("repeat_video") val repeatVideo: Int? = null,
    @SerialName("link_button") val linkButton: String? = null,
    @SerialName("link_domain") val linkDomain: String? = null,
    @SerialName("image_src_2x") val imageSrc2x: String? = null,
    @SerialName("preview_link") val previewLink: String? = null,
    @SerialName("video_duration") val videoDuration: Int? = null,
    @SerialName("video_src_240") val videoSrc240: String? = null,
    @SerialName("video_src_360") val videoSrc360: String? = null,
    @SerialName("video_src_480") val videoSrc480: String? = null,
    @SerialName("video_src_720") val videoSrc720: String? = null,
    @SerialName("age_restriction") val ageRestriction: Int? = null,
    @SerialName("video_src_1080") val videoSrc1080: String? = null,
    @SerialName("stories_data") val storiesData: AdsStories? = null,
    @SerialName("video_image_src") val videoImageSrc: String? = null,
    @SerialName("clips_list") val clipsList: List<AdsClipItem>? = null,
    @SerialName("video_image_src_2x") val videoImageSrc2x: String? = null,
)
