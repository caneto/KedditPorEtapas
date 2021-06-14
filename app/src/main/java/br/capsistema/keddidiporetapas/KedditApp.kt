package br.capsistema.keddidiporetapas

import android.app.Application
import br.capsistema.keddidiporetapas.di.AppModule
import br.capsistema.keddidiporetapas.di.news.NewsComponent
import br.capsistema.keddidiporetapas.di.news.DaggerNewsComponent

/**
 *
 * @author caneto
 */
class KedditApp : Application() {

    companion object {
        lateinit var newsComponent: NewsComponent
    }

    override fun onCreate() {
        super.onCreate()
        newsComponent = DaggerNewsComponent.builder()
                .appModule(AppModule(this))
                //.newsModule(NewsModule()) Module with empty constructor is implicitly created by dagger.
                .build()
    }
}