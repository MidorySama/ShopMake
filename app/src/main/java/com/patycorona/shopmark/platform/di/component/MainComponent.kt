package com.patycorona.shopmark.platform.di.component

import com.patycorona.shopmark.platform.di.module.RepositoryModule
import com.patycorona.shopmark.platform.di.module.RetrofitModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class,
    RetrofitModule::class])


interface MainComponent {
}