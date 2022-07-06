package com.example.studentdiary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.studentdiary.databinding.ActivityMainBinding
import com.example.studentdiary.ui.classes.ClassesFragment
import com.example.studentdiary.ui.favorite.FavoriteFragment
import com.example.studentdiary.ui.home.HomeFragment
import com.example.studentdiary.ui.task.TaskFragment

import com.ismaeldivita.chipnavigation.ChipNavigationBar

class MainActivity : AppCompatActivity() {
    lateinit var bottom_navigation: ChipNavigationBar
    private val classesFragment = ClassesFragment()
    private val favoriteFragment = FavoriteFragment()
    private val homeFragment = HomeFragment()
    private val taskFragment = TaskFragment()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(homeFragment)
        with(binding) {
            bottom_navigation = navView
            bottom_navigation.setOnItemSelectedListener { id ->
                when (id) {
                    R.id.navigation_classes -> replaceFragment(classesFragment)
                    R.id.navigation_favorite -> replaceFragment(favoriteFragment)
                    R.id.navigation_home -> replaceFragment(homeFragment)
                    R.id.navigation_task -> replaceFragment(taskFragment)

                }
            }
        }
    }
    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager
                .beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }
    }
}
