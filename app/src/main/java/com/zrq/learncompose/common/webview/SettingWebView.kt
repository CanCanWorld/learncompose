package com.zrq.learncompose.common.webview

import android.os.Build
import android.util.Log
import android.webkit.WebSettings
import android.webkit.WebView

fun WebView.settingWebView(customUserAgent: String? = null) {
    settings.apply {

        cacheMode = WebSettings.LOAD_DEFAULT //缓存模式

        domStorageEnabled = true //设置支持DomStorage

        javaScriptEnabled = true //支持JavaScript

        javaScriptCanOpenWindowsAutomatically = true // 设置允许JS弹窗

        useWideViewPort = true //自适应屏幕）

        loadWithOverviewMode = true //显示网页或者图片flash的时候,充满全屏

        javaScriptCanOpenWindowsAutomatically = true //JS打开新窗口

        allowFileAccess = true // 允许加载Assets和resources文件

        allowContentAccess = true //可以 使用content://加载文件

        allowFileAccessFromFileURLs = true //允许运行在一个URL环境（the context of a file scheme URL）中的JavaScript访问来自其他URL环境的内容

        allowUniversalAccessFromFileURLs = true //否允许运行在一个file schema URL环境下的JavaScript访问来自其他任何来源的内容，包括其他file schema URLs

        builtInZoomControls = false //不显示缩放按钮

        setSupportZoom(false) //支持缩放

        mediaPlaybackRequiresUserGesture = false //设置WebView是否通过手势触发播放媒体，默认是true，需要手势触发


        if (!(customUserAgent == null || customUserAgent === "")) {
            userAgentString = customUserAgent //支持自定义UserAgent
        }

        domStorageEnabled = true // 开启 DOM storage API 功能

        databaseEnabled = true // 开启 DB storage API 功能


        cacheMode = WebSettings.LOAD_DEFAULT // 设置缓存模式，非常重要，决定了webview缓存资源的方式



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { //https请求的页面中嵌套了http的图片链接时，会导致图片不显示
            mixedContentMode = WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE
        }
    }
}