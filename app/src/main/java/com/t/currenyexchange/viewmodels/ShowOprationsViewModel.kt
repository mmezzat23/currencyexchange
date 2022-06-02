package com.t.currenyexchange.viewmodels

import androidx.databinding.BaseObservable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.t.currenyexchange.Interfaces.AppDatabase
import com.t.currenyexchange.Models.ExchangeOperation
import com.t.currenyexchange.Ui.Activity.ShowexcahngeoperationActivity
import com.t.currenyexchange.Ui.Adapter.Operationsadapter
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*
import kotlin.collections.ArrayList

class ShowOprationsViewModel(activity: ShowexcahngeoperationActivity) : BaseObservable(){

    var operations: ArrayList<ExchangeOperation> = ArrayList()
    var context = ShowexcahngeoperationActivity()
    public lateinit var operationsadapter: Operationsadapter
    var linearlayout: LinearLayoutManager? = null
    var db: AppDatabase? = null

    init {
        context = activity
        operationsadapter = Operationsadapter()
        linearlayout = LinearLayoutManager(activity)
        linearlayout!!.orientation = LinearLayoutManager.VERTICAL
        context.binding.listitem.layoutManager = linearlayout
        context.binding.listitem.adapter = operationsadapter
        Thread {
            db = Room.databaseBuilder(
                context,
                AppDatabase::class.java, "exchanges"
            ).build()
            operations.addAll(db!!.exchamgeOperationDao().findByName("USD" , "EGP" , System.currentTimeMillis() - 7 * 24 * 60 * 60 * 1000)!!)
            notifyChange()
        }.start()


    }


}