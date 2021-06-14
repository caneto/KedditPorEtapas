package br.capsistema.keddidiporetapas.di.news

import br.capsistema.keddidiporetapas.api.NewsAPI
import br.capsistema.keddidiporetapas.api.NewsRestAPI
import br.capsistema.keddidiporetapas.api.RedditApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 *
 * @author caneto
 */
@Module
class NewsModule {

    @Provides
    @Singleton
    fun provideNewsAPI(redditApi: RedditApi): NewsAPI = NewsRestAPI(redditApi)

    @Provides
    @Singleton
    fun provideRedditApi(retrofit: Retrofit): RedditApi = retrofit.create(RedditApi::class.java)

}
