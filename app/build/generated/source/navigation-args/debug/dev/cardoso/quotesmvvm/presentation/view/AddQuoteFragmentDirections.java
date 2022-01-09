package dev.cardoso.quotesmvvm.presentation.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import dev.cardoso.quotesmvvm.R;

public class AddQuoteFragmentDirections {
  private AddQuoteFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAddQuoteFragmentToNavHome() {
    return new ActionOnlyNavDirections(R.id.action_addQuoteFragment_to_nav_home);
  }
}
