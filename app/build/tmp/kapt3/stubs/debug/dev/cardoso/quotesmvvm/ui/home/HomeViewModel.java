package dev.cardoso.quotesmvvm.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001d"}, d2 = {"Ldev/cardoso/quotesmvvm/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "getQuotesUseCase", "Ldev/cardoso/quotesmvvm/domain/usecase/GetQuotesUseCase;", "deleteQuoteUseCase", "Ldev/cardoso/quotesmvvm/domain/usecase/DeleteQuoteUseCase;", "(Ldev/cardoso/quotesmvvm/domain/usecase/GetQuotesUseCase;Ldev/cardoso/quotesmvvm/domain/usecase/DeleteQuoteUseCase;)V", "lastIndex", "", "quoteList", "Lkotlinx/coroutines/flow/StateFlow;", "", "Ldev/cardoso/quotesmvvm/data/model/QuoteModel;", "getQuoteList", "()Lkotlinx/coroutines/flow/StateFlow;", "quoteListMutableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "quoteResponse", "Ldev/cardoso/quotesmvvm/data/model/QuoteResponse;", "getQuoteResponse", "quoteResponseMutableStateFlow", "token", "", "getToken", "()Ljava/lang/String;", "deleteQuote", "", "id", "getQuotes", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final dev.cardoso.quotesmvvm.domain.usecase.GetQuotesUseCase getQuotesUseCase = null;
    private final dev.cardoso.quotesmvvm.domain.usecase.DeleteQuoteUseCase deleteQuoteUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<dev.cardoso.quotesmvvm.data.model.QuoteResponse> quoteResponseMutableStateFlow = null;
    private int lastIndex = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<dev.cardoso.quotesmvvm.data.model.QuoteResponse> quoteResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String token = "";
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<dev.cardoso.quotesmvvm.data.model.QuoteModel>> quoteListMutableStateFlow;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<dev.cardoso.quotesmvvm.data.model.QuoteModel>> quoteList = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.usecase.GetQuotesUseCase getQuotesUseCase, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.usecase.DeleteQuoteUseCase deleteQuoteUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<dev.cardoso.quotesmvvm.data.model.QuoteResponse> getQuoteResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<dev.cardoso.quotesmvvm.data.model.QuoteModel>> getQuoteList() {
        return null;
    }
    
    public final void getQuotes(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void deleteQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int id) {
    }
}