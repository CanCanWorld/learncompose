package com.zrq.learncompose.common.webview

import android.util.Log
import android.webkit.WebView
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView

const val TAG = "BDWebView"

@Composable
fun BDWebView(
    modifier: Modifier = Modifier,
    url: String,
    onBack: (webView: WebView) -> Unit,
) {
    val ctx = LocalContext.current
    val webView = WebView(ctx)
    AndroidView(
        modifier = modifier,
        factory = {
            Log.d(TAG, "页面加载")
            webView.apply {
                settingWebView()
                setWebViewClient()
                setWebChromeClient()
                loadUrl(url)
            }
        },
        update = {},
    )
    BackHandler {
        onBack(webView)
    }
}