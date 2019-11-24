package com.jm.johnmollaghanteamworkapp.networking

import com.jm.johnmollaghanteamworkapp.model.project.TasksForProject
import com.jm.johnmollaghanteamworkapp.model.project.UserProjects

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NetworkCalls {

    @GET("/projects.json")
    fun getUserProjects(@Query("includePeople") includePeople: Boolean, @Query("includeProjectOwner") includeProjectOwner: Boolean): Call<UserProjects>


    @GET("/projects/{id}/tasks.json")
    fun getTasksForProject(@Path("id") projectId: String): Call<TasksForProject>
}
