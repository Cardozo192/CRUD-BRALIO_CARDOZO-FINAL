package dev.cardoso.quotesmvvm.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Ldev/cardoso/quotesmvvm/di/UserModule;", "", "()V", "bindUserRemoteDataSource", "Ldev/cardoso/quotesmvvm/data/remote/UserRemoteDataSource;", "userRemoteDataSourceImpl", "Ldev/cardoso/quotesmvvm/data/UserRemoteDataSourceImpl;", "bindUserRepository", "Ldev/cardoso/quotesmvvm/domain/UserRepository;", "userRepositoryImpl", "Ldev/cardoso/quotesmvvm/data/UserRepositoryImpl;", "app_debug"})
@dagger.Module()
public abstract class UserModule {
    
    public UserModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract dev.cardoso.quotesmvvm.domain.UserRepository bindUserRepository(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.UserRepositoryImpl userRepositoryImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract dev.cardoso.quotesmvvm.data.remote.UserRemoteDataSource bindUserRemoteDataSource(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.data.UserRemoteDataSourceImpl userRemoteDataSourceImpl);
}