package com.example.mylearn

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(val id: Int, val name: String, val loggedIn: Boolean, val photo: String) :
    Parcelable
