package com.zrq.learncompose.activity

import androidx.compose.runtime.Composable
import com.zrq.learncompose.page.CoroutinePage
import com.zrq.learncompose.vm.BaseViewModel
import com.zrq.learncompose.vm.CoroutineVM

class CoroutineActivity : BaseActivity() {
    override fun providerViewModelClass(): Class<out BaseViewModel> = CoroutineVM::class.java

    @Composable
    override fun MainPage() {
        CoroutinePage()
    }


}