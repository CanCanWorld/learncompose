package com.zrq.learncompose.common.jsbridge

import android.webkit.JavascriptInterface

class JsCall(
    private val jsCallType: JsCallType
) {

    @JavascriptInterface
    fun setAppStorage(key: String, value: String) {
        jsCallType.setAppStorage(key, value)
    }
}

data class JsCallType(
    var setAppStorage: (String, String) -> Unit = { _, _ -> }
)