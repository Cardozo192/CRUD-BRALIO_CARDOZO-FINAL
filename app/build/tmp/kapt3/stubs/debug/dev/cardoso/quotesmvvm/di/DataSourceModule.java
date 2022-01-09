package dev.cardoso.quotesmvvm.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Ldev/cardoso/quotesmvvm/di/DataSourceModule;", "", "()V", "bindQuoteLocalDataSource", "Ldev/cardoso/quotesmvvm/data/local/QuoteLocalDataSource;", "quoteLocalDataSourceImpl", "Ldev/cardoso/quotesmvvm/data/QuoteLocalDataSourceImpl;", "bindQuoteRemoteDataSource", "Ldev/cardoso/quotesmvvm/data/remote/QuoteRemoteDataSource;", "quoteRemoteDataSourceImpl", "Ldev/cardoso/quotesmvvm/data/QuoteRemoteDataSourceImpl;", "bindQuoteRepository", "Ldev/cardoso/quotesmvvm/domain/QuoteRepository;", "quoteRepositoryImpl", "Ldev/cardoso/quotesmvvm/data/QuoteRepositoryImpl;", "app_debug"})
@dagger.Module()
public abstract class DataSourceModule {
    
    public DataSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract dev.cardoso.quotesmvvm.domain.QuoteRepository bindQuoteRepository(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.QuoteRepositoryImpl quoteRepositoryImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract dev.cardoso.quotesmvvm.data.local.QuoteLocalDataSource bindQuoteLocalDataSource(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.QuoteLocalDataSourceImpl quoteLocalDataSourceImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract dev.cardoso.quotesmvvm.data.remote.QuoteRemoteDataSource bindQuoteRemoteDataSource(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.QuoteRemoteDataSourceImpl quoteRemoteDataSourceImpl);
}