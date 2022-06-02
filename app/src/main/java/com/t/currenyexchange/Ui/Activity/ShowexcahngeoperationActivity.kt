package com.t.currenyexchange.Ui.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.t.currenyexchange.R
import com.t.currenyexchange.databinding.CurrencyExchangeBinding
import com.t.currenyexchange.databinding.ShowOperationBinding
import com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel
import com.t.currenyexchange.viewmodels.ShowOprationsViewModel

class ShowexcahngeoperationActivity : AppCompatActivity() {
    public lateinit var binding: ShowOperationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_showexcahngeoperation)
        var showOprationsViewModel = ShowOprationsViewModel(this@ShowexcahngeoperationActivity)
        binding.showoperationViewModel = showOprationsViewModel

    }
}