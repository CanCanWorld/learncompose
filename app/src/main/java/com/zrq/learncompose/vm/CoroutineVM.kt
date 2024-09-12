package com.zrq.learncompose.vm

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewModelScope
import com.zrq.learncompose.type.ButtonType
import com.zrq.learncompose.type.CarouseType
import com.zrq.learncompose.type.DataType
import kotlinx.coroutines.launch

class CoroutineVM : BaseViewModel() {
    var result by mutableStateOf("")


    @SuppressLint("StaticFieldLeak")
    val buttons = listOf(
        ButtonType("AsyncTask") {
            viewModelScope.launch {
                val data = apiService.getCarouseList("0")
                result = data.data[0].imgurl
            }
        },
    )
}