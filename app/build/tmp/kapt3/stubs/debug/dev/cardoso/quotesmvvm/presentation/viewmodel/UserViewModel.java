package dev.cardoso.quotesmvvm.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Ldev/cardoso/quotesmvvm/presentation/viewmodel/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "userUseCase", "Ldev/cardoso/quotesmvvm/domain/usecase/UserUseCase;", "(Ldev/cardoso/quotesmvvm/domain/usecase/UserUseCase;)V", "loginResponse", "Lkotlinx/coroutines/flow/StateFlow;", "Ldev/cardoso/quotesmvvm/data/model/LoginResponse;", "getLoginResponse", "()Lkotlinx/coroutines/flow/StateFlow;", "loginResponseMutableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "clearData", "", "loginRequest", "Ldev/cardoso/quotesmvvm/data/model/LoginRequest;", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    private final dev.cardoso.quotesmvvm.domain.usecase.UserUseCase userUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<dev.cardoso.quotesmvvm.data.model.LoginResponse> loginResponseMutableStateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<dev.cardoso.quotesmvvm.data.model.LoginResponse> loginResponse = null;
    
    @javax.inject.Inject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.domain.usecase.UserUseCase userUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<dev.cardoso.quotesmvvm.data.model.LoginResponse> getLoginResponse() {
        return null;
    }
    
    public final void loginRequest(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.LoginRequest loginRequest) {
    }
    
    public final void clearData() {
    }
}