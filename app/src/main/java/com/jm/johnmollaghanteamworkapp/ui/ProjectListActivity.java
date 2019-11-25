package com.jm.johnmollaghanteamworkapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.jm.johnmollaghanteamworkapp.R;
import com.jm.johnmollaghanteamworkapp.adapters.ProjectListAdapter;
import com.jm.johnmollaghanteamworkapp.model.project.Project;
import com.jm.johnmollaghanteamworkapp.viewmodel.ProjectListViewModel;

import java.util.ArrayList;
import java.util.Objects;

public class ProjectListActivity extends AppCompatActivity {

    private final ArrayList<Project> projectList = new ArrayList<>();
    private ProjectListAdapter projectListAdapter;
    private RecyclerView rvProjects;
    private ProjectListViewModel projectListViewModel;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progressBar = findViewById(R.id.progressBar);
        rvProjects = findViewById(R.id.rvProjects);
        projectListViewModel = ViewModelProviders.of(this).get(ProjectListViewModel.class);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> refreshProjectList());

        refreshProjectList();
    }

    private void refreshProjectList() {

        progressBar.setVisibility(View.VISIBLE);
        projectListViewModel.init();

        projectList.clear();
        Objects.requireNonNull(projectListViewModel.getRepository()).observe(this, projectsResponse -> {
            if (projectsResponse != null) {
                projectList.addAll(projectsResponse.getProjects());
                projectListAdapter.notifyDataSetChanged();
            } else {
                Snackbar snackbar = Snackbar
                        .make(findViewById(R.id.app_bar), getResources().getString(R.string.cannot_retrieve_projects), Snackbar.LENGTH_LONG);
                snackbar.show();
            }
            progressBar.setVisibility(View.GONE);
        });


        updaterRecycerView();
    }

    private void updaterRecycerView() {
        if (projectListAdapter == null) {
            projectListAdapter = new ProjectListAdapter(ProjectListActivity.this, projectList);
            rvProjects.setLayoutManager(new LinearLayoutManager(this));
            rvProjects.setAdapter(projectListAdapter);
            rvProjects.setItemAnimator(new DefaultItemAnimator());
            rvProjects.setNestedScrollingEnabled(true);
        } else {
            projectListAdapter.notifyDataSetChanged();
        }
    }
}
