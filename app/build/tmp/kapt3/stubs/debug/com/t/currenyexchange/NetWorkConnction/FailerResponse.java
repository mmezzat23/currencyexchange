package com.t.currenyexchange.NetWorkConnction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001,B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u001a\u0010!\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001e\u00a8\u0006-"}, d2 = {"Lcom/t/currenyexchange/NetWorkConnction/FailerResponse;", "", "()V", "BAD_REQUEST", "", "getBAD_REQUEST", "()I", "CREATED", "getCREATED", "Error", "getError", "Failer", "getFailer", "Not_FOUND", "getNot_FOUND", "REFRESH_TOKEN", "getREFRESH_TOKEN", "SERVER_ERROR", "getSERVER_ERROR", "SUCCESS", "getSUCCESS", "UNAUTHORIZE", "getUNAUTHORIZE", "USER_DELETE", "getUSER_DELETE", "device_type", "", "getDevice_type", "()Ljava/lang/String;", "setDevice_type", "(Ljava/lang/String;)V", "limit", "getLimit", "version", "getVersion", "setVersion", "handleFailure", "", "activity", "Landroid/app/Activity;", "statusCode", "errorResponse", "listener", "Lcom/t/currenyexchange/NetWorkConnction/FailerResponse$RefreshTokenListener;", "RefreshTokenListener", "app_debug"})
public final class FailerResponse {
    @org.jetbrains.annotations.NotNull()
    public static final com.t.currenyexchange.NetWorkConnction.FailerResponse INSTANCE = null;
    private static final int REFRESH_TOKEN = 401;
    private static final int SUCCESS = 200;
    private static final int CREATED = 201;
    private static final int Failer = 422;
    private static final int BAD_REQUEST = 400;
    private static final int UNAUTHORIZE = 401;
    private static final int SERVER_ERROR = 500;
    private static final int USER_DELETE = 403;
    private static final int Not_FOUND = 404;
    private static final int Error = 409;
    private static final int limit = 10;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String version = "v1";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String device_type = "1";
    
    private FailerResponse() {
        super();
    }
    
    public final int getREFRESH_TOKEN() {
        return 0;
    }
    
    public final int getSUCCESS() {
        return 0;
    }
    
    public final int getCREATED() {
        return 0;
    }
    
    public final int getFailer() {
        return 0;
    }
    
    public final int getBAD_REQUEST() {
        return 0;
    }
    
    public final int getUNAUTHORIZE() {
        return 0;
    }
    
    public final int getSERVER_ERROR() {
        return 0;
    }
    
    public final int getUSER_DELETE() {
        return 0;
    }
    
    public final int getNot_FOUND() {
        return 0;
    }
    
    public final int getError() {
        return 0;
    }
    
    public final int getLimit() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    public final void setVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDevice_type() {
        return null;
    }
    
    public final void setDevice_type(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void handleFailure(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String errorResponse, @org.jetbrains.annotations.NotNull()
    com.t.currenyexchange.NetWorkConnction.FailerResponse.RefreshTokenListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/t/currenyexchange/NetWorkConnction/FailerResponse$RefreshTokenListener;", "", "onRefresh", "", "app_debug"})
    public static abstract interface RefreshTokenListener {
        
        public abstract void onRefresh();
    }
}