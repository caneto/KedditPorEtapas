package com.droidcba.kedditbysteps.features.news

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.droidcba.kedditbysteps.api.NewsAPI
import com.droidcba.kedditbysteps.api.RedditNewsResponse
import com.droidcba.kedditbysteps.commons.RedditNews
import com.droidcba.kedditbysteps.commons.RedditNewsItem
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

/**
 * NewsViewModel allows you to request news from Reddit API.
 *
 * @author juancho
 */
class NewsViewModel @Inject constructor(
        private val api: NewsAPI,
        private val coroutineContext: CoroutineContext) : ViewModel() {

    val newsState: MutableLiveData<NewsState> = MutableLiveData()

    fun fetchNews(after: String, limit: String = "10") = GlobalScope.launch(coroutineContext) {
        try {
            val result = api.getNews(after, limit).await()
            val news = process(result)
            newsState.postValue(NewsState.Success(news))
        } catch (e: Throwable) {
            newsState.postValue(NewsState.Error(e.message))
        }
    }

    private fun process(response: RedditNewsResponse): RedditNews {
        val dataResponse = response.data
        val news = dataResponse.children.map {
            val item = it.data
            RedditNewsItem(item.author, item.title, item.num_comments,
                    item.created, item.thumbnail, item.url)
        }
        return RedditNews(
                dataResponse.after.orEmpty(),
                dataResponse.before.orEmpty(),
                news)
    }
}