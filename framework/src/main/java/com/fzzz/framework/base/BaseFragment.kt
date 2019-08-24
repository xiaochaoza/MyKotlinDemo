package com.fzzz.framework.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.fzzz.framework.R
import com.fzzz.framework.utils.ScreenUtil
import kotlinx.android.synthetic.main.fragment_base.*

/**
 * description:
 * author: ShenChao
 * time: 2019-08-24
 * update:
 */
abstract class BaseFragment : Fragment() {
    abstract val layoutID: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initData()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //1.设置当前视图
        val layoutID: Int = layoutID
        val view = inflater.inflate(R.layout.fragment_base, container, false)
        init(layoutID, view)
        initView()
        initEvent()
        return view
    }

    open fun initEvent() {

    }

    open fun initView() {

    }

    open fun initData() {

    }

    private fun init(layoutID: Int, view: View) {
        val statusView = view.findViewById<View>(R.id.status_view)
        statusView.layoutParams.height = ScreenUtil.getStatusBarHeight(activity!!)

        val mainContent = view.findViewById<FrameLayout>(R.id.fragment_content)
        val content = View.inflate(activity, layoutID, null)
        mainContent.addView(content)
    }

}
