package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.ads.*
import ru.krindra.vkkt.objects.ads.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import kotlinx.serialization.builtins.ListSerializer
import ru.krindra.vkkt.responses.base.BaseOkResponse
import ru.krindra.vkkt.responses.base.BaseUndefinedResponse

class Ads(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Adds managers and/or supervisors to advertising account.
     * 
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
     */
    suspend fun addOfficeUsers(accountId: Long, data: String): AdsAddOfficeUsersResponse {
        val response = method("ads.addOfficeUsers", mapOf("account_id" to accountId, "data" to data))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to check the ad link.
     * 
     * @param accountId Advertising account ID.
     * @param linkType Object type: *'community' - community,, *'post' - community post,, *'application' - VK application,, *'video' - video,, *'site' - external site.
     * @param linkUrl Object URL.
     * @param campaignId Campaign ID.
     */
    suspend fun checkLink(accountId: Long, linkType: String, linkUrl: String, campaignId: Long? = null): AdsCheckLinkResponse {
        val response = method("ads.checkLink", mapOf("account_id" to accountId, "link_type" to linkType, "link_url" to linkUrl, "campaign_id" to campaignId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Creates ads.
     * 
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe created ads. Description of 'ad_specification' objects see below.
     */
    suspend fun createAds(accountId: Long, data: String): AdsCreateAdsResponse {
        val response = method("ads.createAds", mapOf("account_id" to accountId, "data" to data))
        return decodeResponse(response, json)
    }

    /**
     *
     * Creates advertising campaigns.
     * 
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe created campaigns. Description of 'campaign_specification' objects see below.
     */
    suspend fun createCampaigns(accountId: Long, data: String): AdsCreateCampaignsResponse {
        val response = method("ads.createCampaigns", mapOf("account_id" to accountId, "data" to data))
        return decodeResponse(response, json)
    }

    /**
     *
     * Creates clients of an advertising agency.
     * 
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe created campaigns. Description of 'client_specification' objects see below.
     */
    suspend fun createClients(accountId: Long, data: String): AdsCreateClientsResponse {
        val response = method("ads.createClients", mapOf("account_id" to accountId, "data" to data))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param accountId 
     * @param clientId 
     * @param sourceType 
     * @param retargetingGroupId 
     */
    suspend fun createLookalikeRequest(accountId: Long, sourceType: String, clientId: Long? = null, retargetingGroupId: Long? = null): AdsCreateLookalikeRequestResponse {
        val response = method("ads.createLookalikeRequest", mapOf("account_id" to accountId, "client_id" to clientId, "source_type" to sourceType, "retargeting_group_id" to retargetingGroupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Creates a group to re-target ads for users who visited advertiser's site (viewed information about the product, registered, etc.).
     * 
     * @param accountId Advertising account ID.
     * @param clientId 'Only for advertising agencies.', ID of the client with the advertising account where the group will be created.
     * @param name Name of the target group - a string up to 64 characters long.
     * @param lifetime 'For groups with auditory created with pixel code only.', , Number of days after that users will be automatically removed from the group.
     * @param targetPixelId 
     * @param targetPixelRules 
     */
    suspend fun createTargetGroup(accountId: Long, name: String, lifetime: Int, clientId: Long? = null, targetPixelId: Long? = null, targetPixelRules: String? = null): AdsCreateTargetGroupResponse {
        val response = method("ads.createTargetGroup", mapOf("account_id" to accountId, "client_id" to clientId, "name" to name, "lifetime" to lifetime, "target_pixel_id" to targetPixelId, "target_pixel_rules" to targetPixelRules))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param accountId 
     * @param clientId 
     * @param name 
     * @param domain 
     * @param categoryId 
     */
    suspend fun createTargetPixel(accountId: Long, name: String, categoryId: Long, clientId: Long? = null, domain: String? = null): AdsCreateTargetPixelResponse {
        val response = method("ads.createTargetPixel", mapOf("account_id" to accountId, "client_id" to clientId, "name" to name, "domain" to domain, "category_id" to categoryId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Archives ads.
     * 
     * @param accountId Advertising account ID.
     * @param ids Serialized JSON array with ad IDs.
     */
    suspend fun deleteAds(accountId: Long, ids: String): AdsDeleteAdsResponse {
        val response = method("ads.deleteAds", mapOf("account_id" to accountId, "ids" to ids))
        return decodeResponse(response, json)
    }

    /**
     *
     * Archives advertising campaigns.
     * 
     * @param accountId Advertising account ID.
     * @param ids Serialized JSON array with IDs of deleted campaigns.
     */
    suspend fun deleteCampaigns(accountId: Long, ids: String): AdsDeleteCampaignsResponse {
        val response = method("ads.deleteCampaigns", mapOf("account_id" to accountId, "ids" to ids))
        return decodeResponse(response, json)
    }

    /**
     *
     * Archives clients of an advertising agency.
     * 
     * @param accountId Advertising account ID.
     * @param ids Serialized JSON array with IDs of deleted clients.
     */
    suspend fun deleteClients(accountId: Long, ids: String): AdsDeleteClientsResponse {
        val response = method("ads.deleteClients", mapOf("account_id" to accountId, "ids" to ids))
        return decodeResponse(response, json)
    }

    /**
     *
     * Deletes a retarget group.
     * 
     * @param accountId Advertising account ID.
     * @param clientId 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
     * @param targetGroupId Group ID.
     */
    suspend fun deleteTargetGroup(accountId: Long, targetGroupId: Long, clientId: Long? = null): BaseOkResponse {
        val response = method("ads.deleteTargetGroup", mapOf("account_id" to accountId, "client_id" to clientId, "target_group_id" to targetGroupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param accountId 
     * @param clientId 
     * @param targetPixelId 
     */
    suspend fun deleteTargetPixel(accountId: Long, targetPixelId: Long, clientId: Long? = null): BaseUndefinedResponse {
        val response = method("ads.deleteTargetPixel", mapOf("account_id" to accountId, "client_id" to clientId, "target_pixel_id" to targetPixelId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of advertising accounts.
     * 
     */
    suspend fun getAccounts(): AdsGetAccountsResponse {
        val response = method("ads.getAccounts", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns number of ads.
     * 
     * @param accountId Advertising account ID.
     * @param adIds Filter by ads. Serialized JSON array with ad IDs. If the parameter is null, all ads will be shown.
     * @param campaignIds Filter by advertising campaigns. Serialized JSON array with campaign IDs. If the parameter is null, ads of all campaigns will be shown.
     * @param clientId 'Available and required for advertising agencies.' ID of the client ads are retrieved from.
     * @param includeDeleted Flag that specifies whether archived ads shall be shown: *0 - show only active ads,, *1 - show all ads.
     * @param onlyDeleted Flag that specifies whether to show only archived ads: *0 - show all ads,, *1 - show only archived ads. Available when include_deleted flag is *1.
     * @param limit Limit of number of returned ads. Used only if ad_ids parameter is null, and 'campaign_ids' parameter contains ID of only one campaign.
     * @param offset Offset. Used in the same cases as 'limit' parameter.
     */
    suspend fun getAds(accountId: Long, adIds: String? = null, campaignIds: String? = null, clientId: Long? = null, includeDeleted: Boolean? = false, onlyDeleted: Boolean? = false, limit: Int? = null, offset: Int? = null): AdsGetAdsResponse {
        val response = method("ads.getAds", mapOf("account_id" to accountId, "ad_ids" to adIds, "campaign_ids" to campaignIds, "client_id" to clientId, "include_deleted" to includeDeleted, "only_deleted" to onlyDeleted, "limit" to limit, "offset" to offset))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns descriptions of ad layouts.
     * 
     * @param accountId Advertising account ID.
     * @param clientId 'For advertising agencies.' ID of the client ads are retrieved from.
     * @param includeDeleted Flag that specifies whether archived ads shall be shown. *0 - show only active ads,, *1 - show all ads.
     * @param onlyDeleted Flag that specifies whether to show only archived ads: *0 - show all ads,, *1 - show only archived ads. Available when include_deleted flag is *1.
     * @param campaignIds Filter by advertising campaigns. Serialized JSON array with campaign IDs. If the parameter is null, ads of all campaigns will be shown.
     * @param adIds Filter by ads. Serialized JSON array with ad IDs. If the parameter is null, all ads will be shown.
     * @param limit Limit of number of returned ads. Used only if 'ad_ids' parameter is null, and 'campaign_ids' parameter contains ID of only one campaign.
     * @param offset Offset. Used in the same cases as 'limit' parameter.
     */
    suspend fun getAdsLayout(accountId: Long, clientId: Long? = null, includeDeleted: Boolean? = false, onlyDeleted: Boolean? = false, campaignIds: String? = null, adIds: String? = null, limit: Int? = null, offset: Int? = null): AdsGetAdsLayoutResponse {
        val response = method("ads.getAdsLayout", mapOf("account_id" to accountId, "client_id" to clientId, "include_deleted" to includeDeleted, "only_deleted" to onlyDeleted, "campaign_ids" to campaignIds, "ad_ids" to adIds, "limit" to limit, "offset" to offset))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns ad targeting parameters.
     * 
     * @param accountId Advertising account ID.
     * @param adIds Filter by ads. Serialized JSON array with ad IDs. If the parameter is null, all ads will be shown.
     * @param campaignIds Filter by advertising campaigns. Serialized JSON array with campaign IDs. If the parameter is null, ads of all campaigns will be shown.
     * @param clientId 'For advertising agencies.' ID of the client ads are retrieved from.
     * @param includeDeleted flag that specifies whether archived ads shall be shown: *0 - show only active ads,, *1 - show all ads.
     * @param limit Limit of number of returned ads. Used only if 'ad_ids' parameter is null, and 'campaign_ids' parameter contains ID of only one campaign.
     * @param offset Offset needed to return a specific subset of results.
     */
    suspend fun getAdsTargeting(accountId: Long, adIds: String? = null, campaignIds: String? = null, clientId: Long? = null, includeDeleted: Boolean? = false, limit: Int? = null, offset: Int? = null): AdsGetAdsTargetingResponse {
        val response = method("ads.getAdsTargeting", mapOf("account_id" to accountId, "ad_ids" to adIds, "campaign_ids" to campaignIds, "client_id" to clientId, "include_deleted" to includeDeleted, "limit" to limit, "offset" to offset))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns current budget of the advertising account.
     * 
     * @param accountId Advertising account ID.
     */
    suspend fun getBudget(accountId: Long): AdsGetBudgetResponse {
        val response = method("ads.getBudget", mapOf("account_id" to accountId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of campaigns in an advertising account.
     * 
     * @param accountId Advertising account ID.
     * @param clientId 'For advertising agencies'. ID of the client advertising campaigns are retrieved from.
     * @param includeDeleted Flag that specifies whether archived ads shall be shown. *0 - show only active campaigns,, *1 - show all campaigns.
     * @param campaignIds Filter of advertising campaigns to show. Serialized JSON array with campaign IDs. Only campaigns that exist in 'campaign_ids' and belong to the specified advertising account will be shown. If the parameter is null, all campaigns will be shown.
     * @param fields 
     */
    suspend fun getCampaigns(accountId: Long, clientId: Long? = null, includeDeleted: Boolean? = false, campaignIds: String? = null, fields: List<String>? = null): AdsGetCampaignsResponse {
        val response = method("ads.getCampaigns", mapOf("account_id" to accountId, "client_id" to clientId, "include_deleted" to includeDeleted, "campaign_ids" to campaignIds, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of possible ad categories.
     * 
     * @param lang Language. The full list of supported languages is [vk.com/dev/api_requests|here].
     */
    suspend fun getCategories(lang: String? = null): AdsGetCategoriesResponse {
        val response = method("ads.getCategories", mapOf("lang" to lang))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of advertising agency's clients.
     * 
     * @param accountId Advertising account ID.
     */
    suspend fun getClients(accountId: Long): AdsGetClientsResponse {
        val response = method("ads.getClients", mapOf("account_id" to accountId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns demographics for ads or campaigns.
     * 
     * @param accountId Advertising account ID.
     * @param idsType Type of requested objects listed in 'ids' parameter: *ad - ads,, *campaign - campaigns.
     * @param ids IDs requested ads or campaigns, separated with a comma, depending on the value set in 'ids_type'. Maximum 2000 objects.
     * @param period Data grouping by dates: *day - statistics by days,, *month - statistics by months,, *overall - overall statistics. 'date_from' and 'date_to' parameters set temporary limits.
     * @param dateFrom Date to show statistics from. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 - September 27, 2011, **0 - day it was created on,, *month: YYYY-MM, example: 2011-09 - September 2011, **0 - month it was created in,, *overall: 0.
     * @param dateTo Date to show statistics to. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 - September 27, 2011, **0 - current day,, *month: YYYY-MM, example: 2011-09 - September 2011, **0 - current month,, *overall: 0.
     */
    suspend fun getDemographics(accountId: Long, idsType: String, ids: String, period: String, dateFrom: String, dateTo: String): AdsGetDemographicsResponse {
        val response = method("ads.getDemographics", mapOf("account_id" to accountId, "ids_type" to idsType, "ids" to ids, "period" to period, "date_from" to dateFrom, "date_to" to dateTo))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns information about current state of a counter - number of remaining runs of methods and time to the next counter nulling in seconds.
     * 
     * @param accountId Advertising account ID.
     */
    suspend fun getFloodStats(accountId: Long): AdsGetFloodStatsResponse {
        val response = method("ads.getFloodStats", mapOf("account_id" to accountId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param accountId 
     * @param clientId 
     * @param requestsIds 
     * @param offset 
     * @param limit 
     * @param sortBy 
     */
    suspend fun getLookalikeRequests(accountId: Long, clientId: Long? = null, requestsIds: String? = null, offset: Int? = 0, limit: Int? = 10, sortBy: String? = "id"): AdsGetLookalikeRequestsResponse {
        val response = method("ads.getLookalikeRequests", mapOf("account_id" to accountId, "client_id" to clientId, "requests_ids" to requestsIds, "offset" to offset, "limit" to limit, "sort_by" to sortBy))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param artistName 
     */
    suspend fun getMusicians(artistName: String): AdsGetMusiciansResponse {
        val response = method("ads.getMusicians", mapOf("artist_name" to artistName))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param ids 
     */
    suspend fun getMusiciansByIds(ids: List<Int>): AdsGetMusiciansResponse {
        val response = method("ads.getMusiciansByIds", mapOf("ids" to ids))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of managers and supervisors of advertising account.
     * 
     * @param accountId Advertising account ID.
     */
    suspend fun getOfficeUsers(accountId: Long): AdsGetOfficeUsersResponse {
        val response = method("ads.getOfficeUsers", mapOf("account_id" to accountId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns detailed statistics of promoted posts reach from campaigns and ads.
     * 
     * @param accountId Advertising account ID.
     * @param idsType Type of requested objects listed in 'ids' parameter: *ad - ads,, *campaign - campaigns.
     * @param ids IDs requested ads or campaigns, separated with a comma, depending on the value set in 'ids_type'. Maximum 100 objects.
     */
    suspend fun getPostsReach(accountId: Long, idsType: String, ids: String): AdsGetPostsReachResponse {
        val response = method("ads.getPostsReach", mapOf("account_id" to accountId, "ids_type" to idsType, "ids" to ids))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a reason of ad rejection for pre-moderation.
     * 
     * @param accountId Advertising account ID.
     * @param adId Ad ID.
     */
    suspend fun getRejectionReason(accountId: Long, adId: Long): AdsGetRejectionReasonResponse {
        val response = method("ads.getRejectionReason", mapOf("account_id" to accountId, "ad_id" to adId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns statistics of performance indicators for ads, campaigns, clients or the whole account.
     * 
     * @param accountId Advertising account ID.
     * @param idsType Type of requested objects listed in 'ids' parameter: *ad - ads,, *campaign - campaigns,, *client - clients,, *office - account.
     * @param ids IDs requested ads, campaigns, clients or account, separated with a comma, depending on the value set in 'ids_type'. Maximum 2000 objects.
     * @param period Data grouping by dates: *day - statistics by days,, *month - statistics by months,, *overall - overall statistics. 'date_from' and 'date_to' parameters set temporary limits.
     * @param dateFrom Date to show statistics from. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 - September 27, 2011, **0 - day it was created on,, *month: YYYY-MM, example: 2011-09 - September 2011, **0 - month it was created in,, *overall: 0.
     * @param dateTo Date to show statistics to. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 - September 27, 2011, **0 - current day,, *month: YYYY-MM, example: 2011-09 - September 2011, **0 - current month,, *overall: 0.
     * @param statsFields Additional fields to add to statistics.
     */
    suspend fun getStatistics(accountId: Long, idsType: String, ids: String, period: String, dateFrom: String, dateTo: String, statsFields: List<String>? = null): AdsGetStatisticsResponse {
        val response = method("ads.getStatistics", mapOf("account_id" to accountId, "ids_type" to idsType, "ids" to ids, "period" to period, "date_from" to dateFrom, "date_to" to dateTo, "stats_fields" to statsFields))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a set of auto-suggestions for various targeting parameters.
     * 
     * @param section Section, suggestions are retrieved in. Available values: *countries - request of a list of countries. If q is not set or blank, a short list of countries is shown. Otherwise, a full list of countries is shown. *regions - requested list of regions. 'country' parameter is required. *cities - requested list of cities. 'country' parameter is required. *districts - requested list of districts. 'cities' parameter is required. *stations - requested list of subway stations. 'cities' parameter is required. *streets - requested list of streets. 'cities' parameter is required. *schools - requested list of educational organizations. 'cities' parameter is required. *interests - requested list of interests. *positions - requested list of positions (professions). *group_types - requested list of group types. *religions - requested list of religious commitments. *browsers - requested list of browsers and mobile devices.
     * @param ids Objects IDs separated by commas. If the parameter is passed, 'q, country, cities' should not be passed.
     * @param q Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
     * @param country ID of the country objects are searched in.
     * @param cities IDs of cities where objects are searched in, separated with a comma.
     * @param lang Language of the returned string values. Supported languages: *ru - Russian,, *ua - Ukrainian,, *en - English.
     */
    suspend fun getSuggestions(section: String, ids: String? = null, q: String? = null, country: Int? = null, cities: String? = null, lang: String? = null): GetSuggestionsResponse {
        val response = method("ads.getSuggestions", mapOf("section" to section, "ids" to ids, "q" to q, "country" to country, "cities" to cities, "lang" to lang))
        return GetSuggestionsResponse(response, json)
    }
    class GetSuggestionsResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun AdsGetSuggestionsCitiesResponse(): AdsGetSuggestionsCitiesResponse? {
            return getResponseOrNull(ListSerializer(AdsTargSuggestionsCities.serializer()), rawResponse)
        }
        fun AdsGetSuggestionsRegionsResponse(): AdsGetSuggestionsRegionsResponse? {
            return getResponseOrNull(ListSerializer(AdsTargSuggestionsRegions.serializer()), rawResponse)
        }
        fun AdsGetSuggestionsResponse(): AdsGetSuggestionsResponse? {
            return getResponseOrNull(ListSerializer(AdsTargSuggestions.serializer()), rawResponse)
        }
        fun AdsGetSuggestionsSchoolsResponse(): AdsGetSuggestionsSchoolsResponse? {
            return getResponseOrNull(ListSerializer(AdsTargSuggestionsSchools.serializer()), rawResponse)
        }
    }

    /**
     *
     * Returns a list of target groups.
     * 
     * @param accountId Advertising account ID.
     * @param clientId 'Only for advertising agencies.', ID of the client with the advertising account where the group will be created.
     * @param extended '1' - to return pixel code.
     */
    suspend fun getTargetGroups(accountId: Long, clientId: Long? = null, extended: Boolean? = false): AdsGetTargetGroupsResponse {
        val response = method("ads.getTargetGroups", mapOf("account_id" to accountId, "client_id" to clientId, "extended" to extended))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param accountId 
     * @param clientId 
     */
    suspend fun getTargetPixels(accountId: Long, clientId: Long? = null): AdsGetTargetPixelsResponse {
        val response = method("ads.getTargetPixels", mapOf("account_id" to accountId, "client_id" to clientId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns the size of targeting audience, and also recommended values for CPC and CPM.
     * 
     * @param accountId Advertising account ID.
     * @param clientId 
     * @param criteria Serialized JSON object that describes targeting parameters. Description of 'criteria' object see below.
     * @param adId ID of an ad which targeting parameters shall be analyzed.
     * @param adFormat Ad format. Possible values: *'1' - image and text,, *'2' - big image,, *'3' - exclusive format,, *'4' - community, square image,, *'7' - special app format,, *'8' - special community format,, *'9' - post in community,, *'10' - app board.
     * @param adPlatform Platforms to use for ad showing. Possible values: (for 'ad_format' = '1'), *'0' - VK and partner sites,, *'1' - VK only. (for 'ad_format' = '9'), *'all' - all platforms,, *'desktop' - desktop version,, *'mobile' - mobile version and apps.
     * @param adPlatformNoWall 
     * @param adPlatformNoAdNetwork 
     * @param publisherPlatforms 
     * @param linkUrl URL for the advertised object.
     * @param linkDomain Domain of the advertised object.
     * @param needPrecise Additionally return recommended cpc and cpm to reach 5,10..95 percents of audience.
     * @param impressionsLimitPeriod Impressions limit period in seconds, must be a multiple of 86400(day).
     */
    suspend fun getTargetingStats(accountId: Long, linkUrl: String, clientId: Long? = null, criteria: String? = null, adId: Long? = null, adFormat: Int? = null, adPlatform: String? = null, adPlatformNoWall: String? = null, adPlatformNoAdNetwork: String? = null, publisherPlatforms: String? = null, linkDomain: String? = null, needPrecise: Boolean? = false, impressionsLimitPeriod: Int? = null): AdsGetTargetingStatsResponse {
        val response = method("ads.getTargetingStats", mapOf("account_id" to accountId, "client_id" to clientId, "criteria" to criteria, "ad_id" to adId, "ad_format" to adFormat, "ad_platform" to adPlatform, "ad_platform_no_wall" to adPlatformNoWall, "ad_platform_no_ad_network" to adPlatformNoAdNetwork, "publisher_platforms" to publisherPlatforms, "link_url" to linkUrl, "link_domain" to linkDomain, "need_precise" to needPrecise, "impressions_limit_period" to impressionsLimitPeriod))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns URL to upload an ad photo to.
     * 
     * @param adFormat Ad format: *1 - image and text,, *2 - big image,, *3 - exclusive format,, *4 - community, square image,, *7 - special app format.
     * @param icon 
     */
    suspend fun getUploadURL(adFormat: Int, icon: Int? = null): AdsGetUploadURLResponse {
        val response = method("ads.getUploadURL", mapOf("ad_format" to adFormat, "icon" to icon))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns URL to upload an ad video to.
     * 
     */
    suspend fun getVideoUploadURL(): AdsGetVideoUploadURLResponse {
        val response = method("ads.getVideoUploadURL", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * Imports a list of advertiser's contacts to count VK registered users against the target group.
     * 
     * @param accountId Advertising account ID.
     * @param clientId 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
     * @param targetGroupId Target group ID.
     * @param contacts List of phone numbers, emails or user IDs separated with a comma.
     */
    suspend fun importTargetContacts(accountId: Long, targetGroupId: Long, contacts: String, clientId: Long? = null): AdsImportTargetContactsResponse {
        val response = method("ads.importTargetContacts", mapOf("account_id" to accountId, "client_id" to clientId, "target_group_id" to targetGroupId, "contacts" to contacts))
        return decodeResponse(response, json)
    }

    /**
     *
     * Removes managers and/or supervisors from advertising account.
     * 
     * @param accountId Advertising account ID.
     * @param ids Serialized JSON array with IDs of deleted managers.
     */
    suspend fun removeOfficeUsers(accountId: Long, ids: String): AdsRemoveOfficeUsersResponse {
        val response = method("ads.removeOfficeUsers", mapOf("account_id" to accountId, "ids" to ids))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param accountId 
     * @param clientId 
     * @param targetGroupId 
     * @param contacts 
     */
    suspend fun removeTargetContacts(accountId: Long, targetGroupId: Long, contacts: String, clientId: Long? = null): AdsRemoveTargetContactsResponse {
        val response = method("ads.removeTargetContacts", mapOf("account_id" to accountId, "client_id" to clientId, "target_group_id" to targetGroupId, "contacts" to contacts))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param accountId 
     * @param clientId 
     * @param requestId 
     * @param level 
     */
    suspend fun saveLookalikeRequestResult(accountId: Long, requestId: Long, level: Int, clientId: Long? = null): AdsSaveLookalikeRequestResultResponse {
        val response = method("ads.saveLookalikeRequestResult", mapOf("account_id" to accountId, "client_id" to clientId, "request_id" to requestId, "level" to level))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param accountId 
     * @param clientId 
     * @param targetGroupId 
     * @param shareWithClientId 
     */
    suspend fun shareTargetGroup(accountId: Long, targetGroupId: Long, clientId: Long? = null, shareWithClientId: Long? = null): AdsShareTargetGroupResponse {
        val response = method("ads.shareTargetGroup", mapOf("account_id" to accountId, "client_id" to clientId, "target_group_id" to targetGroupId, "share_with_client_id" to shareWithClientId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits ads.
     * 
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe changes in ads. Description of 'ad_edit_specification' objects see below.
     */
    suspend fun updateAds(accountId: Long, data: String): AdsUpdateAdsResponse {
        val response = method("ads.updateAds", mapOf("account_id" to accountId, "data" to data))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits advertising campaigns.
     * 
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe changes in campaigns. Description of 'campaign_mod' objects see below.
     */
    suspend fun updateCampaigns(accountId: Long, data: String): AdsUpdateCampaignsResponse {
        val response = method("ads.updateCampaigns", mapOf("account_id" to accountId, "data" to data))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits clients of an advertising agency.
     * 
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe changes in clients. Description of 'client_mod' objects see below.
     */
    suspend fun updateClients(accountId: Long, data: String): AdsUpdateClientsResponse {
        val response = method("ads.updateClients", mapOf("account_id" to accountId, "data" to data))
        return decodeResponse(response, json)
    }

    /**
     *
     * Adds managers and/or supervisors to advertising account.
     * 
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
     */
    suspend fun updateOfficeUsers(accountId: Long, data: String): AdsUpdateOfficeUsersResponse {
        val response = method("ads.updateOfficeUsers", mapOf("account_id" to accountId, "data" to data))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits a retarget group.
     * 
     * @param accountId Advertising account ID.
     * @param clientId 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
     * @param targetGroupId Group ID.
     * @param name New name of the target group - a string up to 64 characters long.
     * @param domain Domain of the site where user accounting code will be placed.
     * @param lifetime 'Only for the groups that get audience from sites with user accounting code.', Time in days when users added to a retarget group will be automatically excluded from it. '0' - automatic exclusion is off.
     * @param targetPixelId 
     * @param targetPixelRules 
     */
    suspend fun updateTargetGroup(accountId: Long, targetGroupId: Long, name: String, lifetime: Int, clientId: Long? = null, domain: String? = null, targetPixelId: Long? = null, targetPixelRules: String? = null): BaseOkResponse {
        val response = method("ads.updateTargetGroup", mapOf("account_id" to accountId, "client_id" to clientId, "target_group_id" to targetGroupId, "name" to name, "domain" to domain, "lifetime" to lifetime, "target_pixel_id" to targetPixelId, "target_pixel_rules" to targetPixelRules))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param accountId 
     * @param clientId 
     * @param targetPixelId 
     * @param name 
     * @param domain 
     * @param categoryId 
     */
    suspend fun updateTargetPixel(accountId: Long, targetPixelId: Long, name: String, categoryId: Long, clientId: Long? = null, domain: String? = null): BaseUndefinedResponse {
        val response = method("ads.updateTargetPixel", mapOf("account_id" to accountId, "client_id" to clientId, "target_pixel_id" to targetPixelId, "name" to name, "domain" to domain, "category_id" to categoryId))
        return decodeResponse(response, json)
    }

}
