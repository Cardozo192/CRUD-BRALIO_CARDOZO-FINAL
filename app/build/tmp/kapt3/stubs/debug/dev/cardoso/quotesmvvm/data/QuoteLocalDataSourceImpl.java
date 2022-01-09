package dev.cardoso.quotesmvvm.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\tH\u0016J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Ldev/cardoso/quotesmvvm/data/QuoteLocalDataSourceImpl;", "Ldev/cardoso/quotesmvvm/data/local/QuoteLocalDataSource;", "quoteDAO", "Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;", "(Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;)V", "getQuoteDAO", "()Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;", "setQuoteDAO", "getQuote", "Lkotlinx/coroutines/flow/Flow;", "Ldev/cardoso/quotesmvvm/data/model/QuoteModel;", "quoteId", "", "getQuoteRandom", "getQuotes", "", "insert", "", "quoteModel", "(Ldev/cardoso/quotesmvvm/data/model/QuoteModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "quotes", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class QuoteLocalDataSourceImpl implements dev.cardoso.quotesmvvm.data.local.QuoteLocalDataSource {
    @org.jetbrains.annotations.NotNull()
    private dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO quoteDAO;
    
    @javax.inject.Inject()
    public QuoteLocalDataSourceImpl(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO quoteDAO) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO getQuoteDAO() {
        return null;
    }
    
    public final void setQuoteDAO(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<dev.cardoso.quotesmvvm.data.model.QuoteModel>> getQuotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteModel> getQuote(int quoteId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteModel> getQuoteRandom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.cardoso.quotesmvvm.data.model.QuoteModel> quotes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.QuoteModel quoteModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}