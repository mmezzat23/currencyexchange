package com.t.explore.NetWorkConnction

import com.t.currenyexchange.Models.CurrencyExcahngeModel
import com.t.explore.NetWorkConnction.Api.Api.BASE_URL
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface Api {

    @GET(value = "convert")
     fun changecurrency(
        @Query("from") from: String,
        @Query("to") to: String ,
        @Query("amount") amount: String
    ): Call<CurrencyExcahngeModel>

    object Api{
        var BASE_URL = "https://api.apilayer.com/fixer/"

    }
}