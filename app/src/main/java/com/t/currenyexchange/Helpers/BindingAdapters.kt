package com.t.currenyexchange

import android.widget.*

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import com.t.currenyexchange.Models.ExchangeOperation
import com.t.currenyexchange.Ui.Adapter.Operationsadapter
import com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel


/**
 * Created by BEST BUY on 5/10/2018.
 */

object BindingAdapters {
   @BindingAdapter("bind:from", "bind:viewmodel")
   @JvmStatic
  fun setfrom(sec: MaterialAutoCompleteTextView, sectionsList: ArrayList<String>, viewmodel: CurrencyExchangeViewModel) {
    val adapter = ArrayAdapter(
        sec.context,
        android.R.layout.simple_list_item_1,
        sectionsList
    )
    sec.setAdapter(adapter)
    sec.setOnItemClickListener { _, _, position, _ ->
        with(adapter.getItem(position)) {
            viewmodel.from.set(adapter.getItem(position))
            viewmodel.notifyChange()
            viewmodel.checktoconnect()
        }
    }
}
    @BindingAdapter("bind:to", "bind:viewmodel")
    @JvmStatic
    fun setto(sec: MaterialAutoCompleteTextView, sectionsList: ArrayList<String>, viewmodel: CurrencyExchangeViewModel) {
        val adapter = ArrayAdapter(
            sec.context,
            android.R.layout.simple_list_item_1,
            sectionsList
        )
        sec.setAdapter(adapter)
        sec.setOnItemClickListener { _, _, position, _ ->
            with(adapter.getItem(position)) {
                viewmodel.to.set(adapter.getItem(position))
                viewmodel.notifyChange()
                viewmodel.checktoconnect()
            }
        }
    }
    @BindingAdapter("bind:opertaions")
    @JvmStatic
    fun setshowopertaion(recyclerView: RecyclerView, listitems: ArrayList<ExchangeOperation>) {
        val adapter = recyclerView.adapter
        if (adapter != null && adapter is Operationsadapter && listitems.size > 0) {
            (adapter as Operationsadapter).setdata(listitems)
        } else {
        }
    }
}
