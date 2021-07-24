package com.example.multimodulemvvm.ui.fragments.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.common.Resource
import com.example.data.network.request.GetPopularTvShowsRequest
import com.example.data.network.response.GetPopularTvShowsResponse
import com.example.domain.model.TvShow
import com.example.domain.usacase.GetPopularTvShowsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getPopularTvShowsUseCase: GetPopularTvShowsUseCase
): ViewModel() {
    val popularTvShowsLD = MutableLiveData<Resource<List<TvShow>?>>()

    init {
        viewModelScope.launch {
            getPopularTvShowsUseCase
                .getPopularTvShows(GetPopularTvShowsRequest(page = 1))
                .collect {
                    popularTvShowsLD.postValue(it)
                }
        }
    }
}