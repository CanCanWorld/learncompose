package com.zrq.learncompose.page

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zrq.learncompose.vm.HomeViewModel

@Composable
fun HomePage() {
    val ctx = LocalContext.current
    val vm = viewModel<HomeViewModel>()
    Column {
        vm.buttons.forEach {
            Button(onClick = {
                Intent(ctx, it.cls).apply {
                    ctx.startActivity(this)
                }
            }) {
                Text(text = it.text)
            }
        }
    }
}