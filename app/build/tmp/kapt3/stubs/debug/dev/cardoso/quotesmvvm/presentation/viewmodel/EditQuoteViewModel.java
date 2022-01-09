package dev.cardoso.quotesmvvm.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ldev/cardoso/quotesmvvm/presentation/viewmodel/EditQuoteViewModel;", "Landroidx/lifecycle/ViewModel;", "editQuoteUseCase", "Ldev/cardoso/quotesmvvm/domain/usecase/EditQuoteUseCase;", "(Ldev/cardoso/quotesmvvm/domain/usecase/EditQuoteUseCase;)V", "getEditQuoteUseCase", "()Ldev/cardoso/quotesmvvm/domain/usecase/EditQuoteUseCase;", "quoteResponse", "Lkotlinx/coroutines/flow/StateFlow;", "Ldev/cardoso/quotesmvvm/data/model/QuoteResponse;", "getQuoteResponse", "()Lkotlinx/coroutines/flow/StateFlow;", "quoteResponseMutableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "editQuote", "", "token", "", "quoteRequest", "Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;", "id", "app_debug"})
public final class EditQuoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final dev.cardoso.quotesmvvm.domain.usecase.EditQuoteUseCase editQuoteUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<dev.cardoso.quotesmvvm.data.model.QuoteResponse> quoteResponseMutableStateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<dev.cardoso.quotesmvvm.data.model.QuoteResponse> quoteResponse = null;
    
    @javax.inject.Inject()
    public EditQuoteViewModel(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.usecase.EditQuoteUseCase editQuoteUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.domain.usecase.EditQuoteUseCase getEditQuoteUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<dev.cardoso.quotesmvvm.data.model.QuoteResponse> getQuoteResponse() {
        return null;
    }
    
    public final void editQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.QuoteRequest quoteRequest, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}