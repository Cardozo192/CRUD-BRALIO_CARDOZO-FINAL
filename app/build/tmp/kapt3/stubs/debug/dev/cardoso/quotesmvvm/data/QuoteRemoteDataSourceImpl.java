package dev.cardoso.quotesmvvm.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ)\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J1\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\'\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001eH\u0002J)\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Ldev/cardoso/quotesmvvm/data/QuoteRemoteDataSourceImpl;", "Ldev/cardoso/quotesmvvm/data/remote/QuoteRemoteDataSource;", "quotesApi", "Ldev/cardoso/quotesmvvm/data/remote/QuoteApi;", "(Ldev/cardoso/quotesmvvm/data/remote/QuoteApi;)V", "getQuotesApi", "()Ldev/cardoso/quotesmvvm/data/remote/QuoteApi;", "setQuotesApi", "addQuote", "Lkotlinx/coroutines/flow/Flow;", "Ldev/cardoso/quotesmvvm/data/model/AddQuoteResponse;", "token", "", "quoteRequest", "Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;", "(Ljava/lang/String;Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteQuote", "Ldev/cardoso/quotesmvvm/data/model/QuoteResponse;", "id", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editQuote", "(Ljava/lang/String;Ljava/lang/String;Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuotes", "", "Ldev/cardoso/quotesmvvm/data/model/QuoteModel;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuotesResponse", "responseToQuoteResponse", "response", "Lretrofit2/Response;", "showQuote", "app_debug"})
public final class QuoteRemoteDataSourceImpl implements dev.cardoso.quotesmvvm.data.remote.QuoteRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private dev.cardoso.quotesmvvm.data.remote.QuoteApi quotesApi;
    
    @javax.inject.Inject()
    public QuoteRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.remote.QuoteApi quotesApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.data.remote.QuoteApi getQuotesApi() {
        return null;
    }
    
    public final void setQuotesApi(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.remote.QuoteApi p0) {
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
    public java.lang.Object editQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.QuoteRequest quoteRequest, @org.jetbrains.annotations.NotNull()
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
    
    private final kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteResponse> responseToQuoteResponse(retrofit2.Response<dev.cardoso.quotesmvvm.data.model.QuoteResponse> response) {
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
}