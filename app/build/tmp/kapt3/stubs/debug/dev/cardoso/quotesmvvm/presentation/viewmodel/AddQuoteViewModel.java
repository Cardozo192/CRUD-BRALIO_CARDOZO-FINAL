package dev.cardoso.quotesmvvm.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Ldev/cardoso/quotesmvvm/presentation/viewmodel/AddQuoteViewModel;", "Landroidx/lifecycle/ViewModel;", "addQuoteUseCase", "Ldev/cardoso/quotesmvvm/domain/usecase/AddQuoteUseCase;", "(Ldev/cardoso/quotesmvvm/domain/usecase/AddQuoteUseCase;)V", "addQuoteResponse", "Lkotlinx/coroutines/flow/StateFlow;", "Ldev/cardoso/quotesmvvm/data/model/AddQuoteResponse;", "getAddQuoteResponse", "()Lkotlinx/coroutines/flow/StateFlow;", "addQuoteResponseMutableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getAddQuoteUseCase", "()Ldev/cardoso/quotesmvvm/domain/usecase/AddQuoteUseCase;", "addQuote", "", "token", "", "addQuoteRequest", "Ldev/cardoso/quotesmvvm/data/model/QuoteRequest;", "app_debug"})
public final class AddQuoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final dev.cardoso.quotesmvvm.domain.usecase.AddQuoteUseCase addQuoteUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<dev.cardoso.quotesmvvm.data.model.AddQuoteResponse> addQuoteResponseMutableStateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<dev.cardoso.quotesmvvm.data.model.AddQuoteResponse> addQuoteResponse = null;
    
    @javax.inject.Inject()
    public AddQuoteViewModel(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.usecase.AddQuoteUseCase addQuoteUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.domain.usecase.AddQuoteUseCase getAddQuoteUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<dev.cardoso.quotesmvvm.data.model.AddQuoteResponse> getAddQuoteResponse() {
        return null;
    }
    
    public final void addQuote(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.QuoteRequest addQuoteRequest) {
    }
}