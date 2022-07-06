package com.example.studentdiary.data.source

import com.example.studentdiary.data.model.Classes

class ClassesSource {
    fun sourceClasses()= listOf(
        Classes(
            title = "Classes",
            lessons = LessonSource().lessonsSource(),
            homeworks = HomeworkSource().homeworkList()
        )
    )
}