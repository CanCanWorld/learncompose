package com.zrq.learncompose.page

import android.Manifest
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.app.ActivityCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zrq.learncompose.common.jsbridge.JsCallType
import com.zrq.learncompose.common.webview.BDWebView
import com.zrq.learncompose.vm.WebViewVM

@Composable
fun WebViewPage() {

    val vm = viewModel<WebViewVM>()
    ActivityCompat.requestPermissions(vm.activity, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE), 123)

    val jsCallType = JsCallType()
    jsCallType.setAppStorage = { _, _ ->
    }

    BDWebView(
        modifier = Modifier.fillMaxSize(),
//        url = "https://codelife.cc/vue3-video-play/guide/install.html#%E5%9F%BA%E6%9C%AC%E7%A4%BA%E4%BE%8B",
//        url = "http://192.168.0.59:8080/",
        url = "http://192.168.0.59:5173/",
//        url = "https://bd.lejiarui.com/#",
        jsCallType = jsCallType,
    ) {
        if (it.canGoBack()) {
            it.goBack()
        } else {
            vm.activity.finish()
        }
    }
    Button(onClick = {
    }) {
        Text(text = "test")
    }
}