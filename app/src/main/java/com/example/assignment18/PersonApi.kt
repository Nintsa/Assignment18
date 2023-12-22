package com.example.assignment18

import com.example.assignment18.models.Person
import retrofit2.http.GET
import retrofit2.http.Query


interface PersonApi {

    @GET("persons")
    suspend fun getPersons(
        @Query("page") page: Int,
        @Query("per_page") pageCount: Int, // do I need to add total here ?
    ) : List<Person>

    companion object {
        const val BASE_URL = "https://reqres.in/api/users?page=1/" // should i use / in the end of the url?
    }
}