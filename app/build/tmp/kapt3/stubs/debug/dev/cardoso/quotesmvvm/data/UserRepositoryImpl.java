package dev.cardoso.quotesmvvm.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Ldev/cardoso/quotesmvvm/data/UserRepositoryImpl;", "Ldev/cardoso/quotesmvvm/domain/UserRepository;", "userRemoteDataSource", "Ldev/cardoso/quotesmvvm/data/remote/UserRemoteDataSource;", "(Ldev/cardoso/quotesmvvm/data/remote/UserRemoteDataSource;)V", "getUserRemoteDataSource", "()Ldev/cardoso/quotesmvvm/data/remote/UserRemoteDataSource;", "setUserRemoteDataSource", "loginUser", "Lkotlinx/coroutines/flow/Flow;", "Ldev/cardoso/quotesmvvm/data/model/LoginResponse;", "loginRequest", "Ldev/cardoso/quotesmvvm/data/model/LoginRequest;", "(Ldev/cardoso/quotesmvvm/data/model/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepositoryImpl implements dev.cardoso.quotesmvvm.domain.UserRepository {
    @org.jetbrains.annotations.NotNull()
    private dev.cardoso.quotesmvvm.data.remote.UserRemoteDataSource userRemoteDataSource;
    
    @javax.inject.Inject()
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.remote.UserRemoteDataSource userRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.data.remote.UserRemoteDataSource getUserRemoteDataSource() {
        return null;
    }
    
    public final void setUserRemoteDataSource(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.remote.UserRemoteDataSource p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loginUser(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.model.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<dev.cardoso.quotesmvvm.data.model.LoginResponse>> continuation) {
        return null;
    }
}