// Generated by Dagger (https://dagger.dev).
package dev.cardoso.quotesmvvm.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dev.cardoso.quotesmvvm.domain.usecase.EditQuoteUseCase;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EditQuoteViewModel_Factory implements Factory<EditQuoteViewModel> {
  private final Provider<EditQuoteUseCase> editQuoteUseCaseProvider;

  public EditQuoteViewModel_Factory(Provider<EditQuoteUseCase> editQuoteUseCaseProvider) {
    this.editQuoteUseCaseProvider = editQuoteUseCaseProvider;
  }

  @Override
  public EditQuoteViewModel get() {
    return newInstance(editQuoteUseCaseProvider.get());
  }

  public static EditQuoteViewModel_Factory create(
      Provider<EditQuoteUseCase> editQuoteUseCaseProvider) {
    return new EditQuoteViewModel_Factory(editQuoteUseCaseProvider);
  }

  public static EditQuoteViewModel newInstance(EditQuoteUseCase editQuoteUseCase) {
    return new EditQuoteViewModel(editQuoteUseCase);
  }
}