package dev.cardoso.quotesmvvm.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Ldev/cardoso/quotesmvvm/data/UserRemoteDataSourceImpl;", "Ldev/cardoso/quotesmvvm/data/remote/UserRemoteDataSource;", "api", "Ldev/cardoso/quotesmvvm/data/remote/UserApi;", "(Ldev/cardoso/quotesmvvm/data/remote/UserApi;)V", "loginUser", "Lkotlinx/coroutines/flow/Flow;", "Ldev/cardoso/quotesmvvm/data/model/LoginResponse;", "loginRequest", "Ldev/cardoso/quotesmvvm/data/model/LoginRequest;", "(Ldev/cardoso/quotesmvvm/data/model/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRemoteDataSourceImpl implements dev.cardoso.quotesmvvm.data.remote.UserRemoteDataSource {
    private final dev.cardoso.quotesmvvm.data.remote.UserApi api = null;
    
    @javax.inject.Inject()
    public UserRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.remote.UserApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loginUser(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.LoginResponse>> continuation) {
        return null;
    }
}