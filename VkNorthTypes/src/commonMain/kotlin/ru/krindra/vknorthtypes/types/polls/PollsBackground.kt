package ru.krindra.vknorthtypes.types.polls

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseImage
import ru.krindra.vknorthtypes.types.base.BaseGradientPoint

/**
 *
 * @param angle Gradient angle with 0 on positive X axis
 * @param color Hex color code without #
 * @param height Original height of pattern tile
 * @param id 
 * @param name 
 * @param images Pattern tiles
 * @param points Gradient points
 * @param type 
 * @param width Original with of pattern tile
 */
@Serializable
data class PollsBackground (
    @SerialName("angle") val angle: Int? = null,
    @SerialName("points") val points: List<BaseGradientPoint>? = null,
    @SerialName("color") val color: String? = null,
    @SerialName("id") val id: Long? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("images") val images: List<BaseImage>? = null,
    @SerialName("width") val width: Int? = null,
    @SerialName("height") val height: Int? = null,
    @SerialName("name") val name: String? = null,
)