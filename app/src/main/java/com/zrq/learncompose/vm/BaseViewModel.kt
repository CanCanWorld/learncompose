package com.zrq.learncompose.vm

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import com.zrq.learncompose.activity.BaseActivity
import com.zrq.learncompose.common.network.RetrofitClient

open class BaseViewModel : ViewModel() {

    protected val TAG = this::class.java.simpleName

    @SuppressLint("StaticFieldLeak")
    lateinit var activity: BaseActivity

    protected val apiService = RetrofitClient.apiService

}