package com.t.currenyexchange;

import java.lang.System;

/**
 * Created by BEST BUY on 5/10/2018.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\bj\b\u0012\u0004\u0012\u00020\u0011`\nH\u0007J0\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/t/currenyexchange/BindingAdapters;", "", "()V", "setfrom", "", "sec", "Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;", "sectionsList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "viewmodel", "Lcom/t/currenyexchange/viewmodels/CurrencyExchangeViewModel;", "setshowopertaion", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "listitems", "Lcom/t/currenyexchange/Models/ExchangeOperation;", "setto", "app_debug"})
public final class BindingAdapters {
    @org.jetbrains.annotations.NotNull()
    public static final com.t.currenyexchange.BindingAdapters INSTANCE = null;
    
    private BindingAdapters() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bind:from", "bind:viewmodel"})
    public static final void setfrom(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.MaterialAutoCompleteTextView sec, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> sectionsList, @org.jetbrains.annotations.NotNull()
    com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel viewmodel) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bind:to", "bind:viewmodel"})
    public static final void setto(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.MaterialAutoCompleteTextView sec, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> sectionsList, @org.jetbrains.annotations.NotNull()
    com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel viewmodel) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bind:opertaions"})
    public static final void setshowopertaion(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.t.currenyexchange.Models.ExchangeOperation> listitems) {
    }
}