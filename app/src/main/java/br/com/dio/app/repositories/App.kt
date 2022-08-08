package br.com.dio.app.repositories

import android.app.Application
import br.com.dio.app.repositories.data.di.DataMode
import br.com.dio.app.repositories.domain.di.doMainModule
import br.com.dio.app.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataMode.load()
        doMainModule.load()
        PresentationModule.load()

    }
}