# VKKT

![Maven Central Version][badge-latest-release]

[![badge-api-version]](https://vk.com/dev/versions)
![badge-platform-android]
![badge-platform-jvm]
![badge-platform-js]
![badge-platform-linux]
![badge-platform-macos]
![badge-platform-ios]
![badge-platform-mingw]

# VK Kotlin API 

Just a simple library for VK 

is supported:
- [VK API](https://dev.vk.com/reference)
- [Bot Long Poll](https://dev.vk.com/api/bots-long-poll/getting-started)
- [User Long Poll](https://dev.vk.com/api/user-long-poll/getting-started)

## Examples

```kotlin
import io.ktor.client.*
import ru.krindra.vkkt.core.VkApi
import ru.krindra.vkkt.longpoll.bot.*
import ru.krindra.vkkt.longpoll.user.*

val client = HttpClient()

suspend fun bot() {
    val vkApi = VkApi(botToken, httpClient = client)

    val lp = BotLongPoll(vkApi)
    lp.listen().collect{ e->
        if (e is BotLPUpdate.MessageNewUpdate) {
            if (e.`object`.message.text != "")
                vkApi.messages.send(
                    peerId = e.`object`.message.peerId,
                    message = e.`object`.message.text,
                    randomId = 0
                )
        }
    }
}

suspend fun user() {
    val vkApi = VkApi(userToken, httpClient = client)
    println(vkApi.status.get().text)

    val lp = UserLongPoll(vkApi)
    lp.listen().collect {e ->
        if (e is UserLPUpdate.MessageNewUpdate) {
            print("${e.peerId} ${e.timestamp} - ${e.text}")
        }
    }
}

```


<!-- TAGS -->
[badge-api-version]: https://img.shields.io/badge/API%20version-5.119-blue?style=flat&logo=vk&logoColor=white
[badge-latest-release]: https://img.shields.io/maven-central/v/ru.krindra.vkkt/vkkt-methods
[badge-platform-android]: http://img.shields.io/badge/-android-6EDB8D.svg?style=flat
[badge-platform-jvm]: http://img.shields.io/badge/-jvm-DB413D.svg?style=flat
[badge-platform-js]: http://img.shields.io/badge/-js-F8DB5D.svg?style=flat
[badge-platform-linux]: http://img.shields.io/badge/-linuxX64-2D3F6C.svg?style=flat
[badge-platform-macos]: http://img.shields.io/badge/-macosARM64-111111.svg?style=flat
[badge-platform-ios]: http://img.shields.io/badge/-iosARM64-CDCDCD.svg?style=flat
[badge-platform-mingw]: http://img.shields.io/badge/-mingwX64-4D76CD.svg?style=flat
