// Generated by Dagger (https://dagger.dev).
package dev.cardoso.quotesmvvm.domain.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dev.cardoso.quotesmvvm.domain.QuoteRepository;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DeleteQuoteUseCase_Factory implements Factory<DeleteQuoteUseCase> {
  private final Provider<QuoteRepository> quoteRepositoryImplProvider;

  public DeleteQuoteUseCase_Factory(Provider<QuoteRepository> quoteRepositoryImplProvider) {
    this.quoteRepositoryImplProvider = quoteRepositoryImplProvider;
  }

  @Override
  public DeleteQuoteUseCase get() {
    return newInstance(quoteRepositoryImplProvider.get());
  }

  public static DeleteQuoteUseCase_Factory create(
      Provider<QuoteRepository> quoteRepositoryImplProvider) {
    return new DeleteQuoteUseCase_Factory(quoteRepositoryImplProvider);
  }

  public static DeleteQuoteUseCase newInstance(QuoteRepository quoteRepositoryImpl) {
    return new DeleteQuoteUseCase(quoteRepositoryImpl);
  }
}
