package br.capsistema.keddidiporetapas.api

import kotlinx.coroutines.Deferred
import retrofit2.Call

/**
 * News API
 *
 * @author caneto
 */
interface NewsAPI {
    fun getNewsOldApi(after: String, limit: String): Call<RedditNewsResponse>
    suspend fun getNews(after: String, limit: String): Deferred<RedditNewsResponse>
}