package com.zrq.learncompose.activity

import android.os.Bundle
import androidx.activity.compose.setContent
import com.zrq.learncompose.page.WebViewPage
import com.zrq.learncompose.vm.WebViewVM

class WebViewActivity : BaseActivity() {
    override fun providerViewModelClass() = WebViewVM::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebViewPage()
        }
    }
}