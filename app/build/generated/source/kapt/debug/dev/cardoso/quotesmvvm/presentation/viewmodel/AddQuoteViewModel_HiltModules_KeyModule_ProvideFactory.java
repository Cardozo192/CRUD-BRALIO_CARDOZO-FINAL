// Generated by Dagger (https://dagger.dev).
package dev.cardoso.quotesmvvm.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddQuoteViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static AddQuoteViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(AddQuoteViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final AddQuoteViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new AddQuoteViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
