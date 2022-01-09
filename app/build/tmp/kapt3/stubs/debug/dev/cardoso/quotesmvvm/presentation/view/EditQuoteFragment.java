package dev.cardoso.quotesmvvm.presentation.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020\'H\u0002J\u000e\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020*J\u0012\u0010+\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J&\u0010.\u001a\u0004\u0018\u00010*2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00103\u001a\u00020\'H\u0016J\b\u00104\u001a\u00020\'H\u0002J\u0006\u00105\u001a\u00020\'J\b\u00106\u001a\u00020\'H\u0002J\u0006\u00107\u001a\u00020\'J\b\u00108\u001a\u000209H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Ldev/cardoso/quotesmvvm/presentation/view/EditQuoteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Ldev/cardoso/quotesmvvm/databinding/FragmentEditQuoteBinding;", "args", "Ldev/cardoso/quotesmvvm/presentation/view/EditQuoteFragmentArgs;", "getArgs", "()Ldev/cardoso/quotesmvvm/presentation/view/EditQuoteFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "author", "", "getAuthor", "()Ljava/lang/String;", "setAuthor", "(Ljava/lang/String;)V", "binding", "getBinding", "()Ldev/cardoso/quotesmvvm/databinding/FragmentEditQuoteBinding;", "editQuoteViewModel", "Ldev/cardoso/quotesmvvm/presentation/viewmodel/EditQuoteViewModel;", "getEditQuoteViewModel", "()Ldev/cardoso/quotesmvvm/presentation/viewmodel/EditQuoteViewModel;", "editQuoteViewModel$delegate", "Lkotlin/Lazy;", "quotText", "getQuotText", "setQuotText", "quoteId", "", "getQuoteId", "()I", "setQuoteId", "(I)V", "token", "userPreferencesRepository", "Ldev/cardoso/quotesmvvm/domain/UserPreferencesRepository;", "getToken", "", "hideKeyboard", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "setBtnCancelListener", "setBtnCreateListener", "setCurrentText", "setTextFieldsListener", "validInput", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class EditQuoteFragment extends androidx.fragment.app.Fragment {
    private dev.cardoso.quotesmvvm.domain.UserPreferencesRepository userPreferencesRepository;
    private java.lang.String token = "";
    private final kotlin.Lazy editQuoteViewModel$delegate = null;
    private dev.cardoso.quotesmvvm.databinding.FragmentEditQuoteBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String author = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String quotText = "";
    private int quoteId = 0;
    private java.util.HashMap _$_findViewCache;
    
    public EditQuoteFragment() {
        super();
    }
    
    private final dev.cardoso.quotesmvvm.presentation.viewmodel.EditQuoteViewModel getEditQuoteViewModel() {
        return null;
    }
    
    private final dev.cardoso.quotesmvvm.databinding.FragmentEditQuoteBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.cardoso.quotesmvvm.presentation.view.EditQuoteFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthor() {
        return null;
    }
    
    public final void setAuthor(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuotText() {
        return null;
    }
    
    public final void setQuotText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getQuoteId() {
        return 0;
    }
    
    public final void setQuoteId(int p0) {
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
    
    private final void setCurrentText() {
    }
}