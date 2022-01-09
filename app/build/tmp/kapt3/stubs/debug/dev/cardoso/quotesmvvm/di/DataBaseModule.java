package dev.cardoso.quotesmvvm.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Ldev/cardoso/quotesmvvm/di/DataBaseModule;", "", "()V", "provideQuoteDAO", "Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;", "quoteDB", "Ldev/cardoso/quotesmvvm/data/local/QuoteDB;", "provideQuoteDB", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class DataBaseModule {
    
    public DataBaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO provideQuoteDAO(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.local.QuoteDB quoteDB) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final dev.cardoso.quotesmvvm.data.local.QuoteDB provideQuoteDB(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
}