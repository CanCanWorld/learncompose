package com.zrq.learncompose.common.webview

import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient

fun WebView.setWebViewClient() {
    webViewClient = object : WebViewClient() {
        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            Log.d(TAG, "页面加载完成: $url")
        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            // 允许加载内容 URI
            return false
        }
    }
}