package com.jm.johnmollaghanteamworkapp.networking;

import androidx.lifecycle.MutableLiveData;

import com.jm.johnmollaghanteamworkapp.model.project.TasksForProject;
import com.jm.johnmollaghanteamworkapp.model.project.UserProjects;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProjectRepository {

    private static ProjectRepository projectRepository;
    private final NetworkCalls projectApi;

    private ProjectRepository() {
        projectApi = Objects.requireNonNull(RetrofitInstance.INSTANCE.getRetrofitInstance()).create(NetworkCalls.class);

    }

    public static ProjectRepository getInstance() {
        if (projectRepository == null) {
            projectRepository = new ProjectRepository();
        }
        return projectRepository;
    }

    public MutableLiveData<UserProjects> getProjects() {
        final MutableLiveData<UserProjects> projectData = new MutableLiveData<>();
        projectApi.getUserProjects(true, true).enqueue(new Callback<UserProjects>() {
            @Override
            public void onResponse(@NotNull Call<UserProjects> call,
                                   @NotNull Response<UserProjects> response) {
                if (response.isSuccessful()) {
                    projectData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(@NotNull Call<UserProjects> call, @NotNull Throwable t) {
                projectData.setValue(null);
            }
        });
        return projectData;
    }

    public MutableLiveData<TasksForProject> getTasksForProject(String projectId) {
        final MutableLiveData<TasksForProject> tasksData = new MutableLiveData<>();
        projectApi.getTasksForProject(projectId).enqueue(new Callback<TasksForProject>() {
            @Override
            public void onResponse(@NotNull Call<TasksForProject> call,
                                   @NotNull Response<TasksForProject> response) {
                if (response.isSuccessful()) {
                    tasksData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(@NotNull Call<TasksForProject> call, @NotNull Throwable t) {
                tasksData.setValue(null);
            }
        });
        return tasksData;
    }

}
