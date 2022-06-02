package com.t.currenyexchange.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class ExchangeOperation {
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0;
    @ColumnInfo(name = "from") var from: String = "";
    @ColumnInfo(name = "to") var to: String = "";
    @ColumnInfo(name = "amount") var amount: String = "";
    @ColumnInfo(name = "amountresult") var amountresult: String = "";
    @ColumnInfo(name = "date") var date: Long = 0
}

