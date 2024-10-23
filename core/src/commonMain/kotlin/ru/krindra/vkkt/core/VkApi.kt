package ru.krindra.vkkt.core

import ru.krindra.vkkt.objects.VkApiError
import ru.krindra.vkkt.methods.*
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import ru.krindra.vkkt.core.enums.VkLanguageEnum

class VkApi(
    token: String,
    language: VkLanguageEnum? = null,
    version: String = "5.199",
    private val httpClient: HttpClient = HttpClient(),
) {
    private val args = buildMap<String, Any> {
        put("access_token", token)
        put("v", version)
        if (language != null) put("lang", language)
    }

    val account by lazy {Account(::method) }
    val ads by lazy {Ads(::method) }
    val adsweb by lazy {Adsweb(::method) }
    val apps by lazy {Apps(::method) }
    val appwidgets by lazy {Appwidgets(::method) }
    val asr by lazy {Asr(::method) }
    val auth by lazy {Auth(::method) }
    val board by lazy {Board(::method) }
    val bugtracker by lazy {Bugtracker(::method) }
    val calls by lazy {Calls(::method) }
    val database by lazy {Database(::method) }
    val docs by lazy {Docs(::method) }
    val donut by lazy {Donut(::method) }
    val downloadedgames by lazy {Downloadedgames(::method) }
    val execute by lazy {Execute(::method) }
    val fave by lazy {Fave(::method) }
    val friends by lazy {Friends(::method) }
    val gifts by lazy {Gifts(::method) }
    val groups by lazy {Groups(::method) }
    val leadforms by lazy {Leadforms(::method) }
    val likes by lazy {Likes(::method) }
    val market by lazy {Market(::method) }
    val messages by lazy {Messages(::method) }
    val newsfeed by lazy {Newsfeed(::method) }
    val notes by lazy {Notes(::method) }
    val notifications by lazy {Notifications(::method) }
    val orders by lazy {Orders(::method) }
    val pages by lazy {Pages(::method) }
    val photos by lazy {Photos(::method) }
    val podcasts by lazy {Podcasts(::method) }
    val polls by lazy {Polls(::method) }
    val prettycards by lazy {Prettycards(::method) }
    val search by lazy {Search(::method) }
    val secure by lazy {Secure(::method) }
    val stats by lazy {Stats(::method) }
    val status by lazy {Status(::method) }
    val storage by lazy {Storage(::method) }
    val store by lazy {Store(::method) }
    val stories by lazy {Stories(::method) }
    val streaming by lazy {Streaming(::method) }
    val users by lazy {Users(::method) }
    val utils by lazy {Utils(::method) }
    val video by lazy {Video(::method) }
    val wall by lazy {Wall(::method) }
    val widgets by lazy {Widgets(::method) }

    suspend fun method(
        method: String,
        args: Map<String, Any?>? = null,
    ): String {
        val arguments = if (args != null) args + this.args else this.args
        val url = "$URL$method"
        val response = httpClient.get(url, arguments)
        if (response.contains("error")) {
            val code = response.split("error_code\":")[1]
                .split(",")[0].toInt()
            val errorMsg = response.split("error_msg\":\"")[1]
                .split("\",")[0]
            throw VkApiError(code, errorMsg)
        }
        return response

    }

    internal fun getHttpClient() = httpClient

    companion object {
        const val URL = "https://api.vk.com/method/"
    }
}

private suspend fun HttpClient.get(url: String, parameters: Map<String, Any?>): String =
    this.get(url) {
        url {
            for (p in parameters) {
                if (p.value != null) this.parameters.append(p.key, p.value.toString())
            }
        }
    }.bodyAsText()
