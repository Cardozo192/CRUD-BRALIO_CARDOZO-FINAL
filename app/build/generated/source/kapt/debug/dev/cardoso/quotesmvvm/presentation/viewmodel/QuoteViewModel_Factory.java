// Generated by Dagger (https://dagger.dev).
package dev.cardoso.quotesmvvm.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dev.cardoso.quotesmvvm.data.local.QuoteDB;
import dev.cardoso.quotesmvvm.domain.usecase.GetQuoteRandomUseCase;
import dev.cardoso.quotesmvvm.domain.usecase.GetQuotesUseCase;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class QuoteViewModel_Factory implements Factory<QuoteViewModel> {
  private final Provider<GetQuotesUseCase> getQuotesUseCaseProvider;

  private final Provider<GetQuoteRandomUseCase> getQuoteRandomUseCaseProvider;

  private final Provider<QuoteDB> quoteDBProvider;

  public QuoteViewModel_Factory(Provider<GetQuotesUseCase> getQuotesUseCaseProvider,
      Provider<GetQuoteRandomUseCase> getQuoteRandomUseCaseProvider,
      Provider<QuoteDB> quoteDBProvider) {
    this.getQuotesUseCaseProvider = getQuotesUseCaseProvider;
    this.getQuoteRandomUseCaseProvider = getQuoteRandomUseCaseProvider;
    this.quoteDBProvider = quoteDBProvider;
  }

  @Override
  public QuoteViewModel get() {
    return newInstance(getQuotesUseCaseProvider.get(), getQuoteRandomUseCaseProvider.get(), quoteDBProvider.get());
  }

  public static QuoteViewModel_Factory create(Provider<GetQuotesUseCase> getQuotesUseCaseProvider,
      Provider<GetQuoteRandomUseCase> getQuoteRandomUseCaseProvider,
      Provider<QuoteDB> quoteDBProvider) {
    return new QuoteViewModel_Factory(getQuotesUseCaseProvider, getQuoteRandomUseCaseProvider, quoteDBProvider);
  }

  public static QuoteViewModel newInstance(GetQuotesUseCase getQuotesUseCase,
      GetQuoteRandomUseCase getQuoteRandomUseCase, QuoteDB quoteDB) {
    return new QuoteViewModel(getQuotesUseCase, getQuoteRandomUseCase, quoteDB);
  }
}
