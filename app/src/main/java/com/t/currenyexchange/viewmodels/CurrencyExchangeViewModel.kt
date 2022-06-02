package com.t.currenyexchange.viewmodels

import android.content.Intent
import androidx.databinding.BaseObservable
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.adapters.TextViewBindingAdapter
import androidx.room.Room
import atiaf.redstone.NetWorkConnction.RetrofitClient
import com.google.gson.Gson
import com.t.currenyexchange.Dialogs
import com.t.currenyexchange.Interfaces.AppDatabase
import com.t.currenyexchange.Models.CurrencyExcahngeModel
import com.t.currenyexchange.Models.ExchangeOperation
import com.t.currenyexchange.NetWorkConnction.FailerResponse
import com.t.currenyexchange.R
import com.t.currenyexchange.Ui.Activity.MainActivity
import com.t.currenyexchange.Ui.Activity.ShowexcahngeoperationActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList

class CurrencyExchangeViewModel(activity: MainActivity) : BaseObservable(){
    var isloading: ObservableBoolean = ObservableBoolean(false)
    var context = MainActivity()
    var from = ObservableField<String>("")
    var to = ObservableField<String>("")
    var amount = ObservableField<String>("")
    var amountresult = ObservableField<String>("")
    var type = "0"
    var currencies: ArrayList<String> = ArrayList()
    var db: AppDatabase? = null
    init {
        context = activity
        Collections.addAll(currencies , *context.resources.getStringArray(R.array.currencyarrays))
        db = Room.databaseBuilder(
            context,
            AppDatabase::class.java, "exchanges"
        ).build()
    }
    fun checkchange() : Boolean{
        var isgood = true
        if (from.get() == ""){
            Dialogs.showToast("Select from before" , context)
            isgood = false
        }
        if (to.get() == ""){
            Dialogs.showToast("Select to before" , context)
            isgood = false
        }
        if (amount.get() == "" && amountresult.get() == ""){
            Dialogs.showToast(context.getString(R.string.write_amount) , context)
            isgood = false
        }
        return isgood
    }
    fun getchangeresult(){
        if (checkchange()){
            var amountchange = ""
            var fromstring = ""
            var toString = ""

            if (type == "0"){
                amountchange = amount.get().toString()
                fromstring = from.get().toString()
                toString = to.get().toString()
            }else{
                amountchange = amountresult.get().toString()
                toString = from.get().toString()
                fromstring = to.get().toString()
            }
            val call: Call<CurrencyExcahngeModel>? = RetrofitClient.RetrofitClient(context)!!.changecurrency(fromstring,to.toString(),amountchange)
            call!!.enqueue(object : Callback<CurrencyExcahngeModel> {
                override fun onResponse(call: Call<CurrencyExcahngeModel>, response: Response<CurrencyExcahngeModel>) {
                    if (response.code() == 200 || response.code() == 201) {
                         if (type == "0"){
                            context.binding.amountresult.setText(response.body()!!.result.toString())
                         }else {
                             context.binding.amount.setText(response.body()!!.result.toString())

                         }
                        var datastore = ExchangeOperation()
                        datastore.from = fromstring
                        datastore.to = fromstring
                        datastore.amount = amount.get().toString()
                        datastore.amountresult = response.body()!!.result.toString()
                        datastore.date = System.currentTimeMillis()
                        val exchangeDao = db!!.exchamgeOperationDao()
                        exchangeDao.insert(datastore)
                    }else {
                        FailerResponse.handleFailure(context, response.code(), Gson().toJson(response.body()), object : FailerResponse.RefreshTokenListener {
                            override fun onRefresh() {
                            }
                        })
                    }
                }

                override fun onFailure(call: Call<CurrencyExcahngeModel>, t: Throwable) {
                    isloading.set(false)

                }
            })


        }
    }
    fun checktoconnect() {
        var isgood = true
        if (from.get() == ""){
            isgood = false
        }
        if (to.get() == ""){
            isgood = false
        }
        if (amount.get() == "" && amountresult.get() == ""){
            isgood = false
        }
        if (isgood){
            getchangeresult()
        }
    }
    fun onamountChanged(): TextViewBindingAdapter.OnTextChanged {
        return TextViewBindingAdapter.OnTextChanged { s, start, before, count ->
            amount.set(s.toString())
            type = "0"
        }
    }

    fun showpervious() {
        var intent: Intent = Intent(context, ShowexcahngeoperationActivity::class.java)
        context.startActivity(intent)
    }


}