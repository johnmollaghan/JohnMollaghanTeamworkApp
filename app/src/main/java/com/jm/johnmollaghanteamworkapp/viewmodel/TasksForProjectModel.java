package com.jm.johnmollaghanteamworkapp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.jm.johnmollaghanteamworkapp.model.project.TasksForProject;
import com.jm.johnmollaghanteamworkapp.networking.ProjectRepository;

public class TasksForProjectModel extends ViewModel {

    private MutableLiveData<TasksForProject> mutableLiveData;

    public void init(String projectId) {

        ProjectRepository projectRepository = ProjectRepository.getInstance();
        mutableLiveData = projectRepository.getTasksForProject(projectId);

    }

    public LiveData<TasksForProject> getRepository() {
        return mutableLiveData;
    }

}
