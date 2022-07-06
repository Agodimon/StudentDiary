package com.example.studentdiary.ui.home

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.studentdiary.R

import com.example.studentdiary.data.model.HomeWork
import com.example.studentdiary.data.source.HomeworkSource
import com.example.studentdiary.databinding.ItemHomeworkBinding

class HomeWorkAdapter :
    RecyclerView.Adapter<HomeWorkAdapter.HomeWorkViewHolder>() {

    private var imageLessons = listOf(R.drawable.ic_ball_foreground,R.drawable.ic_books_foreground,R.drawable.ic_onion_foreground)
    private var textTitle = listOf("Basketball","Read literature","Strike")
    private var textTimeOfLessons = listOf("10:00-12:00","08:00-10:00","12:00-14:00")


    inner class HomeWorkViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imageLessons: ImageView = itemView.findViewById(R.id.lesson_image_classes)
        var textTitle: TextView = itemView.findViewById(R.id.title_of_lesson_classes)
        var textTimeOfLessons: TextView = itemView.findViewById(R.id.time_of_lesson_classes)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeWorkAdapter.HomeWorkViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_class, parent, false)
        return HomeWorkViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeWorkViewHolder, position: Int) {
        holder.imageLessons.setImageResource(imageLessons[position])

        holder.textTitle.text = textTitle[position]

        holder.textTimeOfLessons.text = textTimeOfLessons[position]

    }

    override fun getItemCount(): Int = textTitle.size

}