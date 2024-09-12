package com.zrq.learncompose.type

data class ButtonType(
    val title: String,
    val onClick: () -> Unit
)
