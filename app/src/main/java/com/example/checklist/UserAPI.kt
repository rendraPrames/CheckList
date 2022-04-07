package com.example.checklist

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPI {
    @POST('login')
    fun login(
        @Body userRequest: UserRequest
    ): Call<UserResponse>
}