package com.example.studentdiary.data.model

data class Classes(
    val title: String,
    var lessons: List<Lesson>,
    val homeworks: List<HomeWork>
)
