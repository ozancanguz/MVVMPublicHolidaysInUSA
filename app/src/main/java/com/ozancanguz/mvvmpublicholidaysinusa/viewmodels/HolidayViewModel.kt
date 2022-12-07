package com.ozancanguz.mvvmpublicholidaysinusa.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ozancanguz.mvvmpublicholidaysinusa.data.repository.Repository
import com.ozancanguz.mvvmpublicholidaysinusa.model.Holiday
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HolidayViewModel @Inject constructor(private val repository: Repository,
application: Application
                                           ):AndroidViewModel(application) {


    val holidayList=MutableLiveData<List<Holiday>>()
    var job: Job?=null

    fun requestHoliday(){
        job= CoroutineScope(Dispatchers.IO).launch {

            val response=repository.remote.getAllHolidays()
            if(response.isSuccessful){
                holidayList.postValue(response.body())
            }else{
                Log.d("veri","veri cekilemedi")
            }
        }

    }






}