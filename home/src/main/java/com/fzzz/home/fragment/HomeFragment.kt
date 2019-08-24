package com.fzzz.mykotlindemo.ui.home

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fzzz.framework.base.BaseFragment
import com.fzzz.framework.common.MainModel
import com.fzzz.home.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment(override val layoutID: Int = R.layout.fragment_home) : BaseFragment() {

    private lateinit var homeViewModel: MainModel

    override fun initData() {
        homeViewModel = ViewModelProviders.of(this).get(MainModel::class.java)
        homeViewModel.setHomeContent("home")
    }

    override fun initView() {
        homeViewModel.getHomeContent().observe(this, Observer { text_home.text = it })
    }
}