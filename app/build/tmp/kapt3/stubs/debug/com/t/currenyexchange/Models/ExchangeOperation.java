package com.t.currenyexchange.Models;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lcom/t/currenyexchange/Models/ExchangeOperation;", "", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "amountresult", "getAmountresult", "setAmountresult", "date", "", "getDate", "()J", "setDate", "(J)V", "from", "getFrom", "setFrom", "id", "", "getId", "()I", "setId", "(I)V", "to", "getTo", "setTo", "app_debug"})
public final class ExchangeOperation {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "from")
    private java.lang.String from = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "to")
    private java.lang.String to = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "amount")
    private java.lang.String amount = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "amountresult")
    private java.lang.String amountresult = "";
    @androidx.room.ColumnInfo(name = "date")
    private long date = 0L;
    
    public ExchangeOperation() {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTo() {
        return null;
    }
    
    public final void setTo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmountresult() {
        return null;
    }
    
    public final void setAmountresult(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
}