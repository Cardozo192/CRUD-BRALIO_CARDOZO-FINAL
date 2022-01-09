package dev.cardoso.quotesmvvm.presentation.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import dev.cardoso.quotesmvvm.R;

public class EditQuoteFragmentDirections {
  private EditQuoteFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionEditQuoteFragmentToNavHome() {
    return new ActionOnlyNavDirections(R.id.action_editQuoteFragment_to_nav_home);
  }
}
