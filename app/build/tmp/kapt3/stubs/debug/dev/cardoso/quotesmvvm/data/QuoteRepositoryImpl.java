package dev.cardoso.quotesmvvm.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ)\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J)\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ1\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00122\u0006\u0010\"\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\'0\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J!\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J)\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Ldev/cardoso/quotesmvvm/data/QuoteRepositoryImpl;", "Ldev/cardoso/quotesmvvm/domain/QuoteRepository;", "quoteDAO", "Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;", "localDataSource", "Ldev/cardoso/quotesmvvm/data/local/QuoteLocalDataSource;", "remoteDataSource", "Ldev/cardoso/quotesmvvm/data/remote/QuoteRemoteDataSource;", "(Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;Ldev/cardoso/quotesmvvm/data/local/QuoteLocalDataSource;Ldev/cardoso/quotesmvvm/data/remote/QuoteRemoteDataSource;)V", "getLocalDataSource", "()Ldev/cardoso/quotesmvvm/data/local/QuoteLocalDataSource;", "setLocalDataSource", "(Ldev/cardoso/quotesmvvm/data/local/QuoteLocalDataSource;)V", "getRemoteDataSource", "()Ldev/cardoso/quotesmvvm/data/remote/QuoteRemoteDataSource;", "setRemoteDataSource", "(Ldev/cardoso/quotesmvvm/data/remote/QuoteRemoteDataSource;)V", "addQuote", "Lkotlinx/coroutines/flow/Flow;", "Ldev/cardoso/quotesmvvm/data/model/AddQuoteResponse;", "token", "", "quoteRequest", "Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;", "(Ljava/lang/String;Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteQuote", "Ldev/cardoso/quotesmvvm/data/model/QuoteResponse;", "id", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editQuote", "(Ljava/lang/String;Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuote", "Ldev/cardoso/quotesmvvm/data/model/QuoteModel;", "quoteId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuoteRandom", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuotes", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuotesResponse", "showQuote", "app_debug"})
public final class QuoteRepositoryImpl implements dev.cardoso.quotesmvvm.domain.QuoteRepository {
    @org.jetbrains.annotations.NotNull()
    private dev.cardoso.quotesmvvm.data.local.QuoteLocalDataSource localDataSource;
    @org.jetbrains.annotations.NotNull()
    private dev.cardoso.quotesmvvm.data.remote.QuoteRemoteDataSource remoteDataSource;
    
    @javax.inject.Inject()
    public QuoteRepositoryImpl(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO quoteDAO, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.local.QuoteLocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.remote.QuoteRemoteDataSource remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.data.local.QuoteLocalDataSource getLocalDataSource() {
        return null;
    }
    
    public final void setLocalDataSource(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.local.QuoteLocalDataSource p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.data.remote.QuoteRemoteDataSource getRemoteDataSource() {
        return null;
    }
    
    public final void setRemoteDataSource(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.remote.QuoteRemoteDataSource p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getQuotes(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<dev.cardoso.quotesmvvm.data.model.QuoteModel>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getQuoteRandom(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getQuote(int quoteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.QuoteRequest quoteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.AddQuoteResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object editQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.QuoteRequest quoteRequest, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object showQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getQuotesResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation) {
        return null;
    }
}