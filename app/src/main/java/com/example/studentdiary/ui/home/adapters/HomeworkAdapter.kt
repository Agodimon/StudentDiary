package com.example.studentdiary.ui.home.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.studentdiary.R

class HomeworkAdapter :
    RecyclerView.Adapter<HomeworkAdapter.HomeWorkViewHolder>() {

    private var titleOfHomework = listOf("Basketball", "Literature", "Sport")
    private var leftTime = listOf("5 days left", "20 days left", "45 days left")
    private var imageLessonsHomework = listOf(
        R.drawable.ic_retriangle_ball,
        R.drawable.ic_retriangle_books,
        R.drawable.ic_retriangle_onion
    )
    private var homeworkTasks = listOf("Play in ball", "Read literature", "Strike in aim")
    private var personMens = listOf(
        R.drawable.icon_pupal,
        R.drawable.icon_pupal,
        R.drawable.icon_pupal
    )
    private var pupilsNext = listOf(
        R.drawable.icon_pupal,
        R.drawable.icon_pupal,
        R.drawable.icon_pupal
    )


    inner class HomeWorkViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var titleOfHomework: TextView = itemView.findViewById(R.id.title_of_homework)
        var leftTime: TextView = itemView.findViewById(R.id.left_time)
        var imageLessonsHomework: ImageView = itemView.findViewById(R.id.image_lessons_homeworks)
        var homeworkTasks: TextView = itemView.findViewById(R.id.homework_task)
        var personMens: ImageView = itemView.findViewById(R.id.person_man)
        var pupilsNext: ImageView = itemView.findViewById(R.id.pupil_next)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeWorkViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_homework, parent, false)
        return HomeWorkViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeWorkViewHolder, position: Int) {
        holder.imageLessonsHomework.setImageResource(imageLessonsHomework[position])
        holder.personMens.setImageResource(personMens[position])
        holder.pupilsNext.setImageResource(pupilsNext[position])
        holder.titleOfHomework.text = titleOfHomework[position]
        holder.leftTime.text = leftTime[position]
        holder.homeworkTasks.text = homeworkTasks[position]

    }

    override fun getItemCount(): Int = titleOfHomework.size

}