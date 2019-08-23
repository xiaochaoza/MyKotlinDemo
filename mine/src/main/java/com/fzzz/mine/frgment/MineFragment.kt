package com.fzzz.mykotlindemo.ui.mine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fzzz.mine.R
import com.fzzz.mine.model.MineViewModel

class MineFragment : Fragment() {

    private lateinit var mainViewModel: MineViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mainViewModel = ViewModelProviders.of(this).get(MineViewModel::class.java)
        mainViewModel.setContent("mine")
        val root = inflater.inflate(R.layout.fragment_mine, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        mainViewModel.getContent().observe(this, Observer { textView.text = it })
        return root
    }
}