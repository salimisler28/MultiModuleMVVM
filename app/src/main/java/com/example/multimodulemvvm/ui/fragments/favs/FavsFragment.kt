package com.example.multimodulemvvm.ui.fragments.favs

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.multimodulemvvm.R
import com.example.multimodulemvvm.base.BaseRootFragment
import com.example.multimodulemvvm.databinding.FragmentFavsBinding
import com.example.multimodulemvvm.ui.activities.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavsFragment : BaseRootFragment<FragmentFavsBinding>(R.layout.fragment_favs) {
    private val viewModel: FavsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFavsBinding.bind(view)
        initListeners()
    }

    override fun initListeners() {
        binding?.textView?.setOnClickListener {
            navigateChildFragment(R.id.action_mainFragment_to_detailFragment)
        }
    }

    override fun listenObservers() {

    }

}