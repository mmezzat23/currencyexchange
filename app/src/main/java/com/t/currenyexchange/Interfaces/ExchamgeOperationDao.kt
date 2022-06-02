package com.t.currenyexchange.Interfaces

import androidx.room.*
import com.t.currenyexchange.Models.ExchangeOperation

@Dao
interface ExchamgeOperationDao {
    @get:Query("SELECT * FROM exchangeoperation")
    val all: List<ExchangeOperation?>?

    @Insert
    fun insert(task: ExchangeOperation?)

    @Delete
    fun delete(task: ExchangeOperation?)

    @Update
    fun update(task: ExchangeOperation?)

    @Query(
        "SELECT * FROM exchangeoperation WHERE `from` LIKE :from || " +
                "`to` LIKE :to ||" +
                "`from` LIKE :to ||" +
                "`to` LIKE :from AND" +
                "'date' >= :date"
    )
    fun findByName(from: String?, to: String? , date : Long?): List<ExchangeOperation>?
}