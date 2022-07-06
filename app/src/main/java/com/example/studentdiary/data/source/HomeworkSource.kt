package com.example.studentdiary.data.source

import com.example.studentdiary.R
import com.example.studentdiary.data.model.HomeWork

class HomeworkSource() {
    fun homeworkList() = listOf(
        HomeWork(
            title = "Homework №1",
            imageLesson= R.drawable.ic_ball_foreground,
            imageStudent = R.drawable.ic_developer_foreground,
            nextImageStudent = R.drawable.ic_man_bouncing_ball_dark_foreground,
            task = "You will be task 1",
            dateStart = "01.01.2021"
        ),
        HomeWork(
            title = "Homework №2",
            imageLesson= R.drawable.ic_books_foreground,
            imageStudent = R.drawable.ic_developer_foreground,
            nextImageStudent = R.drawable.ic_man_bouncing_ball_light_foreground,
            task = "You will be task 2",
            dateStart = "01.01.2021"
        ),
        HomeWork(
            title = "Homework №3",
            imageLesson= R.drawable.ic_ball_foreground,
            imageStudent = R.drawable.ic_man_bouncing_ball_dark_foreground,
            nextImageStudent = R.drawable.ic_girl_student_foreground,
            task = "You will be task 3",
            dateStart = "01.01.2021"
        ),
        HomeWork(
            title = "Homework №4",
            imageLesson= R.drawable.ic_books_foreground,
            imageStudent = R.drawable.ic_woman_with_ball_foreground,
            nextImageStudent = R.drawable.ic_person_man_foreground,
            task = "You will be task 4",
            dateStart = "01.01.2021"
        ),
        HomeWork(
            title = "Homework №5",
            imageLesson= R.drawable.ic_books_foreground,
            imageStudent = R.drawable.ic_person_frowning_foreground,
            nextImageStudent = R.drawable.ic_woman_with_ball_foreground,
            task = "You will be task 5",
            dateStart = "01.01.2021"
        ),
        HomeWork(
            title = "Homework №6",
            imageLesson= R.drawable.ic_ball_foreground,
            imageStudent = R.drawable.ic_developer_foreground,
            nextImageStudent = R.drawable.ic_man_bouncing_ball_light_foreground,
            task = "You will be task 6",
            dateStart = "01.01.2021"
        ),
        HomeWork(
            title = "Homework №7",
            imageLesson= R.drawable.ic_books_foreground,
            imageStudent = R.drawable.ic_developer_foreground,
            nextImageStudent = R.drawable.ic_woman_with_ball_foreground,
            task = "You will be task 7",
            dateStart = "01.01.2021"
        )
    )
}