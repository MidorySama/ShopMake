package com.patycorona.shopmark.platform.di.module

import com.patycorona.shopmark.api.CoreHomeApi
import com.patycorona.shopmark.repositories.ProdRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
class RepositoryModule {

    @Provides
    fun employeeRepositoryProvider(apiService: CoreHomeApi): ProdRepository = ProdRepository(apiService)
}