package com.zrq.learncompose.page

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zrq.learncompose.vm.CoroutineVM

@Composable
fun CoroutinePage() {
    val vm = viewModel<CoroutineVM>()
    Column {
        vm.buttons.forEach {
            Button(onClick = { it.onClick() }) {
                Text(text = it.title)
            }
        }
        Text(text = vm.result)
    }
}