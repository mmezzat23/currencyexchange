package com.t.currenyexchange.Models


data class CurrencyExcahngeModel (
    val date: String?,
    val historical: String?,
    val info: Info?,
    val query: Query?,
    val result: Double?,
    val success: Boolean?
)

data class Info (
    val rate: Double?,
    val timestamp: Long?
)

data class Query (
    val amount: Long?,
    val from: String?,
    val to: String?
)