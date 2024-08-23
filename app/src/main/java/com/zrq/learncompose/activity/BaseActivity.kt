package com.zrq.learncompose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.zrq.learncompose.vm.BaseViewModel

abstract class BaseActivity : ComponentActivity() {
    abstract fun providerViewModelClass(): Class<out BaseViewModel>

    val vm by lazy {
        ViewModelProvider(this)[providerViewModelClass()]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vm.activity = this
    }
}