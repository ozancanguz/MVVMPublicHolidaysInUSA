package com.ozancanguz.mvvmpublicholidaysinusa.data

import com.ozancanguz.mvvmpublicholidaysinusa.model.Holiday
import retrofit2.Response
import retrofit2.http.GET

interface HolidaysApi {


    @GET("/api/v2/publicholidays/2020/US")
    suspend fun getAllHolidays(): Response<List<Holiday>>

}