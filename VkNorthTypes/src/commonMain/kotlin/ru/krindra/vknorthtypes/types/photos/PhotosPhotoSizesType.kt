package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Size type
 * 
 */
@Serializable
enum class PhotosPhotoSizesType(val value: String){
    @SerialName("t") T("t"),
    @SerialName("s") S("s"),
    @SerialName("m") M("m"),
    @SerialName("x") X("x"),
    @SerialName("o") O("o"),
    @SerialName("p") P("p"),
    @SerialName("q") Q("q"),
    @SerialName("r") R("r"),
    @SerialName("k") K("k"),
    @SerialName("l") L("l"),
    @SerialName("y") Y("y"),
    @SerialName("z") Z("z"),
    @SerialName("c") C("c"),
    @SerialName("w") W("w"),
    @SerialName("a") A("a"),
    @SerialName("b") B("b"),
    @SerialName("e") E("e"),
    @SerialName("i") I("i"),
    @SerialName("d") D("d"),
    @SerialName("j") J("j"),
    @SerialName("temp") TEMP("temp"),
    @SerialName("h") H("h"),
    @SerialName("g") G("g"),
    @SerialName("n") N("n"),
    @SerialName("f") F("f"),
    @SerialName("max") MAX("max"),
    @SerialName("base") BASE("base"),
    @SerialName("u") U("u"),
    @SerialName("v") V("v"),
}
