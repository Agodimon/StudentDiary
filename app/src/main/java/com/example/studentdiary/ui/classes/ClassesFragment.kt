package com.example.studentdiary.ui.classes

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.studentdiary.R
import com.example.studentdiary.databinding.FragmentClassesBinding
import com.example.studentdiary.databinding.FragmentFavoriteBinding
import com.example.studentdiary.ui.favorite.FavoriteViewModel

class ClassesFragment : Fragment() {

    private var _binding: FragmentClassesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(ClassesViewModel::class.java)

        _binding = FragmentClassesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textClasses
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}