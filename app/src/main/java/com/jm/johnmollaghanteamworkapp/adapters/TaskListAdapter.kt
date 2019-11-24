package com.jm.johnmollaghanteamworkapp.adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.jm.johnmollaghanteamworkapp.R
import com.jm.johnmollaghanteamworkapp.model.project.TodoItem
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class TaskListAdapter(private val context: Context, private val tasks: ArrayList<TodoItem>) :
    RecyclerView.Adapter<TaskListAdapter.TaskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.task_cell, parent, false)
        return TaskViewHolder(view)
    }

    private fun formatDateToLocale(dateString: String): String {

        return try {
            val myFormat = "yyyyMMdd"
            val sdf = SimpleDateFormat(myFormat, Locale.getDefault())
            val dateObj = sdf.parse(dateString)

            if (dateObj != null) {
                val format = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
                format.format(dateObj)
            } else {
                "??"
            }
        } catch (e: Exception) {
            "??"
        }
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.tvTaskName.text = tasks[position].content.toString()

        if (tasks[position].responsiblePartyNames != null) {
            holder.tvAssigneeName.text = tasks[position].responsiblePartyNames.toString()
        } else {
            holder.tvAssigneeName.text = "??"
        }
        holder.pbTaskProgress.progress = tasks[position].progress!!
        holder.tvTaskStatus.text = tasks[position].status
        holder.tvTaskProgress.text = String.format("%s%%", tasks[position].progress!!)
        holder.tvTaskDescription.text = tasks[position].description.toString()
        holder.tvTaskDescription.text = tasks[position].description.toString()

        if (tasks[position].startDate != null) {
            holder.tvTaskStartDate.text = formatDateToLocale(tasks[position].startDate.toString())
        } else {
            holder.tvTaskStartDate.text = "??"
        }

        if (tasks[position].dueDate != null) {
            holder.tvTaskDueDate.text = formatDateToLocale(tasks[position].dueDate.toString())
        } else {
            holder.tvTaskDueDate.text = "??"
        }


        when (tasks[position].priority.toString().toLowerCase()) {
            "low" -> holder.ivTaskPriority.setColorFilter(Color.parseColor("#008000"))
            "medium" -> holder.ivTaskPriority.setColorFilter(Color.parseColor("#ffa500"))
            "high" -> holder.ivTaskPriority.setColorFilter(Color.parseColor("#8b0000"))
            else -> holder.ivTaskPriority.visibility = View.INVISIBLE
        }

        holder.chipgroupTags.removeAllViews()

        if (tasks[position].tags != null) {
            for (tag in tasks[position].tags) {
                val newChip = Chip(context)
                newChip.text = tag.name
                newChip.setTextColor(Color.parseColor(tag.color))
                holder.chipgroupTags.addView(newChip)
            }
        }

    }


    override fun getItemCount(): Int {
        return tasks.size
    }

    inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var tvTaskName: TextView = itemView.findViewById(R.id.tvTaskName)
        internal var tvTaskDescription: TextView
        internal var tvTaskProgress: TextView
        internal var pbTaskProgress: ProgressBar
        internal var tvAssigneeName: TextView
        internal var tvTaskStartDate: TextView
        internal var tvTaskDueDate: TextView
        internal var ivTaskPriority: ImageView

        internal var tvTaskStatus: TextView
        internal var chipgroupTags: ChipGroup

        init {

            tvTaskDescription = itemView.findViewById(R.id.tvTaskDescription)
            pbTaskProgress = itemView.findViewById(R.id.pbTaskProgress)
            tvTaskProgress = itemView.findViewById(R.id.tvTaskProgress)
            tvTaskStatus = itemView.findViewById(R.id.tvTaskStatus)
            tvAssigneeName = itemView.findViewById(R.id.tvOwnerName)
            ivTaskPriority = itemView.findViewById(R.id.ivTaskPriority)
            tvTaskStartDate = itemView.findViewById(R.id.tvTaskStartDate)
            tvTaskDueDate = itemView.findViewById(R.id.tvTaskDueDate)
            chipgroupTags = itemView.findViewById(R.id.chipgroupTags)

            pbTaskProgress.max = 100

        }

    }
}
