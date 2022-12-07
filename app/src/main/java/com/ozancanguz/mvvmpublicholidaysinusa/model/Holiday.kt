package com.ozancanguz.mvvmpublicholidaysinusa.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Holiday(

    @SerializedName("name")
    val name: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("launchYear")
    val launchYear: Int,
    @SerializedName("type")
    val type: String
):Parcelable