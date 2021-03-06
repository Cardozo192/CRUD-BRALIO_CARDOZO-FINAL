// Generated by Dagger (https://dagger.dev).
package dev.cardoso.quotesmvvm.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dev.cardoso.quotesmvvm.domain.usecase.AddQuoteUseCase;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddQuoteViewModel_Factory implements Factory<AddQuoteViewModel> {
  private final Provider<AddQuoteUseCase> addQuoteUseCaseProvider;

  public AddQuoteViewModel_Factory(Provider<AddQuoteUseCase> addQuoteUseCaseProvider) {
    this.addQuoteUseCaseProvider = addQuoteUseCaseProvider;
  }

  @Override
  public AddQuoteViewModel get() {
    return newInstance(addQuoteUseCaseProvider.get());
  }

  public static AddQuoteViewModel_Factory create(
      Provider<AddQuoteUseCase> addQuoteUseCaseProvider) {
    return new AddQuoteViewModel_Factory(addQuoteUseCaseProvider);
  }

  public static AddQuoteViewModel newInstance(AddQuoteUseCase addQuoteUseCase) {
    return new AddQuoteViewModel(addQuoteUseCase);
  }
}
