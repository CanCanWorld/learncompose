package com.zrq.learncompose.common.webview

import android.webkit.WebChromeClient
import android.webkit.WebView

fun WebView.setWebChromeClient() {
    webChromeClient = object : WebChromeClient() {
    }
}