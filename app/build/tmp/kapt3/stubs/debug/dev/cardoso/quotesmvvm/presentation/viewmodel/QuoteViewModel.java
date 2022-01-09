package dev.cardoso.quotesmvvm.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u001fJ\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006&"}, d2 = {"Ldev/cardoso/quotesmvvm/presentation/viewmodel/QuoteViewModel;", "Landroidx/lifecycle/ViewModel;", "getQuotesUseCase", "Ldev/cardoso/quotesmvvm/domain/usecase/GetQuotesUseCase;", "getQuoteRandomUseCase", "Ldev/cardoso/quotesmvvm/domain/usecase/GetQuoteRandomUseCase;", "quoteDB", "Ldev/cardoso/quotesmvvm/data/local/QuoteDB;", "(Ldev/cardoso/quotesmvvm/domain/usecase/GetQuotesUseCase;Ldev/cardoso/quotesmvvm/domain/usecase/GetQuoteRandomUseCase;Ldev/cardoso/quotesmvvm/data/local/QuoteDB;)V", "_quoteModel", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ldev/cardoso/quotesmvvm/data/model/QuoteModel;", "getGetQuoteRandomUseCase", "()Ldev/cardoso/quotesmvvm/domain/usecase/GetQuoteRandomUseCase;", "setGetQuoteRandomUseCase", "(Ldev/cardoso/quotesmvvm/domain/usecase/GetQuoteRandomUseCase;)V", "getGetQuotesUseCase", "()Ldev/cardoso/quotesmvvm/domain/usecase/GetQuotesUseCase;", "setGetQuotesUseCase", "(Ldev/cardoso/quotesmvvm/domain/usecase/GetQuotesUseCase;)V", "quoteDAO", "Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;", "getQuoteDB", "()Ldev/cardoso/quotesmvvm/data/local/QuoteDB;", "setQuoteDB", "(Ldev/cardoso/quotesmvvm/data/local/QuoteDB;)V", "quoteModel", "Lkotlinx/coroutines/flow/StateFlow;", "getQuoteModel", "()Lkotlinx/coroutines/flow/StateFlow;", "getQuotes", "", "token", "", "randomQuote", "setContext", "context", "Landroid/content/Context;", "app_debug"})
public final class QuoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private dev.cardoso.quotesmvvm.domain.usecase.GetQuotesUseCase getQuotesUseCase;
    @org.jetbrains.annotations.NotNull()
    private dev.cardoso.quotesmvvm.domain.usecase.GetQuoteRandomUseCase getQuoteRandomUseCase;
    @org.jetbrains.annotations.NotNull()
    private dev.cardoso.quotesmvvm.data.local.QuoteDB quoteDB;
    private final kotlinx.coroutines.flow.MutableStateFlow<dev.cardoso.quotesmvvm.data.model.QuoteModel> _quoteModel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<dev.cardoso.quotesmvvm.data.model.QuoteModel> quoteModel = null;
    private dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO quoteDAO;
    
    @javax.inject.Inject()
    public QuoteViewModel(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.usecase.GetQuotesUseCase getQuotesUseCase, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.usecase.GetQuoteRandomUseCase getQuoteRandomUseCase, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.local.QuoteDB quoteDB) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.domain.usecase.GetQuotesUseCase getGetQuotesUseCase() {
        return null;
    }
    
    public final void setGetQuotesUseCase(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.usecase.GetQuotesUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.domain.usecase.GetQuoteRandomUseCase getGetQuoteRandomUseCase() {
        return null;
    }
    
    public final void setGetQuoteRandomUseCase(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.usecase.GetQuoteRandomUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.data.local.QuoteDB getQuoteDB() {
        return null;
    }
    
    public final void setQuoteDB(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.local.QuoteDB p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<dev.cardoso.quotesmvvm.data.model.QuoteModel> getQuoteModel() {
        return null;
    }
    
    public final void getQuotes(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void randomQuote() {
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}