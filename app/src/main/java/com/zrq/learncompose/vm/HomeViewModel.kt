package com.zrq.learncompose.vm

import androidx.lifecycle.ViewModel
import com.zrq.learncompose.activity.AnimateActivity
import com.zrq.learncompose.activity.WeChatActivity
import com.zrq.learncompose.activity.WebViewActivity

class HomeViewModel : ViewModel() {

    data class ButtonType(
        val text: String,
        val cls: Class<*>
    )

    val buttons = mutableListOf(
        ButtonType("微信", WeChatActivity::class.java),
        ButtonType("动画", AnimateActivity::class.java),
        ButtonType("WebView", WebViewActivity::class.java),
    )

}