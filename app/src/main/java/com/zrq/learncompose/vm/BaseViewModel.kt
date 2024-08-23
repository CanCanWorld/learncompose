package com.zrq.learncompose.vm

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import com.zrq.learncompose.activity.BaseActivity

open class BaseViewModel: ViewModel() {

    @SuppressLint("StaticFieldLeak")
    lateinit var activity: BaseActivity

}