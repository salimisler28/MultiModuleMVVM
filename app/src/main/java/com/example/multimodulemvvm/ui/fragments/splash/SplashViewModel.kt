package com.example.multimodulemvvm.ui.fragments.splash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.common.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
): ViewModel() {
    val data = MutableLiveData<Resource<Int>>()

    init {
        val timer = (0..2)
            .asSequence()
            .asFlow()
            .onEach {
                delay(1000)
            }

        viewModelScope.launch {
            timer.collect {
                if (it == 2) {
                    data.postValue(Resource.success(data = it))
                } else {
                    data.postValue(Resource.loading(data = it))
                }
            }
        }
    }
}