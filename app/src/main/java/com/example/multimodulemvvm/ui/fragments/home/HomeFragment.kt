package com.example.multimodulemvvm.ui.fragments.home

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.common.Resource
import com.example.multimodulemvvm.R
import com.example.multimodulemvvm.base.BaseRootFragment
import com.example.multimodulemvvm.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseRootFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    private val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        initListeners()
    }

    override fun initListeners() {
//        binding?.btn?.setOnClickListener {
//        }
    }

    override fun listenObservers() {
        viewModel.popularTvShowsLD.observe(viewLifecycleOwner) {
            when (it.status) {
                Resource.Status.SUCCESS -> {
                    val homeAdapter = HomeAdapter()
                    homeAdapter.tvShows = it.data
                    homeAdapter.onItemClick = {
                        navigateToTvShowDetail(it?.id)
                    }
                    binding?.rvHome?.adapter = homeAdapter
                    binding?.rvHome?.layoutManager = GridLayoutManager(requireContext(), 2)
                }
                Resource.Status.LOADING -> {
                    Toast.makeText(requireContext(), "loading", Toast.LENGTH_SHORT).show()
                }
                Resource.Status.ERROR -> {
                    Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun navigateToTvShowDetail(id: Int?) {
        id?.let {
            val bundle = Bundle().apply {
                putInt("id", id)
            }
            navigateChildFragment(R.id.action_mainFragment_to_detailFragment, bundle)
        }
    }
}
