package atiaf.redstone.NetWorkConnction

import android.content.Context
import android.provider.SyncStateContract
import androidx.databinding.ktx.BuildConfig
import com.t.explore.NetWorkConnction.Api

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*
import java.util.concurrent.TimeUnit


object RetrofitClient {
    private var instance: RetrofitClient? = null
    private var myApi: Api? = null

    fun RetrofitClient(context: Context): Api? {
        var httpClient = OkHttpClient().newBuilder()
        httpClient.networkInterceptors().add(Interceptor { chain ->
            val requestBuilder = chain.request().newBuilder()
            requestBuilder.addHeader("apikey" , "DURpkU2DyZIrFsN3Mw1jUfhceD0KdgG3")
            chain.proceed(requestBuilder.build())
        })
        httpClient.apply {
            connectTimeout(1, TimeUnit.MINUTES)
            writeTimeout(2, TimeUnit.MINUTES) // write timeout
            readTimeout(2, TimeUnit.MINUTES) // read timeout
        }
        val retrofit: Retrofit = Retrofit.Builder().baseUrl(Api.Api.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build()
        myApi = retrofit.create(Api::class.java)
        return myApi
    }
}