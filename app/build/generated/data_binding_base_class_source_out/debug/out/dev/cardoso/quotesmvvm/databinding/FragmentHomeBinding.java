// Generated by view binder compiler. Do not edit!
package dev.cardoso.quotesmvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import dev.cardoso.quotesmvvm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton btnAgregarFrase;

  @NonNull
  public final RecyclerView rvFrases;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton btnAgregarFrase, @NonNull RecyclerView rvFrases) {
    this.rootView = rootView;
    this.btnAgregarFrase = btnAgregarFrase;
    this.rvFrases = rvFrases;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAgregarFrase;
      FloatingActionButton btnAgregarFrase = ViewBindings.findChildViewById(rootView, id);
      if (btnAgregarFrase == null) {
        break missingId;
      }

      id = R.id.rvFrases;
      RecyclerView rvFrases = ViewBindings.findChildViewById(rootView, id);
      if (rvFrases == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, btnAgregarFrase, rvFrases);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
