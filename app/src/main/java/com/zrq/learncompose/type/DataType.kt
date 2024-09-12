package com.zrq.learncompose.type

data class DataType<T>(
    val code: Int,
    val data: T,
    val message: String,
)
