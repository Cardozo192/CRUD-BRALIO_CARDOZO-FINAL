// Generated by Dagger (https://dagger.dev).
package dev.cardoso.quotesmvvm.data.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserApiImpl_Factory implements Factory<UserApiImpl> {
  private final Provider<Retrofit> retrofitProvider;

  public UserApiImpl_Factory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public UserApiImpl get() {
    return newInstance(retrofitProvider.get());
  }

  public static UserApiImpl_Factory create(Provider<Retrofit> retrofitProvider) {
    return new UserApiImpl_Factory(retrofitProvider);
  }

  public static UserApiImpl newInstance(Retrofit retrofit) {
    return new UserApiImpl(retrofit);
  }
}
