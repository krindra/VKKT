package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

/**
 *
 * Main section of community
 * 
 */
private class GroupsGroupFullSectionSerializer: EnumAsIntSerializer<GroupsGroupFullSection>(
    "GroupsGroupFullSection", { it.value }, { v -> GroupsGroupFullSection.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupFullSectionSerializer::class)
enum class GroupsGroupFullSection(val value: Int){
    NONE(0),
    PHOTOS(1),
    TOPICS(2),
    AUDIOS(3),
    VIDEOS(4),
    MARKET(5),
    STORIES(6),
    APPS(7),
    FOLLOWERS(8),
    LINKS(9),
    EVENTS(10),
    PLACES(11),
    CONTACTS(12),
    APP_BTNS(13),
    DOCS(14),
    EVENT_COUNTERS(15),
    GROUP_MESSAGES(16),
    ALBUMS(24),
    CATEGORIES(26),
    ADMIN_HELP(27),
    APP_WIDGET(31),
    PUBLIC_HELP(32),
    HS_DONATION_APP(33),
    HS_MARKET_APP(34),
    ADDRESSES(35),
    ARTIST_PAGE(36),
    PODCAST(37),
    ARTICLES(39),
    ADMIN_TIPS(40),
    MENU(41),
    FIXED_POST(42),
    CHATS(43),
    EVERGREEN_NOTICE(44),
    MUSICIANS(45),
    NARRATIVES(46),
    DONUT_DONATE(47),
    CLIPS(48),
    MARKET_CART(49),
    CURATORS(50),
    MARKET_SERVICES(51),
    CLASSIFIEDS(53),
    TEXTLIVES(54),
    DONUT_FOR_DONS(55),
    BADGES(57),
    CHATS_CREATION(58),
    STREAM_CREATION(59),
    RATING(60),
    SERVICE_RATING(61),
    RECOMMENDED_TIPS_WIDGET(62),
}
