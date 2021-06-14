package br.capsistema.keddidiporetapas.di.news

import br.capsistema.keddidiporetapas.di.AppModule
import br.capsistema.keddidiporetapas.di.NetworkModule
import br.capsistema.keddidiporetapas.features.news.NewsFragment
import dagger.Component
import javax.inject.Singleton

/**
 * News Component
 *
 * @author caneto
 */
@Singleton
@Component(modules = [AppModule::class, NewsModule::class, NetworkModule::class])
interface NewsComponent {

    fun inject(newsFragment: NewsFragment)

}