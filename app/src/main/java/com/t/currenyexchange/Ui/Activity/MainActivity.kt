package com.t.currenyexchange.Ui.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.t.currenyexchange.R
import com.t.currenyexchange.databinding.CurrencyExchangeBinding
import com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel

class MainActivity : AppCompatActivity() {
    public lateinit var binding: CurrencyExchangeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var currencyExchangeViewModel = CurrencyExchangeViewModel(this@MainActivity)
        binding.currencyexchangeViewModel = currencyExchangeViewModel

    }
}