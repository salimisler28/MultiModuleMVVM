package com.example.multimodulemvvm.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.multimodulemvvm.R
import com.example.multimodulemvvm.ui.activities.main.MainActivity
import com.example.multimodulemvvm.ui.fragments.main.MainFragment
import dagger.hilt.android.AndroidEntryPoint

abstract class BaseRootFragment<B>(
    @LayoutRes layoutRes: Int
): BaseFragment<B>(layoutRes) {
    val navHost by lazy {
        (requireActivity() as MainActivity)
            .supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
    }

    val mainFragment by lazy {
        navHost
            .childFragmentManager
            .fragments[0]
    }

    fun navigateChildFragment(action: Int) {
        if (mainFragment is MainFragment) {
            mainFragment.findNavController().navigate(action)
        }
    }

    fun navigateChildFragment(action: Int, data: String?) {
        if (mainFragment is MainFragment) {
            val bundle = Bundle().apply {
                putString("data", data)
            }
            mainFragment.findNavController().navigate(action, bundle)
        }
    }
}