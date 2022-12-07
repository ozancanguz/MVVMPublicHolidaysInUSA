package com.ozancanguz.mvvmpublicholidaysinusa.data.network

import com.ozancanguz.mvvmpublicholidaysinusa.data.HolidaysApi
import com.ozancanguz.mvvmpublicholidaysinusa.model.Holiday
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val holidaysApi: HolidaysApi) {


    suspend fun getAllHolidays():Response<List<Holiday>>{

        return holidaysApi.getAllHolidays()
    }
}