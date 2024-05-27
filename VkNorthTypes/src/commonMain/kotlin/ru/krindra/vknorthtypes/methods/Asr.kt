package ru.krindra.vknorthtypes.methods

import ru.krindra.vknorthtypes.types.asr.*
import kotlinx.serialization.json.Json
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.types.base.BaseGetUploadServerResponse

class Asr(
    private val method: suspend (String, Map<String, Any?>?) -> String,
    private val json: Json = JsonSingleton.json
    ) {
    /**
     *
     * Returns status of the task with provided `task_id`
     * 
     * @param taskId ID of ASR task in UUID format.
     */
    suspend fun checkStatus(taskId: String): AsrCheckStatusResponse {
        val response = method("asr.checkStatus", mapOf("task_id" to taskId))
        return decodeResponse(response, json)
    }

    /**
     *
     * Returns the server address to [vk.com/dev/upload_files_2|upload audio files].
     * 
     */
    suspend fun getUploadUrl(): BaseGetUploadServerResponse {
        val response = method("asr.getUploadUrl", mapOf())
        return decodeResponse(response, json)
    }

    /**
     *
     * Starts ASR task on [vk.com/dev/upload_files_2|uploaded audio file].
     * 
     * @param audio This parameter is a JSON response returned from [vk.com/dev/upload_files_2|file uploading server].
     * @param model Which model to use for recognition. `neutral` -- general purpose (interviews, TV shows, etc.), `spontaneous` -- for NSFW audios (slang, profanity, etc.).
     */
    suspend fun process(audio: String, model: String): AsrProcessResponse {
        val response = method("asr.process", mapOf("audio" to audio, "model" to model))
        return decodeResponse(response, json)
    }

}
