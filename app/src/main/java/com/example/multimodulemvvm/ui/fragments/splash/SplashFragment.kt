package com.example.multimodulemvvm.ui.fragments.splash

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.common.Resource
import com.example.multimodulemvvm.R
import com.example.multimodulemvvm.base.BaseFragment
import com.example.multimodulemvvm.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SplashFragment : BaseFragment<FragmentSplashBinding>(R.layout.fragment_splash) {
    private val viewModel: SplashViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSplashBinding.bind(view)
    }

    override fun initListeners() {

    }

    override fun listenObservers() {
        viewModel.data.observe(viewLifecycleOwner) {
            when (it.status) {
                Resource.Status.SUCCESS -> {
                    findNavController()
                        .navigate(R.id.action_splashFragment_to_mainFragment)
                }

                else -> {
                    binding?.txTime?.text = it.data.toString()
                }
            }
        }    }
}