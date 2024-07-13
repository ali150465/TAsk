package com.routtask.di

import com.example.data.remote.ApiService
import com.example.data.repo.ProductsRepoImpl
import com.example.domain.repo.ProductsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepository(apiService: ApiService): ProductsRepo {
        return ProductsRepoImpl(apiService)
    }

}