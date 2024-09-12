package com.zrq.learncompose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.zrq.learncompose.page.HomePage
import com.zrq.learncompose.vm.BaseViewModel
import com.zrq.learncompose.vm.HomeViewModel

class HomeActivity : BaseActivity() {
    override fun providerViewModelClass(): Class<out BaseViewModel> = HomeViewModel::class.java

    @Composable
    override fun MainPage() {
        HomePage()
    }
}