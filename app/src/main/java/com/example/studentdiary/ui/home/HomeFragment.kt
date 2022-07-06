package com.example.studentdiary.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.studentdiary.R
import com.example.studentdiary.ui.home.adapters.ClassesAdapter
import com.example.studentdiary.ui.home.adapters.HomeworkAdapter


class HomeFragment : Fragment(R.layout.fragment_home) {
    private var recyclerViewClasses: RecyclerView? = null
    private var recyclerViewHomework: RecyclerView? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapterClasses: RecyclerView.Adapter<ClassesAdapter.HomeWorkViewHolder>? = null
    private var adapterHomework: RecyclerView.Adapter<HomeworkAdapter.HomeWorkViewHolder>? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        layoutManager = LinearLayoutManager(null)
        adapterClasses = ClassesAdapter()
        adapterHomework = HomeworkAdapter()
        recyclerViewClasses = view.findViewById(R.id.classes_recycle_view)
        recyclerViewClasses?.adapter = adapterClasses
        recyclerViewHomework = view.findViewById(R.id.rv_homeworks)
        recyclerViewHomework?.adapter = adapterHomework
    }

}