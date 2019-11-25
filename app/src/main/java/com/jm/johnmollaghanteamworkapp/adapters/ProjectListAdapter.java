package com.jm.johnmollaghanteamworkapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.jm.johnmollaghanteamworkapp.R;
import com.jm.johnmollaghanteamworkapp.model.project.Project;
import com.jm.johnmollaghanteamworkapp.model.project.Tag;
import com.jm.johnmollaghanteamworkapp.ui.TasksForProjectActivity;

import java.util.ArrayList;


public class ProjectListAdapter extends RecyclerView.Adapter<ProjectListAdapter.ProjectViewHolder> {

    private static final String PROJECT_ID = "ProjectId";
    public static final String PROJECT_NAME = "ProjectName";
    private final Context context;
    private final ArrayList<Project> projects;

    public ProjectListAdapter(Context context, ArrayList<Project> projects) {
        this.context = context;
        this.projects = projects;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.project_cell, parent, false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.tvProjectName.setText(projects.get(position).getName());
        holder.tvProjectDescription.setText(projects.get(position).getDescription());
        holder.tvProjectStatus.setText(projects.get(position).getStatus());

        // Handle situation where no owner is defined
        if (projects.get(position).getOwner() != null) {
            if (projects.get(position).getOwner().getAvatarUrl() != null) {
                Glide.with(context).load(projects.get(position).getOwner().getAvatarUrl()).into(holder.ivOwnerAvatar);
            }
            holder.tvOwnerName.setText(projects.get(position).getOwner().getFullName());
        }

        // Add tags
        holder.chipgroupTags.removeAllViews();
        if (projects.get(position).getTags() != null) {
            for (Tag tag : projects.get(position).getTags()
            ) {
                Chip newChip = new Chip(context);
                newChip.setText(tag.getName());
                newChip.setTextColor(Color.parseColor(tag.getColor()));
                holder.chipgroupTags.addView(newChip);
            }
        }

        // Show associated Tasks
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, TasksForProjectActivity.class);
            intent.putExtra(PROJECT_ID, projects.get(position).getId());
            intent.putExtra(PROJECT_NAME, projects.get(position).getName());
            context.startActivity(intent);

        });
    }


    @Override
    public int getItemCount() {
        return projects.size();
    }

    public class ProjectViewHolder extends RecyclerView.ViewHolder {
        final TextView tvProjectName;
        final TextView tvProjectDescription;
        final ImageView ivOwnerAvatar;
        final TextView tvOwnerName;
        final ChipGroup chipgroupTags;
        final TextView tvProjectStatus;

        ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            tvProjectName = itemView.findViewById(R.id.tvProjectName);
            tvProjectDescription = itemView.findViewById(R.id.tvProjectDescription);
            ivOwnerAvatar = itemView.findViewById(R.id.ivOwnerAvatar);
            tvOwnerName = itemView.findViewById(R.id.tvOwnerName);
            tvProjectStatus = itemView.findViewById(R.id.tvProjectStatus);
            chipgroupTags = itemView.findViewById(R.id.chipgroupTags);

        }

    }
}
