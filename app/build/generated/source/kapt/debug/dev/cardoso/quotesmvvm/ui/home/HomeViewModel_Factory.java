// Generated by Dagger (https://dagger.dev).
package dev.cardoso.quotesmvvm.ui.home;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dev.cardoso.quotesmvvm.domain.usecase.DeleteQuoteUseCase;
import dev.cardoso.quotesmvvm.domain.usecase.GetQuotesUseCase;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<GetQuotesUseCase> getQuotesUseCaseProvider;

  private final Provider<DeleteQuoteUseCase> deleteQuoteUseCaseProvider;

  public HomeViewModel_Factory(Provider<GetQuotesUseCase> getQuotesUseCaseProvider,
      Provider<DeleteQuoteUseCase> deleteQuoteUseCaseProvider) {
    this.getQuotesUseCaseProvider = getQuotesUseCaseProvider;
    this.deleteQuoteUseCaseProvider = deleteQuoteUseCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(getQuotesUseCaseProvider.get(), deleteQuoteUseCaseProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<GetQuotesUseCase> getQuotesUseCaseProvider,
      Provider<DeleteQuoteUseCase> deleteQuoteUseCaseProvider) {
    return new HomeViewModel_Factory(getQuotesUseCaseProvider, deleteQuoteUseCaseProvider);
  }

  public static HomeViewModel newInstance(GetQuotesUseCase getQuotesUseCase,
      DeleteQuoteUseCase deleteQuoteUseCase) {
    return new HomeViewModel(getQuotesUseCase, deleteQuoteUseCase);
  }
}
