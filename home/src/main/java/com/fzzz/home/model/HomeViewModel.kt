package com.fzzz.home.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * description:
 * author: ShenChao
 * time: 2019-08-23
 * update:
 */
class HomeViewModel : ViewModel() {

    private val homeViewModel = MutableLiveData<String>()

    fun getContent(): LiveData<String> {
        return homeViewModel
    }

    fun setContent(content: String) {
        homeViewModel.value = content
    }

}