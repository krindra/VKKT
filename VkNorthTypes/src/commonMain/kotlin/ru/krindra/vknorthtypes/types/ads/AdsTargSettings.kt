package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Ad ID
 * @param campaignId Campaign ID
 * @param ageFrom Age from
 * @param ageTo Age to
 * @param apps Apps IDs
 * @param appsNot Apps IDs to except
 * @param birthday Days to birthday
 * @param cities Cities IDs
 * @param citiesNot Cities IDs to except
 * @param country Country ID
 * @param districts Districts IDs
 * @param groups Communities IDs
 * @param interestCategories Interests categories IDs
 * @param interests Interests
 * @param paying Information whether the user has proceeded VK payments before
 * @param positions Positions IDs
 * @param religions Religions IDs
 * @param retargetingGroups Retargeting groups ids
 * @param retargetingGroupsNot Retargeting groups NOT ids
 * @param schoolFrom School graduation year from
 * @param schoolTo School graduation year to
 * @param schools Schools IDs
 * @param sex 
 * @param stations Stations IDs
 * @param statuses Relationship statuses
 * @param streets Streets IDs
 * @param travellers Travellers
 * @param abTest AB test
 * @param uniFrom University graduation year from
 * @param uniTo University graduation year to
 * @param userBrowsers Browsers
 * @param userDevices Devices
 * @param userOs Operating systems
 * @param suggestedCriteria Suggested criteria
 * @param groupsNot Group not
 * @param priceListAudienceType Price list audience type
 * @param count Count
 * @param groupsActiveFormula Group active formula
 * @param interestCategoriesFormula Interest categories formula
 * @param groupsFormula Groups formula
 * @param groupsActive Groups active
 * @param groupTypes Group types
 * @param keyPhrases Key phrases
 * @param keyPhrasesDays Key phrases days
 * @param geoNear Geo near
 * @param geoPointType Geo point type
 * @param priceListId Price list id
 * @param groupsRecommended Groups recommended ids
 * @param groupsActiveRecommended Groups active recommended ids
 * @param musicArtistsFormula Music artists formula
 * @param priceListRetargetingFormula Price list retargeting formula
 * @param tags Tags
 * @param browsers Browsers
 * @param mobileOsMinVersion Mobile os min version
 * @param mobileAppsEventsFormula Mobile apps events formula
 * @param mobileOsMaxVersion Mobile os max version
 * @param operators operators
 * @param wifiOnly wifi_only
 * @param mobileManufacturers mobile_manufacturers
 */
@Serializable
data class AdsTargSettings (
    @SerialName("music_artists_formula") val musicArtistsFormula: String? = null,
    @SerialName("apps") val apps: String? = null,
    @SerialName("price_list_id") val priceListId: String? = null,
    @SerialName("streets") val streets: String? = null,
    @SerialName("statuses") val statuses: String? = null,
    @SerialName("uni_from") val uniFrom: String? = null,
    @SerialName("wifi_only") val wifiOnly: String? = null,
    @SerialName("groups_formula") val groupsFormula: String? = null,
    @SerialName("campaign_id") val campaignId: String? = null,
    @SerialName("religions") val religions: String? = null,
    @SerialName("retargeting_groups") val retargetingGroups: String? = null,
    @SerialName("geo_point_type") val geoPointType: String? = null,
    @SerialName("schools") val schools: String? = null,
    @SerialName("birthday") val birthday: String? = null,
    @SerialName("mobile_apps_events_formula") val mobileAppsEventsFormula: String? = null,
    @SerialName("positions") val positions: String? = null,
    @SerialName("uni_to") val uniTo: String? = null,
    @SerialName("groups_active_recommended") val groupsActiveRecommended: String? = null,
    @SerialName("sex") val sex: AdsCriteriaSex? = null,
    @SerialName("age_to") val ageTo: String? = null,
    @SerialName("interests") val interests: String? = null,
    @SerialName("country") val country: String? = null,
    @SerialName("groups_not") val groupsNot: String? = null,
    @SerialName("groups_active") val groupsActive: String? = null,
    @SerialName("retargeting_groups_not") val retargetingGroupsNot: String? = null,
    @SerialName("mobile_os_max_version") val mobileOsMaxVersion: String? = null,
    @SerialName("mobile_os_min_version") val mobileOsMinVersion: String? = null,
    @SerialName("browsers") val browsers: String? = null,
    @SerialName("count") val count: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("groups_recommended") val groupsRecommended: String? = null,
    @SerialName("stations") val stations: String? = null,
    @SerialName("group_types") val groupTypes: String? = null,
    @SerialName("key_phrases_days") val keyPhrasesDays: String? = null,
    @SerialName("mobile_manufacturers") val mobileManufacturers: String? = null,
    @SerialName("user_browsers") val userBrowsers: String? = null,
    @SerialName("operators") val operators: String? = null,
    @SerialName("groups") val groups: String? = null,
    @SerialName("suggested_criteria") val suggestedCriteria: String? = null,
    @SerialName("cities_not") val citiesNot: String? = null,
    @SerialName("districts") val districts: String? = null,
    @SerialName("user_os") val userOs: String? = null,
    @SerialName("age_from") val ageFrom: String? = null,
    @SerialName("price_list_audience_type") val priceListAudienceType: String? = null,
    @SerialName("key_phrases") val keyPhrases: String? = null,
    @SerialName("interest_categories") val interestCategories: String? = null,
    @SerialName("price_list_retargeting_formula") val priceListRetargetingFormula: String? = null,
    @SerialName("user_devices") val userDevices: String? = null,
    @SerialName("interest_categories_formula") val interestCategoriesFormula: String? = null,
    @SerialName("ab_test") val abTest: String? = null,
    @SerialName("cities") val cities: String? = null,
    @SerialName("travellers") val travellers: String? = null,
    @SerialName("geo_near") val geoNear: String? = null,
    @SerialName("paying") val paying: String? = null,
    @SerialName("apps_not") val appsNot: String? = null,
    @SerialName("school_to") val schoolTo: String? = null,
    @SerialName("school_from") val schoolFrom: String? = null,
    @SerialName("tags") val tags: String? = null,
    @SerialName("groups_active_formula") val groupsActiveFormula: String? = null,
)
