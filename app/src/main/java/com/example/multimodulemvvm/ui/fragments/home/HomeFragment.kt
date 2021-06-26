package com.example.multimodulemvvm.ui.fragments.home

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.multimodulemvvm.R
import com.example.multimodulemvvm.base.BaseRootFragment
import com.example.multimodulemvvm.databinding.FragmentHomeBinding
import com.example.multimodulemvvm.ui.activities.main.MainActivity
import com.example.multimodulemvvm.ui.fragments.main.MainFragment

class HomeFragment : BaseRootFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        binding?.btn?.setOnClickListener {
            navigateChildFragment(R.id.action_mainFragment_to_detailFragment)
        }
    }

}
