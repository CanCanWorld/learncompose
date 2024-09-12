package com.zrq.learncompose.activity

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
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
        setContent {
            MainPage()
        }
    }

    @Composable
    abstract fun MainPage()

}