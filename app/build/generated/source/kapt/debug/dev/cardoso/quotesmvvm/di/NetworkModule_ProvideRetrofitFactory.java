// Generated by Dagger (https://dagger.dev).
package dev.cardoso.quotesmvvm.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return provideRetrofit();
  }

  public static NetworkModule_ProvideRetrofitFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit provideRetrofit() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideRetrofit());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideRetrofitFactory INSTANCE = new NetworkModule_ProvideRetrofitFactory();
  }
}
