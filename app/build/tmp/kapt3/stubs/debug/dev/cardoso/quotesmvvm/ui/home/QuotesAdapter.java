package dev.cardoso.quotesmvvm.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Ldev/cardoso/quotesmvvm/ui/home/QuotesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/cardoso/quotesmvvm/ui/home/QuotesAdapter$ViewHolder;", "quoteList", "", "Ldev/cardoso/quotesmvvm/data/model/QuoteModel;", "optionsClickListener", "Ldev/cardoso/quotesmvvm/ui/home/QuotesAdapter$OptionsClickListener;", "(Ljava/util/List;Ldev/cardoso/quotesmvvm/ui/home/QuotesAdapter$OptionsClickListener;)V", "getQuoteList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OptionsClickListener", "ViewHolder", "app_debug"})
public final class QuotesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<dev.cardoso.quotesmvvm.ui.home.QuotesAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<dev.cardoso.quotesmvvm.data.model.QuoteModel> quoteList = null;
    private dev.cardoso.quotesmvvm.ui.home.QuotesAdapter.OptionsClickListener optionsClickListener;
    
    public QuotesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.cardoso.quotesmvvm.data.model.QuoteModel> quoteList, @org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.ui.home.QuotesAdapter.OptionsClickListener optionsClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dev.cardoso.quotesmvvm.data.model.QuoteModel> getQuoteList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dev.cardoso.quotesmvvm.ui.home.QuotesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    dev.cardoso.quotesmvvm.ui.home.QuotesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ldev/cardoso/quotesmvvm/ui/home/QuotesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Ldev/cardoso/quotesmvvm/databinding/QuoteItemBinding;", "(Ldev/cardoso/quotesmvvm/ui/home/QuotesAdapter;Ldev/cardoso/quotesmvvm/databinding/QuoteItemBinding;)V", "getBinding", "()Ldev/cardoso/quotesmvvm/databinding/QuoteItemBinding;", "currentQuote", "Ldev/cardoso/quotesmvvm/data/model/QuoteModel;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final dev.cardoso.quotesmvvm.databinding.QuoteItemBinding binding = null;
        private dev.cardoso.quotesmvvm.data.model.QuoteModel currentQuote;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        dev.cardoso.quotesmvvm.databinding.QuoteItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.cardoso.quotesmvvm.databinding.QuoteItemBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\r"}, d2 = {"Ldev/cardoso/quotesmvvm/ui/home/QuotesAdapter$OptionsClickListener;", "", "onDeleteQuote", "", "quote", "Ldev/cardoso/quotesmvvm/data/model/QuoteModel;", "onMenuClicked", "context", "Landroid/content/Context;", "position", "", "quoteModel", "onUpdateQuote", "app_debug"})
    public static abstract interface OptionsClickListener {
        
        public abstract void onUpdateQuote(@org.jetbrains.annotations.NotNull()
        dev.cardoso.quotesmvvm.data.model.QuoteModel quote);
        
        public abstract void onDeleteQuote(@org.jetbrains.annotations.NotNull()
        dev.cardoso.quotesmvvm.data.model.QuoteModel quote);
        
        public abstract void onMenuClicked(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int position, @org.jetbrains.annotations.NotNull()
        dev.cardoso.quotesmvvm.data.model.QuoteModel quoteModel);
    }
}