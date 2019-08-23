package com.fzzz.framework.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife

/**
 * description:
 * author: ShenChao
 * time: 2019-08-23
 * update:
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutID())
        ButterKnife.bind(this)
    }

    abstract fun getLayoutID(): Int
}