package ru.krindra.vknorthtypes.methods

import ru.krindra.vknorthtypes.types.groups.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.users.UsersFields
import ru.krindra.vknorthtypes.types.base.BaseBoolResponse
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.builtins.ListSerializer
import ru.krindra.vknorthtypes.types.address.AddressFields
import ru.krindra.vknorthtypes.types.base.BaseUserGroupFields
import ru.krindra.vknorthtypes.types.base.BaseOkResponse
import ru.krindra.vknorthtypes.BaseMultivariateResponse

class Groups(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * @param groupId 
     * @param title 
     * @param address 
     * @param additionalAddress 
     * @param cityId 
     * @param metroId 
     * @param latitude 
     * @param longitude 
     * @param phone 
     * @param workInfoStatus 
     * @param timetable 
     * @param isMainAddress 
     */
    suspend fun addAddress(groupId: Long, title: String, address: String, cityId: Long, latitude: Double, longitude: Double, additionalAddress: String? = null, metroId: Long? = null, phone: String? = null, workInfoStatus: String? = "no_information", timetable: String? = null, isMainAddress: Boolean? = false): GroupsAddAddressResponse {
        val response = method("groups.addAddress", mapOf("group_id" to groupId, "title" to title, "address" to address, "additional_address" to additionalAddress, "city_id" to cityId, "metro_id" to metroId, "latitude" to latitude, "longitude" to longitude, "phone" to phone, "work_info_status" to workInfoStatus, "timetable" to timetable, "is_main_address" to isMainAddress))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param url 
     * @param title 
     * @param secretKey 
     */
    suspend fun addCallbackServer(groupId: Long, url: String, title: String, secretKey: String? = null): GroupsAddCallbackServerResponse {
        val response = method("groups.addCallbackServer", mapOf("group_id" to groupId, "url" to url, "title" to title, "secret_key" to secretKey))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to add a link to the community.
     * 
     * @param groupId Community ID.
     * @param link Link URL.
     * @param text Description text for the link.
     */
    suspend fun addLink(groupId: Long, link: String, text: String? = null): GroupsAddLinkResponse {
        val response = method("groups.addLink", mapOf("group_id" to groupId, "link" to link, "text" to text))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to approve join request to the community.
     * 
     * @param groupId Community ID.
     * @param userId User ID.
     */
    suspend fun approveRequest(groupId: Long, userId: Long): BaseOkResponse {
        val response = method("groups.approveRequest", mapOf("group_id" to groupId, "user_id" to userId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param ownerId 
     * @param endDate 
     * @param reason 
     * @param comment 
     * @param commentVisible 
     */
    suspend fun ban(groupId: Long, ownerId: Long? = null, endDate: Int? = null, reason: Int? = null, comment: String? = null, commentVisible: Boolean? = false): BaseOkResponse {
        val response = method("groups.ban", mapOf("group_id" to groupId, "owner_id" to ownerId, "end_date" to endDate, "reason" to reason, "comment" to comment, "comment_visible" to commentVisible))
        return decodeResponse(response, json)
    }

    /**
     *
     * Creates a new community.
     * 
     * @param title Community title.
     * @param description Community description (ignored for 'type' = 'public').
     * @param type Community type. Possible values: *'group' - group,, *'event' - event,, *'public' - public page.
     * @param publicCategory Category ID (for 'type' = 'public' only).
     * @param publicSubcategory Public page subcategory ID.
     * @param subtype Public page subtype. Possible values: *'1' - place or small business,, *'2' - company, organization or website,, *'3' - famous person or group of people,, *'4' - product or work of art.
     */
    suspend fun create(title: String, description: String? = null, type: String? = "group", publicCategory: Int? = null, publicSubcategory: Int? = null, subtype: Int? = null): GroupsCreateResponse {
        val response = method("groups.create", mapOf("title" to title, "description" to description, "type" to type, "public_category" to publicCategory, "public_subcategory" to publicSubcategory, "subtype" to subtype))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param addressId 
     */
    suspend fun deleteAddress(groupId: Long, addressId: Long): BaseOkResponse {
        val response = method("groups.deleteAddress", mapOf("group_id" to groupId, "address_id" to addressId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param serverId 
     */
    suspend fun deleteCallbackServer(groupId: Long, serverId: Long): BaseOkResponse {
        val response = method("groups.deleteCallbackServer", mapOf("group_id" to groupId, "server_id" to serverId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to delete a link from the community.
     * 
     * @param groupId Community ID.
     * @param linkId Link ID.
     */
    suspend fun deleteLink(groupId: Long, linkId: Long): BaseOkResponse {
        val response = method("groups.deleteLink", mapOf("group_id" to groupId, "link_id" to linkId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     */
    suspend fun disableOnline(groupId: Long): BaseOkResponse {
        val response = method("groups.disableOnline", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Edits a community.
     * 
     * @param groupId Community ID.
     * @param title Community title.
     * @param description Community description.
     * @param screenName Community screen name.
     * @param access Community type. Possible values: *'0' - open,, *'1' - closed,, *'2' - private.
     * @param website Website that will be displayed in the community information field.
     * @param subject Community subject. Possible values: , *'1' - auto/moto,, *'2' - activity holidays,, *'3' - business,, *'4' - pets,, *'5' - health,, *'6' - dating and communication, , *'7' - games,, *'8' - IT (computers and software),, *'9' - cinema,, *'10' - beauty and fashion,, *'11' - cooking,, *'12' - art and culture,, *'13' - literature,, *'14' - mobile services and internet,, *'15' - music,, *'16' - science and technology,, *'17' - real estate,, *'18' - news and media,, *'19' - security,, *'20' - education,, *'21' - home and renovations,, *'22' - politics,, *'23' - food,, *'24' - industry,, *'25' - travel,, *'26' - work,, *'27' - entertainment,, *'28' - religion,, *'29' - family,, *'30' - sports,, *'31' - insurance,, *'32' - television,, *'33' - goods and services,, *'34' - hobbies,, *'35' - finance,, *'36' - photo,, *'37' - esoterics,, *'38' - electronics and appliances,, *'39' - erotic,, *'40' - humor,, *'41' - society, humanities,, *'42' - design and graphics.
     * @param email Organizer email (for events).
     * @param phone Organizer phone number (for events).
     * @param rss RSS feed address for import (available only to communities with special permission. Contact vk.com/support to get it.
     * @param eventStartDate Event start date in Unixtime format.
     * @param eventFinishDate Event finish date in Unixtime format.
     * @param eventGroupId Organizer community ID (for events only).
     * @param publicCategory Public page category ID.
     * @param publicSubcategory Public page subcategory ID.
     * @param publicDate Founding date of a company or organization owning the community in "dd.mm.YYYY" format.
     * @param wall Wall settings. Possible values: *'0' - disabled,, *'1' - open,, *'2' - limited (groups and events only),, *'3' - closed (groups and events only).
     * @param topics Board topics settings. Possbile values: , *'0' - disabled,, *'1' - open,, *'2' - limited (for groups and events only).
     * @param photos Photos settings. Possible values: *'0' - disabled,, *'1' - open,, *'2' - limited (for groups and events only).
     * @param video Video settings. Possible values: *'0' - disabled,, *'1' - open,, *'2' - limited (for groups and events only).
     * @param audio Audio settings. Possible values: *'0' - disabled,, *'1' - open,, *'2' - limited (for groups and events only).
     * @param links Links settings (for public pages only). Possible values: *'0' - disabled,, *'1' - enabled.
     * @param events Events settings (for public pages only). Possible values: *'0' - disabled,, *'1' - enabled.
     * @param places Places settings (for public pages only). Possible values: *'0' - disabled,, *'1' - enabled.
     * @param contacts Contacts settings (for public pages only). Possible values: *'0' - disabled,, *'1' - enabled.
     * @param docs Documents settings. Possible values: *'0' - disabled,, *'1' - open,, *'2' - limited (for groups and events only).
     * @param wiki Wiki pages settings. Possible values: *'0' - disabled,, *'1' - open,, *'2' - limited (for groups and events only).
     * @param messages Community messages. Possible values: *'0' - disabled,, *'1' - enabled.
     * @param articles 
     * @param addresses 
     * @param ageLimits Community age limits. Possible values: *'1' - no limits,, *'2' - 16+,, *'3' - 18+.
     * @param market Market settings. Possible values: *'0' - disabled,, *'1' - enabled.
     * @param marketButtons Buttons details, see market/objects.json#/definitions/market_custom_button.
     * @param marketComments market comments settings. Possible values: *'0' - disabled,, *'1' - enabled.
     * @param marketCountry Market delivery countries.
     * @param marketCity Market delivery cities (if only one country is specified).
     * @param marketCurrency Market currency settings. Possbile values: , *'643' - Russian rubles,, *'980' - Ukrainian hryvnia,, *'398' - Kazakh tenge,, *'978' - Euro,, *'840' - US dollars.
     * @param marketContact Seller contact for market. Set '0' for community messages.
     * @param marketWiki ID of a wiki page with market description.
     * @param obsceneFilter Obscene expressions filter in comments. Possible values: , *'0' - disabled,, *'1' - enabled.
     * @param obsceneStopwords Stopwords filter in comments. Possible values: , *'0' - disabled,, *'1' - enabled.
     * @param obsceneWords Keywords for stopwords filter.
     * @param mainSection 
     * @param secondarySection 
     * @param country Country of the community.
     * @param city City of the community.
     */
    suspend fun edit(groupId: Long, title: String? = null, description: String? = null, screenName: String? = null, access: Int? = null, website: String? = null, subject: Int? = null, email: String? = null, phone: String? = null, rss: String? = null, eventStartDate: Int? = null, eventFinishDate: Int? = null, eventGroupId: Long? = null, publicCategory: Int? = null, publicSubcategory: Int? = null, publicDate: String? = null, wall: Int? = null, topics: Int? = null, photos: Int? = null, video: Int? = null, audio: Int? = null, links: Boolean? = false, events: Boolean? = false, places: Boolean? = false, contacts: Boolean? = false, docs: Int? = null, wiki: Int? = null, messages: Boolean? = false, articles: Boolean? = false, addresses: Boolean? = false, ageLimits: Int? = 1, market: Boolean? = false, marketButtons: String? = null, marketComments: Boolean? = false, marketCountry: List<Int>? = null, marketCity: List<Int>? = null, marketCurrency: Int? = null, marketContact: Int? = null, marketWiki: Int? = null, obsceneFilter: Boolean? = false, obsceneStopwords: Boolean? = false, obsceneWords: List<String>? = null, mainSection: Int? = null, secondarySection: Int? = null, country: Int? = null, city: Int? = null): BaseOkResponse {
        val response = method("groups.edit", mapOf("group_id" to groupId, "title" to title, "description" to description, "screen_name" to screenName, "access" to access, "website" to website, "subject" to subject, "email" to email, "phone" to phone, "rss" to rss, "event_start_date" to eventStartDate, "event_finish_date" to eventFinishDate, "event_group_id" to eventGroupId, "public_category" to publicCategory, "public_subcategory" to publicSubcategory, "public_date" to publicDate, "wall" to wall, "topics" to topics, "photos" to photos, "video" to video, "audio" to audio, "links" to links, "events" to events, "places" to places, "contacts" to contacts, "docs" to docs, "wiki" to wiki, "messages" to messages, "articles" to articles, "addresses" to addresses, "age_limits" to ageLimits, "market" to market, "market_buttons" to marketButtons, "market_comments" to marketComments, "market_country" to marketCountry, "market_city" to marketCity, "market_currency" to marketCurrency, "market_contact" to marketContact, "market_wiki" to marketWiki, "obscene_filter" to obsceneFilter, "obscene_stopwords" to obsceneStopwords, "obscene_words" to obsceneWords, "main_section" to mainSection, "secondary_section" to secondarySection, "country" to country, "city" to city))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param addressId 
     * @param title 
     * @param address 
     * @param additionalAddress 
     * @param cityId 
     * @param metroId 
     * @param latitude 
     * @param longitude 
     * @param phone 
     * @param workInfoStatus 
     * @param timetable 
     * @param isMainAddress 
     */
    suspend fun editAddress(groupId: Long, addressId: Long, title: String? = null, address: String? = null, additionalAddress: String? = null, cityId: Long? = null, metroId: Long? = null, latitude: Double? = null, longitude: Double? = null, phone: String? = null, workInfoStatus: String? = null, timetable: String? = null, isMainAddress: Boolean? = false): GroupsEditAddressResponse {
        val response = method("groups.editAddress", mapOf("group_id" to groupId, "address_id" to addressId, "title" to title, "address" to address, "additional_address" to additionalAddress, "city_id" to cityId, "metro_id" to metroId, "latitude" to latitude, "longitude" to longitude, "phone" to phone, "work_info_status" to workInfoStatus, "timetable" to timetable, "is_main_address" to isMainAddress))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param serverId 
     * @param url 
     * @param title 
     * @param secretKey 
     */
    suspend fun editCallbackServer(groupId: Long, serverId: Long, url: String, title: String, secretKey: String? = null): BaseOkResponse {
        val response = method("groups.editCallbackServer", mapOf("group_id" to groupId, "server_id" to serverId, "url" to url, "title" to title, "secret_key" to secretKey))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to edit a link in the community.
     * 
     * @param groupId Community ID.
     * @param linkId Link ID.
     * @param text New description text for the link.
     */
    suspend fun editLink(groupId: Long, linkId: Long, text: String? = null): BaseOkResponse {
        val response = method("groups.editLink", mapOf("group_id" to groupId, "link_id" to linkId, "text" to text))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to add, remove or edit the community manager.
     * 
     * @param groupId Community ID.
     * @param userId User ID.
     * @param role Manager role. Possible values: *'moderator',, *'editor',, *'administrator',, *'advertiser'.
     * @param isCallOperator '1' — allow the manager to accept community calls.
     * @param isContact '1' - to show the manager in Contacts block of the community.
     * @param contactPosition Position to show in Contacts block.
     * @param contactPhone Contact phone.
     * @param contactEmail Contact e-mail.
     */
    suspend fun editManager(groupId: Long, userId: Long, role: String? = null, isCallOperator: Boolean? = false, isContact: Boolean? = false, contactPosition: String? = null, contactPhone: String? = null, contactEmail: String? = null): BaseOkResponse {
        val response = method("groups.editManager", mapOf("group_id" to groupId, "user_id" to userId, "role" to role, "is_call_operator" to isCallOperator, "is_contact" to isContact, "contact_position" to contactPosition, "contact_phone" to contactPhone, "contact_email" to contactEmail))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     */
    suspend fun enableOnline(groupId: Long): BaseOkResponse {
        val response = method("groups.enableOnline", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of the communities to which a user belongs.
     * 
     * @param userId User ID.
     * @param extended '1' - to return complete information about a user's communities, '0' - to return a list of community IDs without any additional fields (default),.
     * @param filter Types of communities to return: 'admin' - to return communities administered by the user , 'editor' - to return communities where the user is an administrator or editor, 'moder' - to return communities where the user is an administrator, editor, or moderator, 'groups' - to return only groups, 'publics' - to return only public pages, 'events' - to return only events.
     * @param fields Profile fields to return.
     * @param offset Offset needed to return a specific subset of communities.
     * @param count Number of communities to return.
     */
    suspend fun get(userId: Long? = null, extended: Boolean? = false, filter: List<GroupsFilter>? = null, fields: List<GroupsFields>? = null, offset: Int? = null, count: Int? = null): GetResponse {
        val response = method("groups.get", mapOf("user_id" to userId, "extended" to extended, "filter" to filter, "fields" to fields, "offset" to offset, "count" to count))
        return GetResponse(response, json)
    }
    class GetResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun GroupsGetObjectExtendedResponse(): GroupsGetObjectExtendedResponse? {
            return getResponseOrNull(GroupsGetObjectExtendedResponse.serializer(), rawResponse)
        }
        fun GroupsGetResponse(): GroupsGetResponse? {
            return getResponseOrNull(GroupsGetResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns a list of community addresses.
     * 
     * @param groupId ID or screen name of the community.
     * @param addressIds 
     * @param latitude Latitude of  the user geo position.
     * @param longitude Longitude of the user geo position.
     * @param offset Offset needed to return a specific subset of community addresses.
     * @param count Number of community addresses to return.
     * @param fields Address fields.
     */
    suspend fun getAddresses(groupId: Long, addressIds: List<Int>? = null, latitude: Double? = null, longitude: Double? = null, offset: Int? = null, count: Int? = 10, fields: List<AddressFields>? = null): GroupsGetAddressesResponse {
        val response = method("groups.getAddresses", mapOf("group_id" to groupId, "address_ids" to addressIds, "latitude" to latitude, "longitude" to longitude, "offset" to offset, "count" to count, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of users on a community blacklist.
     * 
     * @param groupId Community ID.
     * @param offset Offset needed to return a specific subset of users.
     * @param count Number of users to return.
     * @param fields 
     * @param ownerId 
     */
    suspend fun getBanned(groupId: Long, offset: Int? = null, count: Int? = 20, fields: List<BaseUserGroupFields>? = null, ownerId: Long? = null): GroupsGetBannedResponse {
        val response = method("groups.getBanned", mapOf("group_id" to groupId, "offset" to offset, "count" to count, "fields" to fields, "owner_id" to ownerId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns information about communities by their IDs.
     * 
     * @param groupIds IDs or screen names of communities.
     * @param groupId ID or screen name of the community.
     * @param fields Group fields to return.
     */
    suspend fun getById(groupIds: List<String>? = null, groupId: List<Any>? = null, fields: List<GroupsFields>? = null): GroupsGetByIdObjectResponse {
        val response = method("groups.getById", mapOf("group_ids" to groupIds, "group_id" to groupId, "fields" to fields))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns Callback API confirmation code for the community.
     * 
     * @param groupId Community ID.
     */
    suspend fun getCallbackConfirmationCode(groupId: Long): GroupsGetCallbackConfirmationCodeResponse {
        val response = method("groups.getCallbackConfirmationCode", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param serverIds 
     */
    suspend fun getCallbackServers(groupId: Long, serverIds: List<Int>? = null): GroupsGetCallbackServersResponse {
        val response = method("groups.getCallbackServers", mapOf("group_id" to groupId, "server_ids" to serverIds))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns [vk.com/dev/callback_api|Callback API] notifications settings.
     * 
     * @param groupId Community ID.
     * @param serverId Server ID.
     */
    suspend fun getCallbackSettings(groupId: Long, serverId: Long? = null): GroupsGetCallbackSettingsResponse {
        val response = method("groups.getCallbackSettings", mapOf("group_id" to groupId, "server_id" to serverId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns categories list for communities catalog
     * 
     * @param extended 1 - to return communities count and three communities for preview. By default: 0.
     * @param subcategories 1 - to return subcategories info. By default: 0.
     */
    suspend fun getCatalogInfo(extended: Boolean? = false, subcategories: Boolean? = false): GetcataloginfoResponse {
        val response = method("groups.getCatalogInfo", mapOf("extended" to extended, "subcategories" to subcategories))
        return GetcataloginfoResponse(response, json)
    }
    class GetcataloginfoResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun GroupsGetCatalogInfoExtendedResponse(): GroupsGetCatalogInfoExtendedResponse? {
            return getResponseOrNull(GroupsGetCatalogInfoExtendedResponse.serializer(), rawResponse)
        }
        fun GroupsGetCatalogInfoResponse(): GroupsGetCatalogInfoResponse? {
            return getResponseOrNull(GroupsGetCatalogInfoResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns invited users list of a community
     * 
     * @param groupId Group ID to return invited users for.
     * @param offset Offset needed to return a specific subset of results.
     * @param count Number of results to return.
     * @param fields List of additional fields to be returned. Available values: 'sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, lists, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters'.
     * @param nameCase Case for declension of user name and surname. Possible values: *'nom' - nominative (default),, *'gen' - genitive,, *'dat' - dative,, *'acc' - accusative, , *'ins' - instrumental,, *'abl' - prepositional.
     */
    suspend fun getInvitedUsers(groupId: Long, offset: Int? = null, count: Int? = 20, fields: List<UsersFields>? = null, nameCase: String? = null): GroupsGetInvitedUsersResponse {
        val response = method("groups.getInvitedUsers", mapOf("group_id" to groupId, "offset" to offset, "count" to count, "fields" to fields, "name_case" to nameCase))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of invitations to join communities and events.
     * 
     * @param offset Offset needed to return a specific subset of invitations.
     * @param count Number of invitations to return.
     * @param extended '1' - to return additional [vk.com/dev/fields_groups|fields] for communities..
     */
    suspend fun getInvites(offset: Int? = null, count: Int? = 20, extended: Boolean? = false): GetinvitesResponse {
        val response = method("groups.getInvites", mapOf("offset" to offset, "count" to count, "extended" to extended))
        return GetinvitesResponse(response, json)
    }
    class GetinvitesResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun GroupsGetInvitesExtendedResponse(): GroupsGetInvitesExtendedResponse? {
            return getResponseOrNull(GroupsGetInvitesExtendedResponse.serializer(), rawResponse)
        }
        fun GroupsGetInvitesResponse(): GroupsGetInvitesResponse? {
            return getResponseOrNull(GroupsGetInvitesResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns the data needed to query a Long Poll server for events
     * 
     * @param groupId Community ID.
     */
    suspend fun getLongPollServer(groupId: Long): GroupsGetLongPollServerResponse {
        val response = method("groups.getLongPollServer", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns Long Poll notification settings
     * 
     * @param groupId Community ID.
     */
    suspend fun getLongPollSettings(groupId: Long): GroupsGetLongPollSettingsResponse {
        val response = method("groups.getLongPollSettings", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of community members.
     * 
     * @param groupId ID or screen name of the community.
     * @param sort Sort order. Available values: 'id_asc', 'id_desc', 'time_asc', 'time_desc'. 'time_asc' and 'time_desc' are availavle only if the method is called by the group's 'moderator'.
     * @param offset Offset needed to return a specific subset of community members.
     * @param count Number of community members to return.
     * @param fields List of additional fields to be returned. Available values: 'sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, lists, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters'.
     * @param filter *'friends' - only friends in this community will be returned,, *'unsure' - only those who pressed 'I may attend' will be returned (if it's an event).
     */
    suspend fun getMembers(groupId: List<Any>? = null, sort: String? = "id_asc", offset: Int? = null, count: Int? = 1000, fields: List<UsersFields>? = null, filter: String? = null): GetmembersResponse {
        val response = method("groups.getMembers", mapOf("group_id" to groupId, "sort" to sort, "offset" to offset, "count" to count, "fields" to fields, "filter" to filter))
        return GetmembersResponse(response, json)
    }
    class GetmembersResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun GroupsGetMembersFieldsResponse(): GroupsGetMembersFieldsResponse? {
            return getResponseOrNull(GroupsGetMembersFieldsResponse.serializer(), rawResponse)
        }
        fun GroupsGetMembersFilterResponse(): GroupsGetMembersFilterResponse? {
            return getResponseOrNull(GroupsGetMembersFilterResponse.serializer(), rawResponse)
        }
        fun GroupsGetMembersResponse(): GroupsGetMembersResponse? {
            return getResponseOrNull(GroupsGetMembersResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * @param groupId 
     */
    suspend fun getOnlineStatus(groupId: Long): GroupsGetOnlineStatusResponse {
        val response = method("groups.getOnlineStatus", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of requests to the community.
     * 
     * @param groupId Community ID.
     * @param offset Offset needed to return a specific subset of results.
     * @param count Number of results to return.
     * @param fields Profile fields to return.
     */
    suspend fun getRequests(groupId: Long, offset: Int? = null, count: Int? = 20, fields: List<UsersFields>? = null): GetrequestsResponse {
        val response = method("groups.getRequests", mapOf("group_id" to groupId, "offset" to offset, "count" to count, "fields" to fields))
        return GetrequestsResponse(response, json)
    }
    class GetrequestsResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun GroupsGetRequestsFieldsResponse(): GroupsGetRequestsFieldsResponse? {
            return getResponseOrNull(GroupsGetRequestsFieldsResponse.serializer(), rawResponse)
        }
        fun GroupsGetRequestsResponse(): GroupsGetRequestsResponse? {
            return getResponseOrNull(GroupsGetRequestsResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns community settings.
     * 
     * @param groupId Community ID.
     */
    suspend fun getSettings(groupId: List<Any>): GroupsGetSettingsResponse {
        val response = method("groups.getSettings", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * List of group's tags
     * 
     * @param groupId 
     */
    suspend fun getTagList(groupId: Long): GroupsGetTagListResponse {
        val response = method("groups.getTagList", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     */
    suspend fun getTokenPermissions(): GroupsGetTokenPermissionsResponse {
        val response = method("groups.getTokenPermissions", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to invite friends to the community.
     * 
     * @param groupId Community ID.
     * @param userId User ID.
     * @param userIdsList User IDs.
     */
    suspend fun invite(groupId: Long, userId: Long? = null, userIdsList: List<Int>? = null): InviteResponse {
        val response = method("groups.invite", mapOf("group_id" to groupId, "user_id" to userId, "user_ids_list" to userIdsList))
        return InviteResponse(response, json)
    }
    class InviteResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun BaseOkResponse(): BaseOkResponse? {
            return getResponseOrNull(Int.serializer(), rawResponse)
        }
        fun GroupsInviteUserIdsListResponse(): GroupsInviteUserIdsListResponse? {
            return getResponseOrNull(GroupsInviteUserIdsListResponse.serializer(), rawResponse)
        }
    }

    /**
     *
     * Returns information specifying whether a user is a member of a community.
     * 
     * @param groupId ID or screen name of the community.
     * @param userId User ID.
     * @param userIds User IDs.
     * @param extended '1' - to return an extended response with additional fields. By default: '0'.
     */
    suspend fun isMember(groupId: List<Any>, userId: Long? = null, userIds: List<Int>? = null, extended: Boolean? = false): IsmemberResponse {
        val response = method("groups.isMember", mapOf("group_id" to groupId, "user_id" to userId, "user_ids" to userIds, "extended" to extended))
        return IsmemberResponse(response, json)
    }
    class IsmemberResponse(
        private val rawResponse: String, json: Json
    ): BaseMultivariateResponse(json) {
        fun BaseBoolResponse(): BaseBoolResponse? {
            return getResponseOrNull(BaseBoolInt.serializer(), rawResponse)
        }
        fun GroupsIsMemberExtendedResponse(): GroupsIsMemberExtendedResponse? {
            return getResponseOrNull(GroupsIsMemberExtendedResponse.serializer(), rawResponse)
        }
        fun GroupsIsMemberUserIdsExtendedResponse(): GroupsIsMemberUserIdsExtendedResponse? {
            return getResponseOrNull(ListSerializer(GroupsMemberStatusFull.serializer()), rawResponse)
        }
        fun GroupsIsMemberUserIdsResponse(): GroupsIsMemberUserIdsResponse? {
            return getResponseOrNull(ListSerializer(GroupsMemberStatus.serializer()), rawResponse)
        }
    }

    /**
     *
     * With this method you can join the group or public page, and also confirm your participation in an event.
     * 
     * @param groupId ID or screen name of the community.
     * @param notSure Optional parameter which is taken into account when 'gid' belongs to the event: '1' - Perhaps I will attend, '0' - I will be there for sure (default), ,.
     */
    suspend fun join(groupId: Long? = null, notSure: String? = null): BaseOkResponse {
        val response = method("groups.join", mapOf("group_id" to groupId, "not_sure" to notSure))
        return decodeResponse(response, json)
    }

    /**
     *
     * With this method you can leave a group, public page, or event.
     * 
     * @param groupId ID or screen name of the community.
     */
    suspend fun leave(groupId: Long): BaseOkResponse {
        val response = method("groups.leave", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Removes a user from the community.
     * 
     * @param groupId Community ID.
     * @param userId User ID.
     */
    suspend fun removeUser(groupId: Long, userId: Long): BaseOkResponse {
        val response = method("groups.removeUser", mapOf("group_id" to groupId, "user_id" to userId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allows to reorder links in the community.
     * 
     * @param groupId Community ID.
     * @param linkId Link ID.
     * @param after ID of the link after which to place the link with 'link_id'.
     */
    suspend fun reorderLink(groupId: Long, linkId: Long, after: Int? = null): BaseOkResponse {
        val response = method("groups.reorderLink", mapOf("group_id" to groupId, "link_id" to linkId, "after" to after))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of communities matching the search criteria.
     * 
     * @param q Search query string.
     * @param type Community type. Possible values: 'group, page, event.'.
     * @param countryId Country ID.
     * @param cityId City ID. If this parameter is transmitted, country_id is ignored.
     * @param future '1' - to return only upcoming events. Works with the 'type' = 'event' only.
     * @param market '1' - to return communities with enabled market only.
     * @param sort Sort order. Possible values: *'0' - default sorting (similar the full version of the site),, *'1' - by growth speed,, *'2'- by the "day attendance/members number" ratio,, *'3' - by the "Likes number/members number" ratio,, *'4' - by the "comments number/members number" ratio,, *'5' - by the "boards entries number/members number" ratio.
     * @param offset Offset needed to return a specific subset of results.
     * @param count Number of communities to return. "Note that you can not receive more than first thousand of results, regardless of 'count' and 'offset' values.".
     */
    suspend fun search(q: String, type: String? = null, countryId: Long? = null, cityId: Long? = null, future: Boolean? = false, market: Boolean? = false, sort: Int? = null, offset: Int? = null, count: Int? = 20): GroupsSearchResponse {
        val response = method("groups.search", mapOf("q" to q, "type" to type, "country_id" to countryId, "city_id" to cityId, "future" to future, "market" to market, "sort" to sort, "offset" to offset, "count" to count))
        return decodeResponse(response, json)
    }

    /**
     *
     * Allow to set notifications settings for group.
     * 
     * @param groupId Community ID.
     * @param serverId Server ID.
     * @param apiVersion 
     * @param messageNew A new incoming message has been received ('0' - disabled, '1' - enabled).
     * @param messageReply A new outcoming message has been received ('0' - disabled, '1' - enabled).
     * @param messageAllow Allowed messages notifications ('0' - disabled, '1' - enabled).
     * @param messageEdit 
     * @param messageDeny Denied messages notifications ('0' - disabled, '1' - enabled).
     * @param messageTypingState 
     * @param messageRead Messages read notifications ('0' - disabled, '1' - enabled).
     * @param photoNew New photos notifications ('0' - disabled, '1' - enabled).
     * @param audioNew New audios notifications ('0' - disabled, '1' - enabled).
     * @param videoNew New videos notifications ('0' - disabled, '1' - enabled).
     * @param wallReplyNew New wall replies notifications ('0' - disabled, '1' - enabled).
     * @param wallReplyEdit Wall replies edited notifications ('0' - disabled, '1' - enabled).
     * @param wallReplyDelete A wall comment has been deleted ('0' - disabled, '1' - enabled).
     * @param wallReplyRestore A wall comment has been restored ('0' - disabled, '1' - enabled).
     * @param wallPostNew New wall posts notifications ('0' - disabled, '1' - enabled).
     * @param wallRepost New wall posts notifications ('0' - disabled, '1' - enabled).
     * @param boardPostNew New board posts notifications ('0' - disabled, '1' - enabled).
     * @param boardPostEdit Board posts edited notifications ('0' - disabled, '1' - enabled).
     * @param boardPostRestore Board posts restored notifications ('0' - disabled, '1' - enabled).
     * @param boardPostDelete Board posts deleted notifications ('0' - disabled, '1' - enabled).
     * @param photoCommentNew New comment to photo notifications ('0' - disabled, '1' - enabled).
     * @param photoCommentEdit A photo comment has been edited ('0' - disabled, '1' - enabled).
     * @param photoCommentDelete A photo comment has been deleted ('0' - disabled, '1' - enabled).
     * @param photoCommentRestore A photo comment has been restored ('0' - disabled, '1' - enabled).
     * @param videoCommentNew New comment to video notifications ('0' - disabled, '1' - enabled).
     * @param videoCommentEdit A video comment has been edited ('0' - disabled, '1' - enabled).
     * @param videoCommentDelete A video comment has been deleted ('0' - disabled, '1' - enabled).
     * @param videoCommentRestore A video comment has been restored ('0' - disabled, '1' - enabled).
     * @param marketCommentNew New comment to market item notifications ('0' - disabled, '1' - enabled).
     * @param marketCommentEdit A market comment has been edited ('0' - disabled, '1' - enabled).
     * @param marketCommentDelete A market comment has been deleted ('0' - disabled, '1' - enabled).
     * @param marketCommentRestore A market comment has been restored ('0' - disabled, '1' - enabled).
     * @param marketOrderNew 
     * @param marketOrderEdit 
     * @param pollVoteNew A vote in a public poll has been added ('0' - disabled, '1' - enabled).
     * @param groupJoin Joined community notifications ('0' - disabled, '1' - enabled).
     * @param groupLeave Left community notifications ('0' - disabled, '1' - enabled).
     * @param groupChangeSettings 
     * @param groupChangePhoto 
     * @param groupOfficersEdit 
     * @param userBlock User added to community blacklist.
     * @param userUnblock User removed from community blacklist.
     * @param leadFormsNew New form in lead forms.
     * @param likeAdd 
     * @param likeRemove 
     * @param messageEvent 
     * @param messageReactionEvent 
     * @param donutSubscriptionCreate 
     * @param donutSubscriptionProlonged 
     * @param donutSubscriptionCancelled 
     * @param donutSubscriptionPriceChanged 
     * @param donutSubscriptionExpired 
     * @param donutMoneyWithdraw 
     * @param donutMoneyWithdrawError 
     */
    suspend fun setCallbackSettings(groupId: Long, serverId: Long? = null, apiVersion: String? = null, messageNew: Boolean? = false, messageReply: Boolean? = false, messageAllow: Boolean? = false, messageEdit: Boolean? = false, messageDeny: Boolean? = false, messageTypingState: Boolean? = false, messageRead: Boolean? = false, photoNew: Boolean? = false, audioNew: Boolean? = false, videoNew: Boolean? = false, wallReplyNew: Boolean? = false, wallReplyEdit: Boolean? = false, wallReplyDelete: Boolean? = false, wallReplyRestore: Boolean? = false, wallPostNew: Boolean? = false, wallRepost: Boolean? = false, boardPostNew: Boolean? = false, boardPostEdit: Boolean? = false, boardPostRestore: Boolean? = false, boardPostDelete: Boolean? = false, photoCommentNew: Boolean? = false, photoCommentEdit: Boolean? = false, photoCommentDelete: Boolean? = false, photoCommentRestore: Boolean? = false, videoCommentNew: Boolean? = false, videoCommentEdit: Boolean? = false, videoCommentDelete: Boolean? = false, videoCommentRestore: Boolean? = false, marketCommentNew: Boolean? = false, marketCommentEdit: Boolean? = false, marketCommentDelete: Boolean? = false, marketCommentRestore: Boolean? = false, marketOrderNew: Boolean? = false, marketOrderEdit: Boolean? = false, pollVoteNew: Boolean? = false, groupJoin: Boolean? = false, groupLeave: Boolean? = false, groupChangeSettings: Boolean? = false, groupChangePhoto: Boolean? = false, groupOfficersEdit: Boolean? = false, userBlock: Boolean? = false, userUnblock: Boolean? = false, leadFormsNew: Boolean? = false, likeAdd: Boolean? = false, likeRemove: Boolean? = false, messageEvent: Boolean? = false, messageReactionEvent: Boolean? = false, donutSubscriptionCreate: Boolean? = false, donutSubscriptionProlonged: Boolean? = false, donutSubscriptionCancelled: Boolean? = false, donutSubscriptionPriceChanged: Boolean? = false, donutSubscriptionExpired: Boolean? = false, donutMoneyWithdraw: Boolean? = false, donutMoneyWithdrawError: Boolean? = false): BaseOkResponse {
        val response = method("groups.setCallbackSettings", mapOf("group_id" to groupId, "server_id" to serverId, "api_version" to apiVersion, "message_new" to messageNew, "message_reply" to messageReply, "message_allow" to messageAllow, "message_edit" to messageEdit, "message_deny" to messageDeny, "message_typing_state" to messageTypingState, "message_read" to messageRead, "photo_new" to photoNew, "audio_new" to audioNew, "video_new" to videoNew, "wall_reply_new" to wallReplyNew, "wall_reply_edit" to wallReplyEdit, "wall_reply_delete" to wallReplyDelete, "wall_reply_restore" to wallReplyRestore, "wall_post_new" to wallPostNew, "wall_repost" to wallRepost, "board_post_new" to boardPostNew, "board_post_edit" to boardPostEdit, "board_post_restore" to boardPostRestore, "board_post_delete" to boardPostDelete, "photo_comment_new" to photoCommentNew, "photo_comment_edit" to photoCommentEdit, "photo_comment_delete" to photoCommentDelete, "photo_comment_restore" to photoCommentRestore, "video_comment_new" to videoCommentNew, "video_comment_edit" to videoCommentEdit, "video_comment_delete" to videoCommentDelete, "video_comment_restore" to videoCommentRestore, "market_comment_new" to marketCommentNew, "market_comment_edit" to marketCommentEdit, "market_comment_delete" to marketCommentDelete, "market_comment_restore" to marketCommentRestore, "market_order_new" to marketOrderNew, "market_order_edit" to marketOrderEdit, "poll_vote_new" to pollVoteNew, "group_join" to groupJoin, "group_leave" to groupLeave, "group_change_settings" to groupChangeSettings, "group_change_photo" to groupChangePhoto, "group_officers_edit" to groupOfficersEdit, "user_block" to userBlock, "user_unblock" to userUnblock, "lead_forms_new" to leadFormsNew, "like_add" to likeAdd, "like_remove" to likeRemove, "message_event" to messageEvent, "message_reaction_event" to messageReactionEvent, "donut_subscription_create" to donutSubscriptionCreate, "donut_subscription_prolonged" to donutSubscriptionProlonged, "donut_subscription_cancelled" to donutSubscriptionCancelled, "donut_subscription_price_changed" to donutSubscriptionPriceChanged, "donut_subscription_expired" to donutSubscriptionExpired, "donut_money_withdraw" to donutMoneyWithdraw, "donut_money_withdraw_error" to donutMoneyWithdrawError))
        return decodeResponse(response, json)
    }

    /**
     *
     * Sets Long Poll notification settings
     * 
     * @param groupId Community ID.
     * @param enabled Sets whether Long Poll is enabled ('0' - disabled, '1' - enabled).
     * @param apiVersion 
     * @param messageNew A new incoming message has been received ('0' - disabled, '1' - enabled).
     * @param messageReply A new outcoming message has been received ('0' - disabled, '1' - enabled).
     * @param messageAllow Allowed messages notifications ('0' - disabled, '1' - enabled).
     * @param messageDeny Denied messages notifications ('0' - disabled, '1' - enabled).
     * @param messageEdit A message has been edited ('0' - disabled, '1' - enabled).
     * @param messageTypingState 
     * @param messageRead Messages read notifications ('0' - disabled, '1' - enabled).
     * @param photoNew New photos notifications ('0' - disabled, '1' - enabled).
     * @param audioNew New audios notifications ('0' - disabled, '1' - enabled).
     * @param videoNew New videos notifications ('0' - disabled, '1' - enabled).
     * @param wallReplyNew New wall replies notifications ('0' - disabled, '1' - enabled).
     * @param wallReplyEdit Wall replies edited notifications ('0' - disabled, '1' - enabled).
     * @param wallReplyDelete A wall comment has been deleted ('0' - disabled, '1' - enabled).
     * @param wallReplyRestore A wall comment has been restored ('0' - disabled, '1' - enabled).
     * @param wallPostNew New wall posts notifications ('0' - disabled, '1' - enabled).
     * @param wallRepost New wall posts notifications ('0' - disabled, '1' - enabled).
     * @param boardPostNew New board posts notifications ('0' - disabled, '1' - enabled).
     * @param boardPostEdit Board posts edited notifications ('0' - disabled, '1' - enabled).
     * @param boardPostRestore Board posts restored notifications ('0' - disabled, '1' - enabled).
     * @param boardPostDelete Board posts deleted notifications ('0' - disabled, '1' - enabled).
     * @param photoCommentNew New comment to photo notifications ('0' - disabled, '1' - enabled).
     * @param photoCommentEdit A photo comment has been edited ('0' - disabled, '1' - enabled).
     * @param photoCommentDelete A photo comment has been deleted ('0' - disabled, '1' - enabled).
     * @param photoCommentRestore A photo comment has been restored ('0' - disabled, '1' - enabled).
     * @param videoCommentNew New comment to video notifications ('0' - disabled, '1' - enabled).
     * @param videoCommentEdit A video comment has been edited ('0' - disabled, '1' - enabled).
     * @param videoCommentDelete A video comment has been deleted ('0' - disabled, '1' - enabled).
     * @param videoCommentRestore A video comment has been restored ('0' - disabled, '1' - enabled).
     * @param marketCommentNew New comment to market item notifications ('0' - disabled, '1' - enabled).
     * @param marketCommentEdit A market comment has been edited ('0' - disabled, '1' - enabled).
     * @param marketCommentDelete A market comment has been deleted ('0' - disabled, '1' - enabled).
     * @param marketCommentRestore A market comment has been restored ('0' - disabled, '1' - enabled).
     * @param pollVoteNew A vote in a public poll has been added ('0' - disabled, '1' - enabled).
     * @param groupJoin Joined community notifications ('0' - disabled, '1' - enabled).
     * @param groupLeave Left community notifications ('0' - disabled, '1' - enabled).
     * @param groupChangeSettings 
     * @param groupChangePhoto 
     * @param groupOfficersEdit 
     * @param userBlock User added to community blacklist.
     * @param userUnblock User removed from community blacklist.
     * @param likeAdd 
     * @param likeRemove 
     * @param messageEvent 
     * @param messageReactionEvent 
     * @param donutSubscriptionCreate 
     * @param donutSubscriptionProlonged 
     * @param donutSubscriptionCancelled 
     * @param donutSubscriptionPriceChanged 
     * @param donutSubscriptionExpired 
     * @param donutMoneyWithdraw 
     * @param donutMoneyWithdrawError 
     */
    suspend fun setLongPollSettings(groupId: Long, enabled: Boolean? = false, apiVersion: String? = null, messageNew: Boolean? = false, messageReply: Boolean? = false, messageAllow: Boolean? = false, messageDeny: Boolean? = false, messageEdit: Boolean? = false, messageTypingState: Boolean? = false, messageRead: Boolean? = false, photoNew: Boolean? = false, audioNew: Boolean? = false, videoNew: Boolean? = false, wallReplyNew: Boolean? = false, wallReplyEdit: Boolean? = false, wallReplyDelete: Boolean? = false, wallReplyRestore: Boolean? = false, wallPostNew: Boolean? = false, wallRepost: Boolean? = false, boardPostNew: Boolean? = false, boardPostEdit: Boolean? = false, boardPostRestore: Boolean? = false, boardPostDelete: Boolean? = false, photoCommentNew: Boolean? = false, photoCommentEdit: Boolean? = false, photoCommentDelete: Boolean? = false, photoCommentRestore: Boolean? = false, videoCommentNew: Boolean? = false, videoCommentEdit: Boolean? = false, videoCommentDelete: Boolean? = false, videoCommentRestore: Boolean? = false, marketCommentNew: Boolean? = false, marketCommentEdit: Boolean? = false, marketCommentDelete: Boolean? = false, marketCommentRestore: Boolean? = false, pollVoteNew: Boolean? = false, groupJoin: Boolean? = false, groupLeave: Boolean? = false, groupChangeSettings: Boolean? = false, groupChangePhoto: Boolean? = false, groupOfficersEdit: Boolean? = false, userBlock: Boolean? = false, userUnblock: Boolean? = false, likeAdd: Boolean? = false, likeRemove: Boolean? = false, messageEvent: Boolean? = false, messageReactionEvent: Boolean? = false, donutSubscriptionCreate: Boolean? = false, donutSubscriptionProlonged: Boolean? = false, donutSubscriptionCancelled: Boolean? = false, donutSubscriptionPriceChanged: Boolean? = false, donutSubscriptionExpired: Boolean? = false, donutMoneyWithdraw: Boolean? = false, donutMoneyWithdrawError: Boolean? = false): BaseOkResponse {
        val response = method("groups.setLongPollSettings", mapOf("group_id" to groupId, "enabled" to enabled, "api_version" to apiVersion, "message_new" to messageNew, "message_reply" to messageReply, "message_allow" to messageAllow, "message_deny" to messageDeny, "message_edit" to messageEdit, "message_typing_state" to messageTypingState, "message_read" to messageRead, "photo_new" to photoNew, "audio_new" to audioNew, "video_new" to videoNew, "wall_reply_new" to wallReplyNew, "wall_reply_edit" to wallReplyEdit, "wall_reply_delete" to wallReplyDelete, "wall_reply_restore" to wallReplyRestore, "wall_post_new" to wallPostNew, "wall_repost" to wallRepost, "board_post_new" to boardPostNew, "board_post_edit" to boardPostEdit, "board_post_restore" to boardPostRestore, "board_post_delete" to boardPostDelete, "photo_comment_new" to photoCommentNew, "photo_comment_edit" to photoCommentEdit, "photo_comment_delete" to photoCommentDelete, "photo_comment_restore" to photoCommentRestore, "video_comment_new" to videoCommentNew, "video_comment_edit" to videoCommentEdit, "video_comment_delete" to videoCommentDelete, "video_comment_restore" to videoCommentRestore, "market_comment_new" to marketCommentNew, "market_comment_edit" to marketCommentEdit, "market_comment_delete" to marketCommentDelete, "market_comment_restore" to marketCommentRestore, "poll_vote_new" to pollVoteNew, "group_join" to groupJoin, "group_leave" to groupLeave, "group_change_settings" to groupChangeSettings, "group_change_photo" to groupChangePhoto, "group_officers_edit" to groupOfficersEdit, "user_block" to userBlock, "user_unblock" to userUnblock, "like_add" to likeAdd, "like_remove" to likeRemove, "message_event" to messageEvent, "message_reaction_event" to messageReactionEvent, "donut_subscription_create" to donutSubscriptionCreate, "donut_subscription_prolonged" to donutSubscriptionProlonged, "donut_subscription_cancelled" to donutSubscriptionCancelled, "donut_subscription_price_changed" to donutSubscriptionPriceChanged, "donut_subscription_expired" to donutSubscriptionExpired, "donut_money_withdraw" to donutMoneyWithdraw, "donut_money_withdraw_error" to donutMoneyWithdrawError))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param messages 
     * @param botsCapabilities By enabling bot abilities, you can send users messages with a customized keyboard attached as well as use other promotional abilities.
     * @param botsStartButton If this setting is enabled, users will see a Start button when they start a chat with your community for the first time.
     * @param botsAddToChat If this setting is enabled then users can add your community to a chat.
     */
    suspend fun setSettings(groupId: Long, messages: Boolean? = false, botsCapabilities: Boolean? = false, botsStartButton: Boolean? = false, botsAddToChat: Boolean? = false): BaseOkResponse {
        val response = method("groups.setSettings", mapOf("group_id" to groupId, "messages" to messages, "bots_capabilities" to botsCapabilities, "bots_start_button" to botsStartButton, "bots_add_to_chat" to botsAddToChat))
        return decodeResponse(response, json)
    }

    /**
     *
     * In order to save note about group participant
     * 
     * @param groupId 
     * @param userId 
     * @param note Note body.
     */
    suspend fun setUserNote(groupId: Long, userId: Long, note: String? = null): BaseBoolResponse {
        val response = method("groups.setUserNote", mapOf("group_id" to groupId, "user_id" to userId, "note" to note))
        return decodeResponse(response, json)
    }

    /**
     *
     * Add new group's tag
     * 
     * @param groupId 
     * @param tagName 
     * @param tagColor 
     */
    suspend fun tagAdd(groupId: Long, tagName: String, tagColor: String? = null): BaseBoolResponse {
        val response = method("groups.tagAdd", mapOf("group_id" to groupId, "tag_name" to tagName, "tag_color" to tagColor))
        return decodeResponse(response, json)
    }

    /**
     *
     * Bind or unbind group's tag to user
     * 
     * @param groupId 
     * @param tagId 
     * @param userId 
     * @param act Describe the action.
     */
    suspend fun tagBind(groupId: Long, tagId: Long, userId: Long, act: String): BaseBoolResponse {
        val response = method("groups.tagBind", mapOf("group_id" to groupId, "tag_id" to tagId, "user_id" to userId, "act" to act))
        return decodeResponse(response, json)
    }

    /**
     *
     * Delete group's tag
     * 
     * @param groupId 
     * @param tagId 
     */
    suspend fun tagDelete(groupId: Long, tagId: Long): BaseBoolResponse {
        val response = method("groups.tagDelete", mapOf("group_id" to groupId, "tag_id" to tagId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Update group's tag
     * 
     * @param groupId 
     * @param tagId 
     * @param tagName 
     */
    suspend fun tagUpdate(groupId: Long, tagId: Long, tagName: String): BaseBoolResponse {
        val response = method("groups.tagUpdate", mapOf("group_id" to groupId, "tag_id" to tagId, "tag_name" to tagName))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param state 
     * @param ref 
     */
    suspend fun toggleMarket(groupId: Long, state: String, ref: String? = null): BaseOkResponse {
        val response = method("groups.toggleMarket", mapOf("group_id" to groupId, "state" to state, "ref" to ref))
        return decodeResponse(response, json)
    }

    /**
     *
     * @param groupId 
     * @param ownerId 
     */
    suspend fun unban(groupId: Long, ownerId: Long? = null): BaseOkResponse {
        val response = method("groups.unban", mapOf("group_id" to groupId, "owner_id" to ownerId))
        return decodeResponse(response, json)
    }

}
