package ru.krindra.vkkt.methods

import ru.krindra.vkkt.responses.pages.*
import ru.krindra.vkkt.objects.pages.*
import ru.krindra.vkkt.utils.JsonSingleton
import kotlinx.serialization.json.Json
import ru.krindra.vkkt.responses.base.BaseOkResponse

class Pages(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Allows to clear the cache of particular 'external' pages which may be attached to VK posts.
     * 
     * @param url Address of the page where you need to refesh the cached version.
     */
    suspend fun clearCache(url: String): BaseOkResponse {
        val response = method("pages.clearCache", mapOf("url" to url))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns information about a wiki page.
     * 
     * @param ownerId Page owner ID.
     * @param pageId Wiki page ID.
     * @param global_ '1' - to return information about a global wiki page.
     * @param sitePreview '1' - resulting wiki page is a preview for the attached link.
     * @param title Wiki page title.
     * @param needSource 
     * @param needHtml '1' - to return the page as HTML,.
     */
    suspend fun get(ownerId: Int? = null, pageId: Int? = null, global_: Boolean? = false, sitePreview: Boolean? = false, title: String? = null, needSource: Boolean? = false, needHtml: Boolean? = false): PagesGetResponse {
        val response = method("pages.get", mapOf("owner_id" to ownerId, "page_id" to pageId, "global_" to global_, "site_preview" to sitePreview, "title" to title, "need_source" to needSource, "need_html" to needHtml))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of all previous versions of a wiki page.
     * 
     * @param pageId Wiki page ID.
     * @param groupId ID of the community that owns the wiki page.
     * @param userId 
     */
    suspend fun getHistory(pageId: Int, groupId: Int? = null, userId: Int? = null): PagesGetHistoryResponse {
        val response = method("pages.getHistory", mapOf("page_id" to pageId, "group_id" to groupId, "user_id" to userId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns a list of wiki pages in a group.
     * 
     * @param groupId ID of the community that owns the wiki page.
     */
    suspend fun getTitles(groupId: Int? = null): PagesGetTitlesResponse {
        val response = method("pages.getTitles", mapOf("group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns the text of one of the previous versions of a wiki page.
     * 
     * @param versionId 
     * @param groupId ID of the community that owns the wiki page.
     * @param userId 
     * @param needHtml '1' - to return the page as HTML.
     */
    suspend fun getVersion(versionId: Int, groupId: Int? = null, userId: Int? = null, needHtml: Boolean? = false): PagesGetVersionResponse {
        val response = method("pages.getVersion", mapOf("version_id" to versionId, "group_id" to groupId, "user_id" to userId, "need_html" to needHtml))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns HTML representation of the wiki markup.
     * 
     * @param text Text of the wiki page.
     * @param groupId ID of the group in the context of which this markup is interpreted.
     */
    suspend fun parseWiki(text: String, groupId: Int? = null): PagesParseWikiResponse {
        val response = method("pages.parseWiki", mapOf("text" to text, "group_id" to groupId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Saves the text of a wiki page.
     * 
     * @param text Text of the wiki page in wiki-format.
     * @param pageId Wiki page ID. The 'title' parameter can be passed instead of 'pid'.
     * @param groupId ID of the community that owns the wiki page.
     * @param userId User ID.
     * @param title Wiki page title.
     */
    suspend fun save(text: String? = null, pageId: Int? = null, groupId: Int? = null, userId: Int? = null, title: String? = null): PagesSaveResponse {
        val response = method("pages.save", mapOf("text" to text, "page_id" to pageId, "group_id" to groupId, "user_id" to userId, "title" to title))
        return decodeResponse(response, json)
    }

    /**
     *
     * Saves modified read and edit access settings for a wiki page.
     * 
     * @param pageId Wiki page ID.
     * @param groupId ID of the community that owns the wiki page.
     * @param userId 
     * @param view Who can view the wiki page: '1' - only community members, '2' - all users can view the page, '0' - only community managers.
     * @param edit Who can edit the wiki page: '1' - only community members, '2' - all users can edit the page, '0' - only community managers.
     */
    suspend fun saveAccess(pageId: Int, groupId: Int? = null, userId: Int? = null, view: Int? = null, edit: Int? = null): PagesSaveAccessResponse {
        val response = method("pages.saveAccess", mapOf("page_id" to pageId, "group_id" to groupId, "user_id" to userId, "view" to view, "edit" to edit))
        return decodeResponse(response, json)
    }

}
