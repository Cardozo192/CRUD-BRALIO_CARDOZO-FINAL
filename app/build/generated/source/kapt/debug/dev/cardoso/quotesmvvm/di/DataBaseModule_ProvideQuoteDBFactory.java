// Generated by Dagger (https://dagger.dev).
package dev.cardoso.quotesmvvm.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.cardoso.quotesmvvm.data.local.QuoteDB;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataBaseModule_ProvideQuoteDBFactory implements Factory<QuoteDB> {
  private final DataBaseModule module;

  private final Provider<Context> contextProvider;

  public DataBaseModule_ProvideQuoteDBFactory(DataBaseModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public QuoteDB get() {
    return provideQuoteDB(module, contextProvider.get());
  }

  public static DataBaseModule_ProvideQuoteDBFactory create(DataBaseModule module,
      Provider<Context> contextProvider) {
    return new DataBaseModule_ProvideQuoteDBFactory(module, contextProvider);
  }

  public static QuoteDB provideQuoteDB(DataBaseModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideQuoteDB(context));
  }
}
