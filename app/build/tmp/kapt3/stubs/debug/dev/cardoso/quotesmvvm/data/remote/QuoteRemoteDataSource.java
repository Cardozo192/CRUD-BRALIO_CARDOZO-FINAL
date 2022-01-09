package dev.cardoso.quotesmvvm.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ)\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ1\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J)\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Ldev/cardoso/quotesmvvm/data/remote/QuoteRemoteDataSource;", "", "addQuote", "Lkotlinx/coroutines/flow/Flow;", "Ldev/cardoso/quotesmvvm/data/model/AddQuoteResponse;", "token", "", "quoteRequest", "Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;", "(Ljava/lang/String;Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteQuote", "Ldev/cardoso/quotesmvvm/data/model/QuoteResponse;", "id", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editQuote", "(Ljava/lang/String;Ljava/lang/String;Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuotes", "", "Ldev/cardoso/quotesmvvm/data/model/QuoteModel;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuotesResponse", "showQuote", "app_debug"})
public abstract interface QuoteRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getQuotes(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<dev.cardoso.quotesmvvm.data.model.QuoteModel>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object editQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.QuoteRequest quoteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.QuoteRequest quoteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.AddQuoteResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object showQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getQuotesResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation);
}