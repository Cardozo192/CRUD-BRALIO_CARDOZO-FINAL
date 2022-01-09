package dev.cardoso.quotesmvvm.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Ldev/cardoso/quotesmvvm/domain/usecase/DeleteQuoteUseCase;", "", "quoteRepositoryImpl", "Ldev/cardoso/quotesmvvm/domain/QuoteRepository;", "(Ldev/cardoso/quotesmvvm/domain/QuoteRepository;)V", "getQuoteRepositoryImpl", "()Ldev/cardoso/quotesmvvm/domain/QuoteRepository;", "deleteQuote", "Lkotlinx/coroutines/flow/Flow;", "Ldev/cardoso/quotesmvvm/data/model/QuoteResponse;", "token", "", "id", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DeleteQuoteUseCase {
    @org.jetbrains.annotations.NotNull()
    private final dev.cardoso.quotesmvvm.domain.QuoteRepository quoteRepositoryImpl = null;
    
    @javax.inject.Inject()
    public DeleteQuoteUseCase(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.QuoteRepository quoteRepositoryImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.domain.QuoteRepository getQuoteRepositoryImpl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteResponse>> continuation) {
        return null;
    }
}