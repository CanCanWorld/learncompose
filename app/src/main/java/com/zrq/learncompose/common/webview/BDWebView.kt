package com.zrq.learncompose.common.webview

import android.util.Log
import android.webkit.WebView
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zrq.learncompose.common.jsbridge.JsCall
import com.zrq.learncompose.common.jsbridge.JsCallType
import com.zrq.learncompose.vm.WebViewVM

const val TAG = "BDWebView"

@Composable
fun BDWebView(
    modifier: Modifier = Modifier,
    url: String,
    jsCallType: JsCallType = JsCallType(),
    onBack: (webView: WebView) -> Unit,
) {
    val ctx = LocalContext.current
    val vm = viewModel<WebViewVM>()
    val webView = WebView(ctx)
    AndroidView(
        modifier = modifier,
        factory = {
            Log.d(TAG, "页面加载")
            webView.apply {
                settingWebView()
                setWebViewClient()
                setWebChromeClient(vm.activity)
                addJavascriptInterface(JsCall(jsCallType), "Android")
                loadUrl(url)
                vm.webView = this
            }
        },
        update = {},
    )
    BackHandler {
        onBack(webView)
    }
}