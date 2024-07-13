package com.routtask.di

import com.example.domain.repo.ProductsRepo
import com.example.domain.usecase.GetProducts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(productsRepo: ProductsRepo): GetProducts {
        return GetProducts(productsRepo)
    }
}