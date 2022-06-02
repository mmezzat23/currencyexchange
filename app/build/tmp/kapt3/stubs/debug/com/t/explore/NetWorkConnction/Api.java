package com.t.explore.NetWorkConnction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/t/explore/NetWorkConnction/Api;", "", "changecurrency", "Lretrofit2/Call;", "Lcom/t/currenyexchange/Models/CurrencyExcahngeModel;", "from", "", "to", "amount", "Api", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "convert")
    public abstract retrofit2.Call<com.t.currenyexchange.Models.CurrencyExcahngeModel> changecurrency(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "from")
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "to")
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "amount")
    java.lang.String amount);
}