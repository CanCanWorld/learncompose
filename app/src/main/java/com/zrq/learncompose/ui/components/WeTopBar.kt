package com.zrq.learncompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zrq.learncompose.ui.theme.WeComposeTheme
import com.zrq.learncompose.R
import com.zrq.learncompose.vm.WeChatViewModel

@Composable
fun WeTopBar(title: String, onBack: (() -> Unit)? = null) {
  Box(
    Modifier
      .background(WeComposeTheme.colors.background)
      .fillMaxWidth()
  ) {
    Row(
      Modifier
        .height(48.dp)
    ) {
      if (onBack != null) {
        Icon(
          painterResource(R.drawable.ic_back),
          null,
          Modifier
            .clickable(onClick = onBack)
            .align(Alignment.CenterVertically)
            .size(36.dp)
            .padding(8.dp),
          tint = WeComposeTheme.colors.icon
        )
      }
      Spacer(Modifier.weight(1f))
      val viewModel: WeChatViewModel = viewModel()
      Icon(
        painterResource(R.drawable.ic_palette),
        "切换主题",
        Modifier
          .clickable {
            viewModel.theme = when (viewModel.theme) {
              WeComposeTheme.Theme.Light -> WeComposeTheme.Theme.Dark
              WeComposeTheme.Theme.Dark -> WeComposeTheme.Theme.NewYear
              WeComposeTheme.Theme.NewYear -> WeComposeTheme.Theme.Light
            }
          }
          .align(Alignment.CenterVertically)
          .size(36.dp)
          .padding(8.dp),
        tint = WeComposeTheme.colors.icon
      )
    }
    Text(title, Modifier.align(Alignment.Center), color = WeComposeTheme.colors.textPrimary)
  }
}