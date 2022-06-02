package com.t.currenyexchange;

import java.lang.System;

/**
 * Created by BEST BUY on 5/7/2018.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u00020\u00048\u0002X\u0083D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/t/currenyexchange/ErrorResponse;", "", "()V", "message", "", "msg", "getMessage", "getMsg", "setMsg", "", "app_debug"})
public final class ErrorResponse {
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "errors_str")
    private java.lang.String msg = "";
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "message")
    private final java.lang.String message = "";
    
    public ErrorResponse() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
}