package com.fzzz.mine.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * description:
 * author: ShenChao
 * time: 2019-08-23
 * update:
 */
class MineViewModel : ViewModel() {

    private val mineViewModel = MutableLiveData<String>()

    fun getContent(): LiveData<String> {
        return mineViewModel
    }

    fun setContent(content: String) {
        mineViewModel.value = content
    }

}