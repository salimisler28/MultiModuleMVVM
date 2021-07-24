package com.example.multimodulemvvm.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint

abstract class BaseFragment<B>(
    @LayoutRes layoutRes: Int
) : Fragment(layoutRes) {
    protected var binding: B? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listenObservers()
    }

    abstract fun initListeners()
    abstract fun listenObservers()

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}