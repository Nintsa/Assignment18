package com.example.assignment18

import com.squareup.moshi.Json

@Entity
data class PersonsEntity (
    @PrimaryKey
    @Json(name = "id")
    val id: Int,
    @Json(name = "email")
    val email: String,
    @Json(name = "first_name")
    val firstName: String,
    @Json(name = "last_name")
    val lastName: String,
    @Json(name = "avatar")
    val imageUrl: String?
)