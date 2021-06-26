package com.example.multimodulemvvm.base

import androidx.annotation.LayoutRes
import androidx.annotation.NavigationRes
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.multimodulemvvm.R
import com.example.multimodulemvvm.ui.activities.main.MainActivity
import com.example.multimodulemvvm.ui.fragments.main.MainFragment

abstract class BaseRootFragment<B>(
    @LayoutRes layoutRes: Int
): BaseFragment<B>(layoutRes) {
    fun navigateChildFragment(action: Int) {
        val navhost = (requireActivity() as MainActivity).supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val mainFragment = navhost.childFragmentManager.fragments[0]
        mainFragment.findNavController()
            .navigate(action)
    }
}