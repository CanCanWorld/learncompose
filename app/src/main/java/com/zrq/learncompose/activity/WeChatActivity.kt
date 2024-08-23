package com.zrq.learncompose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import com.zrq.learncompose.ui.components.ChatPage
import com.zrq.learncompose.ui.components.Home
import com.zrq.learncompose.ui.theme.WeComposeTheme
import com.zrq.learncompose.vm.WeChatViewModel

class WeChatActivity : ComponentActivity() {

    private val viewModel: WeChatViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeComposeTheme(viewModel.theme) {
                Box {
                    Home(viewModel)
                    ChatPage()
                }
            }
        }
    }


}
