package com.fzzz.framework.common

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * description:
 * author: ShenChao
 * time: 2019-08-24
 * update:
 */
class MainModel : ViewModel() {
    private val homeViewModel = MutableLiveData<String>()
    private val mineViewModel = MutableLiveData<String>()

    fun getHomeContent(): LiveData<String> {
        return homeViewModel
    }

    fun setHomeContent(content: String) {
        homeViewModel.value = content
    }

    fun getMineContent(): LiveData<String> {
        return mineViewModel
    }

    fun setMineContent(content: String) {
        mineViewModel.value = content
    }

}