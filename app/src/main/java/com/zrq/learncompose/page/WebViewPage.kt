package com.zrq.learncompose.page

import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zrq.learncompose.common.webview.BDWebView
import com.zrq.learncompose.vm.WebViewVM

@Composable
fun WebViewPage() {

    val vm = viewModel<WebViewVM>()

    BottomAppBar {

    }

    BDWebView(url = "https://bd.lejiarui.com/#/index") {
        if (it.canGoBack()) {
            it.goBack()
        }else{
            vm.activity.finish()
        }
    }
}