package com.t.currenyexchange.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u000204J\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u000204R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0004R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u000bR\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR\u001a\u0010,\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u00a8\u00069"}, d2 = {"Lcom/t/currenyexchange/viewmodels/CurrencyExchangeViewModel;", "Landroidx/databinding/BaseObservable;", "activity", "Lcom/t/currenyexchange/Ui/Activity/MainActivity;", "(Lcom/t/currenyexchange/Ui/Activity/MainActivity;)V", "amount", "Landroidx/databinding/ObservableField;", "", "getAmount", "()Landroidx/databinding/ObservableField;", "setAmount", "(Landroidx/databinding/ObservableField;)V", "amountresult", "getAmountresult", "setAmountresult", "context", "getContext", "()Lcom/t/currenyexchange/Ui/Activity/MainActivity;", "setContext", "currencies", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCurrencies", "()Ljava/util/ArrayList;", "setCurrencies", "(Ljava/util/ArrayList;)V", "db", "Lcom/t/currenyexchange/Interfaces/AppDatabase;", "getDb", "()Lcom/t/currenyexchange/Interfaces/AppDatabase;", "setDb", "(Lcom/t/currenyexchange/Interfaces/AppDatabase;)V", "from", "getFrom", "setFrom", "isloading", "Landroidx/databinding/ObservableBoolean;", "getIsloading", "()Landroidx/databinding/ObservableBoolean;", "setIsloading", "(Landroidx/databinding/ObservableBoolean;)V", "to", "getTo", "setTo", "type", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "checkchange", "", "checktoconnect", "", "getchangeresult", "onamountChanged", "Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;", "showpervious", "app_debug"})
public final class CurrencyExchangeViewModel extends androidx.databinding.BaseObservable {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isloading;
    @org.jetbrains.annotations.NotNull()
    private com.t.currenyexchange.Ui.Activity.MainActivity context;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> from;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> to;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> amount;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> amountresult;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type = "0";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> currencies;
    @org.jetbrains.annotations.Nullable()
    private com.t.currenyexchange.Interfaces.AppDatabase db;
    
    public CurrencyExchangeViewModel(@org.jetbrains.annotations.NotNull()
    com.t.currenyexchange.Ui.Activity.MainActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getIsloading() {
        return null;
    }
    
    public final void setIsloading(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.t.currenyexchange.Ui.Activity.MainActivity getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    com.t.currenyexchange.Ui.Activity.MainActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTo() {
        return null;
    }
    
    public final void setTo(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getAmountresult() {
        return null;
    }
    
    public final void setAmountresult(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getCurrencies() {
        return null;
    }
    
    public final void setCurrencies(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.t.currenyexchange.Interfaces.AppDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.Nullable()
    com.t.currenyexchange.Interfaces.AppDatabase p0) {
    }
    
    public final boolean checkchange() {
        return false;
    }
    
    public final void getchangeresult() {
    }
    
    public final void checktoconnect() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged onamountChanged() {
        return null;
    }
    
    public final void showpervious() {
    }
}