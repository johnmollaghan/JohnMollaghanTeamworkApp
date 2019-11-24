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
import com.jm.johnmollaghanteamworkapp.adapters.TaskListAdapter;
import com.jm.johnmollaghanteamworkapp.model.project.TodoItem;
import com.jm.johnmollaghanteamworkapp.viewmodel.TasksForProjectModel;

import java.util.ArrayList;
import java.util.Objects;

import static android.view.View.GONE;
import static com.jm.johnmollaghanteamworkapp.adapters.ProjectListAdapter.PROJECT_NAME;

public class TasksForProjectActivity extends AppCompatActivity {

    private static final String PROJECT_ID = "ProjectId";
    private final ArrayList<TodoItem> taskList = new ArrayList<>();
    private TaskListAdapter taskListAdapter;
    private RecyclerView rvTaskList;
    private TasksForProjectModel tasksForProjectViewModel;
    private String projectId;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_for_project);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rvTaskList = findViewById(R.id.rvTasksForProject);
        progressBar = findViewById(R.id.progressBar);

        tasksForProjectViewModel = ViewModelProviders.of(this).get(TasksForProjectModel.class);

        projectId = Objects.requireNonNull(getIntent().getExtras()).getString(PROJECT_ID);
        String projectName = getIntent().getExtras().getString(PROJECT_NAME);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(projectName);
        }

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> refreshTaskList());

        refreshTaskList();
    }

    private void refreshTaskList() {

        progressBar.setVisibility(View.VISIBLE);
        tasksForProjectViewModel.init(projectId);
        taskList.clear();

        tasksForProjectViewModel.getRepository().observe(this, tasksResponse -> {
            if (tasksResponse != null) {
                taskList.addAll(tasksResponse.getTodoItems());
                taskListAdapter.notifyDataSetChanged();
            } else {
                final Snackbar snackbar = Snackbar
                        .make(findViewById(R.id.app_bar), "Enable to retrieve the Task list right now, please ensure that your device is online.", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
            progressBar.setVisibility(GONE);
        });

        updaterRecycerView();
    }

    private void updaterRecycerView() {
        if (taskListAdapter == null) {
            taskListAdapter = new TaskListAdapter(TasksForProjectActivity.this, taskList);
            rvTaskList.setLayoutManager(new LinearLayoutManager(this));
            rvTaskList.setAdapter(taskListAdapter);
            rvTaskList.setItemAnimator(new DefaultItemAnimator());
            rvTaskList.setNestedScrollingEnabled(true);
        } else {
            taskListAdapter.notifyDataSetChanged();
        }
    }
}
