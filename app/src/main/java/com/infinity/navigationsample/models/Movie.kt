package com.infinity.navigationsample.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize



@Parcelize
data class Movie(

    val id: String,
    val backdrop_path: String,
    val overview: String,
    val popularity: String,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val vote_average: String,
    val popular : Boolean,
    val latest : Boolean
) : Parcelable

