package com.example.hw4m4_geeks.fragments

import android.os.Parcelable
import java.io.Serializable

data class User(
    val name : String,
    val email : String,
    val password : Int

) : Serializable