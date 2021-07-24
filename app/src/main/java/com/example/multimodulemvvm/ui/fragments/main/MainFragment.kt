package com.example.multimodulemvvm.ui.fragments.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.multimodulemvvm.R
import com.example.multimodulemvvm.base.BaseFragment
import com.example.multimodulemvvm.databinding.FragmentMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main) {
    lateinit var navController: NavController
    lateinit var navHostFragment: NavHostFragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        navHostFragment = childFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        navController = navHostFragment.navController

        val bottomNavigationView = binding?.bottomNavigationView as BottomNavigationView
        bottomNavigationView.setupWithNavController(navController)
    }

    override fun initListeners() {

    }

    override fun listenObservers() {
    }
}