package com.example.multimodulemvvm.ui.fragments.detail

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.multimodulemvvm.R
import com.example.multimodulemvvm.base.BaseFragment
import com.example.multimodulemvvm.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment: BaseFragment<FragmentDetailBinding>(R.layout.fragment_detail) {
    private val viewModel: DetailViewModel by viewModels()
    private val id by lazy {
        arguments?.let {
            it.getInt("id")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.id = this.id
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(), viewModel.id.toString(), Toast.LENGTH_SHORT).show()
    }

    override fun initListeners() {

    }

    override fun listenObservers() {

    }
}