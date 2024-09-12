package com.zrq.learncompose.common.jsbridge

import android.util.Log
import android.webkit.WebView

fun WebView.callJs(action: String, vararg data: String) {
    val js = "javascript:${action}('${data.joinToString(",")}')"
    Log.d("CallJs", "js: $js")
    evaluateJavascript(js, null)
}

fun WebView.setImage(imageUrl: String) {
    callJs("setImage", imageUrl)
}
