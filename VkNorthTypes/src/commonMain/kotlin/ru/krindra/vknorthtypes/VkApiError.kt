package ru.krindra.vknorthtypes

class VkApiError(
    val code: Int,
    val description: String
): Exception(description) {
    operator fun get(code: Int): Boolean = code == this.code
}
