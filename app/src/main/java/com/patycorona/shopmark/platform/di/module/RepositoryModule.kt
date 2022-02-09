package com.patycorona.shopmark.platform.di.module

import com.patycorona.shopmark.repositories.ProdRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class RepositoryModule{
    @Provides
    fun prodRepositoryProvider() = ProdRepository()
}