package com.patycorona.shopmark.platform.di.component

import com.patycorona.shopmark.platform.di.module.RepositoryModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class])


interface MainComponent {
}