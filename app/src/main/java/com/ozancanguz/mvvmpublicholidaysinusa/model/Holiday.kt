package com.ozancanguz.mvvmpublicholidaysinusa.model


import com.google.gson.annotations.SerializedName

data class Holiday(

    @SerializedName("name")
    val name: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("launchYear")
    val launchYear: Int,
    @SerializedName("type")
    val type: String
)