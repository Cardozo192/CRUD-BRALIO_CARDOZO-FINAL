package dev.cardoso.quotesmvvm.ui.home;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import dev.cardoso.quotesmvvm.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavHomeToNavGallery() {
    return new ActionOnlyNavDirections(R.id.action_nav_home_to_nav_gallery);
  }

  @NonNull
  public static ActionNavHomeToAddQuoteFragment actionNavHomeToAddQuoteFragment() {
    return new ActionNavHomeToAddQuoteFragment();
  }

  @NonNull
  public static ActionNavHomeToEditQuoteFragment actionNavHomeToEditQuoteFragment(
      @NonNull String quoteText, @NonNull String quoteAuthor) {
    return new ActionNavHomeToEditQuoteFragment(quoteText, quoteAuthor);
  }

  public static class ActionNavHomeToAddQuoteFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNavHomeToAddQuoteFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionNavHomeToAddQuoteFragment setLastId(int lastId) {
      this.arguments.put("lastId", lastId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("lastId")) {
        int lastId = (int) arguments.get("lastId");
        __result.putInt("lastId", lastId);
      } else {
        __result.putInt("lastId", 0);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_nav_home_to_addQuoteFragment;
    }

    @SuppressWarnings("unchecked")
    public int getLastId() {
      return (int) arguments.get("lastId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNavHomeToAddQuoteFragment that = (ActionNavHomeToAddQuoteFragment) object;
      if (arguments.containsKey("lastId") != that.arguments.containsKey("lastId")) {
        return false;
      }
      if (getLastId() != that.getLastId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getLastId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNavHomeToAddQuoteFragment(actionId=" + getActionId() + "){"
          + "lastId=" + getLastId()
          + "}";
    }
  }

  public static class ActionNavHomeToEditQuoteFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionNavHomeToEditQuoteFragment(@NonNull String quoteText,
        @NonNull String quoteAuthor) {
      if (quoteText == null) {
        throw new IllegalArgumentException("Argument \"quoteText\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("quoteText", quoteText);
      if (quoteAuthor == null) {
        throw new IllegalArgumentException("Argument \"quoteAuthor\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("quoteAuthor", quoteAuthor);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionNavHomeToEditQuoteFragment setQuoteId(int quoteId) {
      this.arguments.put("quoteId", quoteId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionNavHomeToEditQuoteFragment setQuoteText(@NonNull String quoteText) {
      if (quoteText == null) {
        throw new IllegalArgumentException("Argument \"quoteText\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("quoteText", quoteText);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionNavHomeToEditQuoteFragment setQuoteAuthor(@NonNull String quoteAuthor) {
      if (quoteAuthor == null) {
        throw new IllegalArgumentException("Argument \"quoteAuthor\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("quoteAuthor", quoteAuthor);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("quoteId")) {
        int quoteId = (int) arguments.get("quoteId");
        __result.putInt("quoteId", quoteId);
      } else {
        __result.putInt("quoteId", 0);
      }
      if (arguments.containsKey("quoteText")) {
        String quoteText = (String) arguments.get("quoteText");
        __result.putString("quoteText", quoteText);
      }
      if (arguments.containsKey("quoteAuthor")) {
        String quoteAuthor = (String) arguments.get("quoteAuthor");
        __result.putString("quoteAuthor", quoteAuthor);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_nav_home_to_editQuoteFragment;
    }

    @SuppressWarnings("unchecked")
    public int getQuoteId() {
      return (int) arguments.get("quoteId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getQuoteText() {
      return (String) arguments.get("quoteText");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getQuoteAuthor() {
      return (String) arguments.get("quoteAuthor");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNavHomeToEditQuoteFragment that = (ActionNavHomeToEditQuoteFragment) object;
      if (arguments.containsKey("quoteId") != that.arguments.containsKey("quoteId")) {
        return false;
      }
      if (getQuoteId() != that.getQuoteId()) {
        return false;
      }
      if (arguments.containsKey("quoteText") != that.arguments.containsKey("quoteText")) {
        return false;
      }
      if (getQuoteText() != null ? !getQuoteText().equals(that.getQuoteText()) : that.getQuoteText() != null) {
        return false;
      }
      if (arguments.containsKey("quoteAuthor") != that.arguments.containsKey("quoteAuthor")) {
        return false;
      }
      if (getQuoteAuthor() != null ? !getQuoteAuthor().equals(that.getQuoteAuthor()) : that.getQuoteAuthor() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getQuoteId();
      result = 31 * result + (getQuoteText() != null ? getQuoteText().hashCode() : 0);
      result = 31 * result + (getQuoteAuthor() != null ? getQuoteAuthor().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNavHomeToEditQuoteFragment(actionId=" + getActionId() + "){"
          + "quoteId=" + getQuoteId()
          + ", quoteText=" + getQuoteText()
          + ", quoteAuthor=" + getQuoteAuthor()
          + "}";
    }
  }
}
