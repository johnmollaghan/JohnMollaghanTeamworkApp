package com.jm.johnmollaghanteamworkapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.jm.johnmollaghanteamworkapp.model.project.UserProjects
import com.jm.johnmollaghanteamworkapp.networking.ProjectRepository

class ProjectListViewModel : ViewModel() {

    private var mutableLiveData: MutableLiveData<UserProjects>? = null

    val repository: LiveData<UserProjects>?
        get() = mutableLiveData

    fun init() {
        val projectRepository = ProjectRepository.getInstance()
        mutableLiveData = projectRepository.projects
    }

}
