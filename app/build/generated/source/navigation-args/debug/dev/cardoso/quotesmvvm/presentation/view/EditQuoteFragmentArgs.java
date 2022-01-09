package dev.cardoso.quotesmvvm.presentation.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class EditQuoteFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private EditQuoteFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private EditQuoteFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static EditQuoteFragmentArgs fromBundle(@NonNull Bundle bundle) {
    EditQuoteFragmentArgs __result = new EditQuoteFragmentArgs();
    bundle.setClassLoader(EditQuoteFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("quoteId")) {
      int quoteId;
      quoteId = bundle.getInt("quoteId");
      __result.arguments.put("quoteId", quoteId);
    } else {
      __result.arguments.put("quoteId", 0);
    }
    if (bundle.containsKey("quoteText")) {
      String quoteText;
      quoteText = bundle.getString("quoteText");
      if (quoteText == null) {
        throw new IllegalArgumentException("Argument \"quoteText\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("quoteText", quoteText);
    } else {
      throw new IllegalArgumentException("Required argument \"quoteText\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("quoteAuthor")) {
      String quoteAuthor;
      quoteAuthor = bundle.getString("quoteAuthor");
      if (quoteAuthor == null) {
        throw new IllegalArgumentException("Argument \"quoteAuthor\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("quoteAuthor", quoteAuthor);
    } else {
      throw new IllegalArgumentException("Required argument \"quoteAuthor\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    EditQuoteFragmentArgs that = (EditQuoteFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getQuoteId();
    result = 31 * result + (getQuoteText() != null ? getQuoteText().hashCode() : 0);
    result = 31 * result + (getQuoteAuthor() != null ? getQuoteAuthor().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "EditQuoteFragmentArgs{"
        + "quoteId=" + getQuoteId()
        + ", quoteText=" + getQuoteText()
        + ", quoteAuthor=" + getQuoteAuthor()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(EditQuoteFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String quoteText, @NonNull String quoteAuthor) {
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
    public EditQuoteFragmentArgs build() {
      EditQuoteFragmentArgs result = new EditQuoteFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setQuoteId(int quoteId) {
      this.arguments.put("quoteId", quoteId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setQuoteText(@NonNull String quoteText) {
      if (quoteText == null) {
        throw new IllegalArgumentException("Argument \"quoteText\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("quoteText", quoteText);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setQuoteAuthor(@NonNull String quoteAuthor) {
      if (quoteAuthor == null) {
        throw new IllegalArgumentException("Argument \"quoteAuthor\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("quoteAuthor", quoteAuthor);
      return this;
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
  }
}
