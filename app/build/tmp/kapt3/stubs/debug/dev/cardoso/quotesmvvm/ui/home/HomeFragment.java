package dev.cardoso.quotesmvvm.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\u0012\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J \u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Ldev/cardoso/quotesmvvm/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Ldev/cardoso/quotesmvvm/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Ldev/cardoso/quotesmvvm/databinding/FragmentHomeBinding;", "binding2", "homeViewModel", "Ldev/cardoso/quotesmvvm/ui/home/HomeViewModel;", "getHomeViewModel", "()Ldev/cardoso/quotesmvvm/ui/home/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "lastId", "", "quoteList", "", "Ldev/cardoso/quotesmvvm/data/model/QuoteModel;", "token", "", "userPreferencesRepository", "Ldev/cardoso/quotesmvvm/domain/UserPreferencesRepository;", "adapterOnClick", "", "quote", "deleteQuote", "id", "doSomething", "getMockQuotes", "getQuotes", "getToken", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onResume", "performOptionsMenuClick", "context", "Landroid/content/Context;", "position", "testViewModel", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private dev.cardoso.quotesmvvm.domain.UserPreferencesRepository userPreferencesRepository;
    private int lastId = 0;
    private java.util.List<dev.cardoso.quotesmvvm.data.model.QuoteModel> quoteList;
    private java.lang.String token = "";
    private final kotlin.Lazy homeViewModel$delegate = null;
    private dev.cardoso.quotesmvvm.databinding.FragmentHomeBinding _binding;
    private dev.cardoso.quotesmvvm.databinding.FragmentHomeBinding binding2;
    private java.util.HashMap _$_findViewCache;
    
    public HomeFragment() {
        super();
    }
    
    private final dev.cardoso.quotesmvvm.ui.home.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    private final dev.cardoso.quotesmvvm.databinding.FragmentHomeBinding getBinding() {
        return null;
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
    
    private final void doSomething() {
    }
    
    private final void getQuotes(java.lang.String token) {
    }
    
    private final void testViewModel(java.lang.String token) {
    }
    
    private final void adapterOnClick(dev.cardoso.quotesmvvm.data.model.QuoteModel quote) {
    }
    
    private final void deleteQuote(java.lang.String token, int id) {
    }
    
    private final void performOptionsMenuClick(android.content.Context context, int position, dev.cardoso.quotesmvvm.data.model.QuoteModel quote) {
    }
    
    private final void getMockQuotes(java.lang.String token) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void getToken() {
    }
}