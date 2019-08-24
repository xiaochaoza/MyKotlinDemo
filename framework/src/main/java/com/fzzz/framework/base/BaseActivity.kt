package com.fzzz.framework.base

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

/**
 * description:
 * author: ShenChao
 * time: 2019-08-23
 * update:
 */
abstract class BaseActivity : AppCompatActivity() {
    private var showBack = true

    abstract val layoutID: Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        beforeSetContentView()
        setContentView(layoutID)
        if (showBack) {
            //设置左上角返回键
            if (null == supportActionBar) {
                return
            }
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        }
        initData()
        initView()
        initEvent()
    }

    open fun initEvent() {

    }

    open fun initView() {

    }

    open fun initData() {

    }

    fun beforeSetContentView() {

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //左上角返回键的id：android.R.id.home
        if (android.R.id.home == item.itemId) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    fun setShowBack(showBack: Boolean) {
        this.showBack = showBack
    }
}
