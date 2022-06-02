package com.t.currenyexchange.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006#"}, d2 = {"Lcom/t/currenyexchange/viewmodels/ShowOprationsViewModel;", "Landroidx/databinding/BaseObservable;", "activity", "Lcom/t/currenyexchange/Ui/Activity/ShowexcahngeoperationActivity;", "(Lcom/t/currenyexchange/Ui/Activity/ShowexcahngeoperationActivity;)V", "context", "getContext", "()Lcom/t/currenyexchange/Ui/Activity/ShowexcahngeoperationActivity;", "setContext", "db", "Lcom/t/currenyexchange/Interfaces/AppDatabase;", "getDb", "()Lcom/t/currenyexchange/Interfaces/AppDatabase;", "setDb", "(Lcom/t/currenyexchange/Interfaces/AppDatabase;)V", "linearlayout", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearlayout", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLinearlayout", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "operations", "Ljava/util/ArrayList;", "Lcom/t/currenyexchange/Models/ExchangeOperation;", "Lkotlin/collections/ArrayList;", "getOperations", "()Ljava/util/ArrayList;", "setOperations", "(Ljava/util/ArrayList;)V", "operationsadapter", "Lcom/t/currenyexchange/Ui/Adapter/Operationsadapter;", "getOperationsadapter", "()Lcom/t/currenyexchange/Ui/Adapter/Operationsadapter;", "setOperationsadapter", "(Lcom/t/currenyexchange/Ui/Adapter/Operationsadapter;)V", "app_debug"})
public final class ShowOprationsViewModel extends androidx.databinding.BaseObservable {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.t.currenyexchange.Models.ExchangeOperation> operations;
    @org.jetbrains.annotations.NotNull()
    private com.t.currenyexchange.Ui.Activity.ShowexcahngeoperationActivity context;
    public com.t.currenyexchange.Ui.Adapter.Operationsadapter operationsadapter;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.LinearLayoutManager linearlayout;
    @org.jetbrains.annotations.Nullable()
    private com.t.currenyexchange.Interfaces.AppDatabase db;
    
    public ShowOprationsViewModel(@org.jetbrains.annotations.NotNull()
    com.t.currenyexchange.Ui.Activity.ShowexcahngeoperationActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.t.currenyexchange.Models.ExchangeOperation> getOperations() {
        return null;
    }
    
    public final void setOperations(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.t.currenyexchange.Models.ExchangeOperation> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.t.currenyexchange.Ui.Activity.ShowexcahngeoperationActivity getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    com.t.currenyexchange.Ui.Activity.ShowexcahngeoperationActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.t.currenyexchange.Ui.Adapter.Operationsadapter getOperationsadapter() {
        return null;
    }
    
    public final void setOperationsadapter(@org.jetbrains.annotations.NotNull()
    com.t.currenyexchange.Ui.Adapter.Operationsadapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.widget.LinearLayoutManager getLinearlayout() {
        return null;
    }
    
    public final void setLinearlayout(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.t.currenyexchange.Interfaces.AppDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.Nullable()
    com.t.currenyexchange.Interfaces.AppDatabase p0) {
    }
}