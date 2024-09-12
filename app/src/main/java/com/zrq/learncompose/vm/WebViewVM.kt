package com.zrq.learncompose.vm

import android.annotation.SuppressLint
import android.webkit.WebView

class WebViewVM: BaseViewModel() {
    @SuppressLint("StaticFieldLeak")
    var webView : WebView? = null
}