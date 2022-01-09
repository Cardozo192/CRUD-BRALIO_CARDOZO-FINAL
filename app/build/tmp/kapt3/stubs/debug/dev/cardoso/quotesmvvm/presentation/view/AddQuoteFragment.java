package dev.cardoso.quotesmvvm.presentation.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\b\u0010&\u001a\u00020\u0019H\u0002J\u0006\u0010\'\u001a\u00020\u0019J\u0006\u0010(\u001a\u00020\u0019J\b\u0010)\u001a\u00020*H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Ldev/cardoso/quotesmvvm/presentation/view/AddQuoteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Ldev/cardoso/quotesmvvm/databinding/FragmentAddQuoteBinding;", "addQuoteViewModel", "Ldev/cardoso/quotesmvvm/presentation/viewmodel/AddQuoteViewModel;", "getAddQuoteViewModel", "()Ldev/cardoso/quotesmvvm/presentation/viewmodel/AddQuoteViewModel;", "addQuoteViewModel$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Ldev/cardoso/quotesmvvm/databinding/FragmentAddQuoteBinding;", "lastIndex", "", "getLastIndex", "()I", "setLastIndex", "(I)V", "token", "", "userPreferencesRepository", "Ldev/cardoso/quotesmvvm/domain/UserPreferencesRepository;", "getToken", "", "hideKeyboard", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "setBtnCancelListener", "setBtnCreateListener", "setTextFieldsListener", "validInput", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddQuoteFragment extends androidx.fragment.app.Fragment {
    private dev.cardoso.quotesmvvm.domain.UserPreferencesRepository userPreferencesRepository;
    private java.lang.String token = "";
    private final kotlin.Lazy addQuoteViewModel$delegate = null;
    private dev.cardoso.quotesmvvm.databinding.FragmentAddQuoteBinding _binding;
    private int lastIndex = 0;
    private java.util.HashMap _$_findViewCache;
    
    public AddQuoteFragment() {
        super();
    }
    
    private final dev.cardoso.quotesmvvm.presentation.viewmodel.AddQuoteViewModel getAddQuoteViewModel() {
        return null;
    }
    
    private final dev.cardoso.quotesmvvm.databinding.FragmentAddQuoteBinding getBinding() {
        return null;
    }
    
    public final int getLastIndex() {
        return 0;
    }
    
    public final void setLastIndex(int p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void getToken() {
    }
    
    private final void setBtnCancelListener() {
    }
    
    public final void setTextFieldsListener() {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void setBtnCreateListener() {
    }
    
    private final boolean validInput() {
        return false;
    }
}