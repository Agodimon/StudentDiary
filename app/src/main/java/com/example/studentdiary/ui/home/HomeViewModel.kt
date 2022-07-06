package com.example.studentdiary.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.studentdiary.R
import com.example.studentdiary.data.model.Classes
import com.example.studentdiary.data.model.HomeWork
import com.example.studentdiary.data.source.ClassesSource
import com.example.studentdiary.data.source.HomeworkSource
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    val homeworkSource: MutableLiveData<HomeworkSource> = MutableLiveData()

    fun homeworkSource() {

        homeworkSource.value = HomeworkSource()

    }
}