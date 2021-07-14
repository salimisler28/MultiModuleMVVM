package com.example.multimodulemvvm.base

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint

abstract class BaseFragment<B>(
    @LayoutRes layoutRes: Int
) : Fragment(layoutRes) {
    protected var binding: B? = null
}