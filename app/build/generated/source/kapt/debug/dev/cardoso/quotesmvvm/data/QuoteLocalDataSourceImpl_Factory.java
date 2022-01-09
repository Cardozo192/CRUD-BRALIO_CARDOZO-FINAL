// Generated by Dagger (https://dagger.dev).
package dev.cardoso.quotesmvvm.data;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class QuoteLocalDataSourceImpl_Factory implements Factory<QuoteLocalDataSourceImpl> {
  private final Provider<QuoteDAO> quoteDAOProvider;

  public QuoteLocalDataSourceImpl_Factory(Provider<QuoteDAO> quoteDAOProvider) {
    this.quoteDAOProvider = quoteDAOProvider;
  }

  @Override
  public QuoteLocalDataSourceImpl get() {
    return newInstance(quoteDAOProvider.get());
  }

  public static QuoteLocalDataSourceImpl_Factory create(Provider<QuoteDAO> quoteDAOProvider) {
    return new QuoteLocalDataSourceImpl_Factory(quoteDAOProvider);
  }

  public static QuoteLocalDataSourceImpl newInstance(QuoteDAO quoteDAO) {
    return new QuoteLocalDataSourceImpl(quoteDAO);
  }
}
