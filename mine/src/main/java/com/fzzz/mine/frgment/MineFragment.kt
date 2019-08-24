package com.fzzz.mykotlindemo.ui.mine

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fzzz.framework.base.BaseFragment
import com.fzzz.framework.common.MainModel
import com.fzzz.mine.R
import kotlinx.android.synthetic.main.fragment_mine.*

class MineFragment(override val layoutID: Int = R.layout.fragment_mine) : BaseFragment() {

    private lateinit var mainViewModel: MainModel

    override fun initData() {
        mainViewModel = ViewModelProviders.of(this).get(MainModel::class.java)
        mainViewModel.setMineContent("mine")
    }

    override fun initView() {
        mainViewModel.getMineContent().observe(this, Observer { text_mine.text = it })
    }
}