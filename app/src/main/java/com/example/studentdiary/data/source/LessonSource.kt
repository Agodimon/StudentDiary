package com.example.studentdiary.data.source

import com.example.studentdiary.R
import com.example.studentdiary.data.model.Lesson

class LessonSource {
    fun lessonsSource()=
        listOf(
            Lesson(
                title = "HOMEWORK N1.1",
                dateStart ="10.04.2021",
                image = R.drawable.background_lesson,
                overLesson = true
            ),
            Lesson(
                title = "HOMEWORK N1.2",
                dateStart ="10.05.2021",
                image = R.drawable.background_lesson,
                overLesson = false
            ),
            Lesson(
                title = "HOMEWORK N1.3",
                dateStart ="10.06.2021",
                image = R.drawable.background_lesson,
                overLesson = true
            ),
            Lesson(
                title = "HOMEWORK N1.4",
                dateStart ="10.07.2021",
                image = R.drawable.background_lesson,
                overLesson = false
            ),
            Lesson(
                title = "HOMEWORK N1.5",
                dateStart ="10.08.2021",
                image = R.drawable.background_lesson,
                overLesson = true
            ),
            Lesson(
                title = "HOMEWORK N1.1",
                dateStart ="10.09.2021",
                image = R.drawable.background_lesson,
                overLesson = false
            ),
            Lesson(
                title = "HOMEWORK N1.1",
                dateStart ="10.10.2021",
                image = R.drawable.background_lesson,
                overLesson = true
            ),
        )
}