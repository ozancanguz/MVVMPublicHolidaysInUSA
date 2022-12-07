package com.ozancanguz.mvvmpublicholidaysinusa.data.repository

import com.ozancanguz.mvvmpublicholidaysinusa.data.network.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository @Inject constructor(remoteDataSource: RemoteDataSource){

    val remote=remoteDataSource

}