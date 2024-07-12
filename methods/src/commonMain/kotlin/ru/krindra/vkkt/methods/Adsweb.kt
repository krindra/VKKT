package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.adsweb.*
import ru.krindra.vkkt.objects.adsweb.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json

class Adsweb(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param officeId 
     */
    suspend fun getAdCategories(officeId: Long): AdswebGetAdCategoriesResponse {
        val response = method("adsweb.getAdCategories", mapOf("office_id" to officeId))
        return decodeResponse(response, json)
    }

    /**
     *
     */
    suspend fun getAdUnitCode(): AdswebGetAdUnitCodeResponse {
        val response = method("adsweb.getAdUnitCode", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * @param officeId 
     * @param sitesIds 
     * @param adUnitsIds 
     * @param fields 
     * @param limit 
     * @param offset 
     */
    suspend fun getAdUnits(officeId: Long, sitesIds: String? = null, adUnitsIds: String? = null, fields: String? = null, limit: Int? = null, offset: Int? = 0): AdswebGetAdUnitsResponse {
        val response = method("adsweb.getAdUnits", mapOf("office_id" to officeId, "sites_ids" to sitesIds, "ad_units_ids" to adUnitsIds, "fields" to fields, "limit" to limit, "offset" to offset))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param officeId 
     * @param sitesIds 
     * @param limit 
     * @param offset 
     */
    suspend fun getFraudHistory(officeId: Long, sitesIds: String? = null, limit: Int? = null, offset: Int? = 0): AdswebGetFraudHistoryResponse {
        val response = method("adsweb.getFraudHistory", mapOf("office_id" to officeId, "sites_ids" to sitesIds, "limit" to limit, "offset" to offset))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param officeId 
     * @param sitesIds 
     * @param fields 
     * @param limit 
     * @param offset 
     */
    suspend fun getSites(officeId: Long, sitesIds: String? = null, fields: String? = null, limit: Int? = null, offset: Int? = 0): AdswebGetSitesResponse {
        val response = method("adsweb.getSites", mapOf("office_id" to officeId, "sites_ids" to sitesIds, "fields" to fields, "limit" to limit, "offset" to offset))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param officeId 
     * @param idsType 
     * @param ids 
     * @param period 
     * @param dateFrom 
     * @param dateTo 
     * @param fields 
     * @param limit 
     * @param pageId 
     */
    suspend fun getStatistics(officeId: Long, idsType: String, ids: String, period: String, dateFrom: String, dateTo: String, fields: String? = null, limit: Int? = null, pageId: String? = null): AdswebGetStatisticsResponse {
        val response = method("adsweb.getStatistics", mapOf("office_id" to officeId, "ids_type" to idsType, "ids" to ids, "period" to period, "date_from" to dateFrom, "date_to" to dateTo, "fields" to fields, "limit" to limit, "page_id" to pageId))
        return decodeResponse(response, json)
    }

}
