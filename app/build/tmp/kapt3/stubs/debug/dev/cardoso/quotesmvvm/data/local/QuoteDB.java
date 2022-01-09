package dev.cardoso.quotesmvvm.data.local;

import java.lang.System;

@androidx.room.Database(entities = {dev.cardoso.quotesmvvm.data.local.entities.QuoteEntity.class}, version = 1)
@dagger.hilt.android.scopes.ViewModelScoped()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Ldev/cardoso/quotesmvvm/data/local/QuoteDB;", "Landroidx/room/RoomDatabase;", "()V", "quoteDao", "Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;", "Companion", "app_debug"})
public abstract class QuoteDB extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final dev.cardoso.quotesmvvm.data.local.QuoteDB.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile dev.cardoso.quotesmvvm.data.local.QuoteDB INSTANCE;
    
    public QuoteDB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO quoteDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Ldev/cardoso/quotesmvvm/data/local/QuoteDB$Companion;", "", "()V", "INSTANCE", "Ldev/cardoso/quotesmvvm/data/local/QuoteDB;", "getDatabase", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "populate", "", "quoteDao", "Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;", "(Ldev/cardoso/quotesmvvm/data/local/daos/QuoteDAO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "QuoteDBCallback", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.cardoso.quotesmvvm.data.local.QuoteDB getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope scope) {
            return null;
        }
        
        /**
         * Populate the database in a new coroutine.
         * If you want to start with more elements
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object populate(@org.jetbrains.annotations.NotNull()
        dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO quoteDao, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ldev/cardoso/quotesmvvm/data/local/QuoteDB$Companion$QuoteDBCallback;", "Landroidx/room/RoomDatabase$Callback;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_debug"})
        static final class QuoteDBCallback extends androidx.room.RoomDatabase.Callback {
            private final kotlinx.coroutines.CoroutineScope scope = null;
            
            public QuoteDBCallback(@org.jetbrains.annotations.NotNull()
            kotlinx.coroutines.CoroutineScope scope) {
                super();
            }
            
            /**
             * Override the onCreate method to populate the database.
             */
            @java.lang.Override()
            public void onCreate(@org.jetbrains.annotations.NotNull()
            androidx.sqlite.db.SupportSQLiteDatabase db) {
            }
        }
    }
}