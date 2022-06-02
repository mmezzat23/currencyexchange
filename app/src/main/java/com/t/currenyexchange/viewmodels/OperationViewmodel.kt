package com.t.currenyexchange.viewmodels

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import com.t.currenyexchange.Models.ExchangeOperation


/**
 * Created by BEST BUY on 5/8/2018.
 */

class OperationViewmodel : BaseObservable() {
    var onservse = ObservableField<ExchangeOperation>()
    var vedioModel : ExchangeOperation? = null
    fun setdata(vedioModel: ExchangeOperation) {
        notifyChange()
        onservse.set(vedioModel)
        this.vedioModel = vedioModel
    }

}