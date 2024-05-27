package ru.krindra.vknorthtypes.methods

import ru.krindra.vknorthtypes.types.database.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton

class Database(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Returns list of chairs on a specified faculty.
     * 
     * @param facultyId id of the faculty to get chairs from.
     * @param offset offset required to get a certain subset of chairs.
     * @param count amount of chairs to get.
     */
    suspend fun getChairs(facultyId: Long, offset: Int? = null, count: Int? = 100): DatabaseGetChairsResponse {
        val response = method("database.getChairs", mapOf("faculty_id" to facultyId, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of cities.
     * 
     * @param countryId Country ID.
     * @param regionId Region ID.
     * @param q Search query.
     * @param needAll '1' - to return all cities in the country, '0' - to return major cities in the country (default),.
     * @param offset Offset needed to return a specific subset of cities.
     * @param count Number of cities to return.
     */
    suspend fun getCities(countryId: Long? = null, regionId: Long? = null, q: String? = null, needAll: Boolean? = false, offset: Int? = null, count: Int? = 100): DatabaseGetCitiesResponse {
        val response = method("database.getCities", mapOf("country_id" to countryId, "region_id" to regionId, "q" to q, "need_all" to needAll, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns information about cities by their IDs.
     * 
     * @param cityIds City IDs.
     */
    suspend fun getCitiesById(cityIds: List<Int>? = null): DatabaseGetCitiesByIdResponse {
        val response = method("database.getCitiesById", mapOf("city_ids" to cityIds))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of countries.
     * 
     * @param needAll '1' - to return a full list of all countries, '0' - to return a list of countries near the current user's country (default).
     * @param code Country codes in [vk.com/dev/country_codes|ISO 3166-1 alpha-2] standard.
     * @param offset Offset needed to return a specific subset of countries.
     * @param count Number of countries to return.
     */
    suspend fun getCountries(needAll: Boolean? = false, code: String? = null, offset: Int? = null, count: Int? = 100): DatabaseGetCountriesResponse {
        val response = method("database.getCountries", mapOf("need_all" to needAll, "code" to code, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns information about countries by their IDs.
     * 
     * @param countryIds Country IDs.
     */
    suspend fun getCountriesById(countryIds: List<Int>? = null): DatabaseGetCountriesByIdResponse {
        val response = method("database.getCountriesById", mapOf("country_ids" to countryIds))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of faculties (i.e., university departments).
     * 
     * @param universityId University ID.
     * @param offset Offset needed to return a specific subset of faculties.
     * @param count Number of faculties to return.
     */
    suspend fun getFaculties(universityId: Long, offset: Int? = null, count: Int? = 100): DatabaseGetFacultiesResponse {
        val response = method("database.getFaculties", mapOf("university_id" to universityId, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * Get metro stations by city
     * 
     * @param cityId 
     * @param offset 
     * @param count 
     * @param extended 
     */
    suspend fun getMetroStations(cityId: Long, offset: Int? = null, count: Int? = 100, extended: Boolean? = false): DatabaseGetMetroStationsResponse {
        val response = method("database.getMetroStations", mapOf("city_id" to cityId, "offset" to offset, "count" to count, "extended" to extended))
        return decodeResponse(response, json)
    }

    /**
     *
     * Get metro station by his id
     * 
     * @param stationIds 
     */
    suspend fun getMetroStationsById(stationIds: List<Int>? = null): DatabaseGetMetroStationsByIdResponse {
        val response = method("database.getMetroStationsById", mapOf("station_ids" to stationIds))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of regions.
     * 
     * @param countryId Country ID, received in [vk.com/dev/database.getCountries|database.getCountries] method.
     * @param q Search query.
     * @param offset Offset needed to return specific subset of regions.
     * @param count Number of regions to return.
     */
    suspend fun getRegions(countryId: Long, q: String? = null, offset: Int? = null, count: Int? = 100): DatabaseGetRegionsResponse {
        val response = method("database.getRegions", mapOf("country_id" to countryId, "q" to q, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of school classes specified for the country.
     * 
     * @param countryId Country ID.
     */
    suspend fun getSchoolClasses(countryId: Long? = null): DatabaseGetSchoolClassesNewResponse {
        val response = method("database.getSchoolClasses", mapOf("country_id" to countryId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of schools.
     * 
     * @param q Search query.
     * @param cityId City ID.
     * @param offset Offset needed to return a specific subset of schools.
     * @param count Number of schools to return.
     */
    suspend fun getSchools(cityId: Long, q: String? = null, offset: Int? = null, count: Int? = 100): DatabaseGetSchoolsResponse {
        val response = method("database.getSchools", mapOf("q" to q, "city_id" to cityId, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of higher education institutions.
     * 
     * @param q Search query.
     * @param countryId Country ID.
     * @param cityId City ID.
     * @param offset Offset needed to return a specific subset of universities.
     * @param count Number of universities to return.
     */
    suspend fun getUniversities(q: String? = null, countryId: Long? = null, cityId: Long? = null, offset: Int? = null, count: Int? = 100): DatabaseGetUniversitiesResponse {
        val response = method("database.getUniversities", mapOf("q" to q, "country_id" to countryId, "city_id" to cityId, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

}
