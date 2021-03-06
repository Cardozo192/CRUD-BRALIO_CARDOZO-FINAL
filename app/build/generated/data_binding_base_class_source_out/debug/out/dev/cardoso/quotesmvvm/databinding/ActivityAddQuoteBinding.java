// Generated by view binder compiler. Do not edit!
package dev.cardoso.quotesmvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import dev.cardoso.quotesmvvm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddQuoteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCancelAdd;

  @NonNull
  public final Button btnCreateQuote;

  @NonNull
  public final TextInputEditText etAuthor;

  @NonNull
  public final TextInputEditText etQuote;

  @NonNull
  public final TextInputLayout tfAuthor;

  @NonNull
  public final TextInputLayout tfQuote;

  @NonNull
  public final TextView tvAddQuoteTitle;

  private ActivityAddQuoteBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnCancelAdd,
      @NonNull Button btnCreateQuote, @NonNull TextInputEditText etAuthor,
      @NonNull TextInputEditText etQuote, @NonNull TextInputLayout tfAuthor,
      @NonNull TextInputLayout tfQuote, @NonNull TextView tvAddQuoteTitle) {
    this.rootView = rootView;
    this.btnCancelAdd = btnCancelAdd;
    this.btnCreateQuote = btnCreateQuote;
    this.etAuthor = etAuthor;
    this.etQuote = etQuote;
    this.tfAuthor = tfAuthor;
    this.tfQuote = tfQuote;
    this.tvAddQuoteTitle = tvAddQuoteTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddQuoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddQuoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_quote, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddQuoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCancelAdd;
      Button btnCancelAdd = ViewBindings.findChildViewById(rootView, id);
      if (btnCancelAdd == null) {
        break missingId;
      }

      id = R.id.btnCreateQuote;
      Button btnCreateQuote = ViewBindings.findChildViewById(rootView, id);
      if (btnCreateQuote == null) {
        break missingId;
      }

      id = R.id.etAuthor;
      TextInputEditText etAuthor = ViewBindings.findChildViewById(rootView, id);
      if (etAuthor == null) {
        break missingId;
      }

      id = R.id.etQuote;
      TextInputEditText etQuote = ViewBindings.findChildViewById(rootView, id);
      if (etQuote == null) {
        break missingId;
      }

      id = R.id.tfAuthor;
      TextInputLayout tfAuthor = ViewBindings.findChildViewById(rootView, id);
      if (tfAuthor == null) {
        break missingId;
      }

      id = R.id.tfQuote;
      TextInputLayout tfQuote = ViewBindings.findChildViewById(rootView, id);
      if (tfQuote == null) {
        break missingId;
      }

      id = R.id.tvAddQuoteTitle;
      TextView tvAddQuoteTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvAddQuoteTitle == null) {
        break missingId;
      }

      return new ActivityAddQuoteBinding((ConstraintLayout) rootView, btnCancelAdd, btnCreateQuote,
          etAuthor, etQuote, tfAuthor, tfQuote, tvAddQuoteTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
