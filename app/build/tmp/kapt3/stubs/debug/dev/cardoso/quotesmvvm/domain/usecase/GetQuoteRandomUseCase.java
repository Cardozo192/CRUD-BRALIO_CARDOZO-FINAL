package dev.cardoso.quotesmvvm.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Ldev/cardoso/quotesmvvm/domain/usecase/GetQuoteRandomUseCase;", "", "quoteDAO", "Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;", "quoteRepositoryImpl", "Ldev/cardoso/quotesmvvm/domain/QuoteRepository;", "(Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;Ldev/cardoso/quotesmvvm/domain/QuoteRepository;)V", "getQuoteRepositoryImpl", "()Ldev/cardoso/quotesmvvm/domain/QuoteRepository;", "setQuoteRepositoryImpl", "(Ldev/cardoso/quotesmvvm/domain/QuoteRepository;)V", "getQuoteRandom", "Lkotlinx/coroutines/flow/Flow;", "Ldev/cardoso/quotesmvvm/data/model/QuoteModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetQuoteRandomUseCase {
    @org.jetbrains.annotations.NotNull()
    private dev.cardoso.quotesmvvm.domain.QuoteRepository quoteRepositoryImpl;
    
    @javax.inject.Inject()
    public GetQuoteRandomUseCase(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO quoteDAO, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.QuoteRepository quoteRepositoryImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.domain.QuoteRepository getQuoteRepositoryImpl() {
        return null;
    }
    
    public final void setQuoteRepositoryImpl(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.QuoteRepository p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getQuoteRandom(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.QuoteModel>> continuation) {
        return null;
    }
}