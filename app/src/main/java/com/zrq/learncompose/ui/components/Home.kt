package com.zrq.learncompose.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.zrq.learncompose.vm.WeChatViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home(viewModel: WeChatViewModel) {
  Column {
    val pagerState = rememberPagerState()
    HorizontalPager(
      pageCount = 4,
      Modifier.weight(1f),
      pagerState
    ) { page ->
      when (page) {
        0 -> ChatList(viewModel.chats)
        1 -> ContactList()
        2 -> DiscoveryList()
        3 -> MeList()
      }
    }
    val scope = rememberCoroutineScope() // 创建 CoroutineScope
    // 不显示 viewModel.selectedTab，改为 pagerState.currentPage
    WeBottomBar(pagerState.currentPage) { page ->
      // 点击页签后，在协程里翻页
      scope.launch {
        pagerState.animateScrollToPage(page)
      }
    }
  }
}