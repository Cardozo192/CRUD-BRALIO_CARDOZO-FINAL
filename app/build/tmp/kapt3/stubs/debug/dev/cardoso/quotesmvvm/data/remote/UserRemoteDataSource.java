package dev.cardoso.quotesmvvm.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Ldev/cardoso/quotesmvvm/data/remote/UserRemoteDataSource;", "", "loginUser", "Lkotlinx/coroutines/flow/Flow;", "Ldev/cardoso/quotesmvvm/data/model/LoginResponse;", "loginRequest", "Ldev/cardoso/quotesmvvm/data/model/LoginRequest;", "(Ldev/cardoso/quotesmvvm/data/model/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loginUser(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.LoginResponse>> continuation);
}