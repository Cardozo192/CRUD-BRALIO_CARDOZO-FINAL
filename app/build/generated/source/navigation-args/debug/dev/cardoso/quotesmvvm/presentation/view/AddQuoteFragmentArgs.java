package dev.cardoso.quotesmvvm.presentation.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AddQuoteFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private AddQuoteFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private AddQuoteFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static AddQuoteFragmentArgs fromBundle(@NonNull Bundle bundle) {
    AddQuoteFragmentArgs __result = new AddQuoteFragmentArgs();
    bundle.setClassLoader(AddQuoteFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("lastId")) {
      int lastId;
      lastId = bundle.getInt("lastId");
      __result.arguments.put("lastId", lastId);
    } else {
      __result.arguments.put("lastId", 0);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getLastId() {
    return (int) arguments.get("lastId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    AddQuoteFragmentArgs that = (AddQuoteFragmentArgs) object;
    if (arguments.containsKey("lastId") != that.arguments.containsKey("lastId")) {
      return false;
    }
    if (getLastId() != that.getLastId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getLastId();
    return result;
  }

  @Override
  public String toString() {
    return "AddQuoteFragmentArgs{"
        + "lastId=" + getLastId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(AddQuoteFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public AddQuoteFragmentArgs build() {
      AddQuoteFragmentArgs result = new AddQuoteFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setLastId(int lastId) {
      this.arguments.put("lastId", lastId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getLastId() {
      return (int) arguments.get("lastId");
    }
  }
}
