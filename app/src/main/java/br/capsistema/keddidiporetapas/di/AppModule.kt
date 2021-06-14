package br.capsistema.keddidiporetapas.di

import android.app.Application
import android.content.Context
import br.capsistema.keddidiporetapas.KedditApp
import dagger.Module
import dagger.Provides
//import kotlinx.coroutines.CommonPool
import javax.inject.Singleton
//import kotlin.coroutines.CoroutineContext

/**
 *
 * @author caneto
 */

@Module
class AppModule(val app: KedditApp) {

    @Provides
    @Singleton
    fun provideContext(): Context = app

    @Provides
    @Singleton
    fun provideApplication(): Application = app

    //@Provides
    //fun provideCoroutineContext(): CoroutineContext = CommonPool
}
