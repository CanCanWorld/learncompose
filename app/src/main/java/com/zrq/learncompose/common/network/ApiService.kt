package com.zrq.learncompose.common.network

import com.zrq.learncompose.type.CarouseType
import com.zrq.learncompose.type.DataType
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/bd/mobile/getCarouseList/{id}")
    fun getCarouseListOld(@Path("id") id: String): Call<DataType<List<CarouseType>>>

    @GET("/bd/mobile/getCarouseList/{id}")
    suspend fun getCarouseList(@Path("id") id: String): DataType<List<CarouseType>>
}