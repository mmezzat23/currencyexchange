package com.t.currenyexchange.Interfaces;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\'J3\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\'\u00a2\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\'J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\'R\u001e\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/t/currenyexchange/Interfaces/ExchamgeOperationDao;", "", "all", "", "Lcom/t/currenyexchange/Models/ExchangeOperation;", "getAll", "()Ljava/util/List;", "delete", "", "task", "findByName", "from", "", "to", "date", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/util/List;", "insert", "update", "app_debug"})
public abstract interface ExchamgeOperationDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM exchangeoperation")
    public abstract java.util.List<com.t.currenyexchange.Models.ExchangeOperation> getAll();
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.Nullable()
    com.t.currenyexchange.Models.ExchangeOperation task);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.Nullable()
    com.t.currenyexchange.Models.ExchangeOperation task);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.Nullable()
    com.t.currenyexchange.Models.ExchangeOperation task);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM exchangeoperation WHERE `from` LIKE :from || `to` LIKE :to ||`from` LIKE :to ||`to` LIKE :from AND\'date\' >= :date")
    public abstract java.util.List<com.t.currenyexchange.Models.ExchangeOperation> findByName(@org.jetbrains.annotations.Nullable()
    java.lang.String from, @org.jetbrains.annotations.Nullable()
    java.lang.String to, @org.jetbrains.annotations.Nullable()
    java.lang.Long date);
}