package dev.cardoso.quotesmvvm.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Ldev/cardoso/quotesmvvm/data/remote/QuoteApi;", "", "addQuote", "Lretrofit2/Response;", "Ldev/cardoso/quotesmvvm/data/model/AddQuoteResponse;", "token", "", "quoteRequest", "Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;", "(Ljava/lang/String;Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteQuote", "Ldev/cardoso/quotesmvvm/data/model/QuoteResponse;", "id", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editQuote", "(Ljava/lang/String;ILdev/cardoso/quotesmvvm/data/model/QuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuotes", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuotesResponse", "showQuote", "app_debug"})
public abstract interface QuoteApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v1/quotes")
    @retrofit2.http.Headers(value = {"Content-Type: application/json; charset=utf-8", "Accept: */*; charset=utf-8"})
    public abstract java.lang.Object getQuotes(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "/api/v1/quotes/{id}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json; charset=utf-8", "Accept: */*; charset=utf-8"})
    public abstract java.lang.Object editQuote(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    dev.cardoso.quotesmvvm.data.model.QuoteRequest quoteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/api/v1/quotes")
    @retrofit2.http.Headers(value = {"Content-Type: application/json; charset=utf-8", "Accept: */*; charset=utf-8"})
    public abstract java.lang.Object addQuote(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    dev.cardoso.quotesmvvm.data.model.QuoteRequest quoteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<dev.cardoso.quotesmvvm.data.model.AddQuoteResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "/api/v1/quotes/{id}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json; charset=utf-8", "Accept: */*; charset=utf-8"})
    public abstract java.lang.Object deleteQuote(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v1/quotes/{id}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json; charset=utf-8", "Accept: */*; charset=utf-8"})
    public abstract java.lang.Object showQuote(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/v1/quotes")
    @retrofit2.http.Headers(value = {"Content-Type: application/json; charset=utf-8", "Accept: */*; charset=utf-8"})
    public abstract java.lang.Object getQuotesResponse(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation);
}