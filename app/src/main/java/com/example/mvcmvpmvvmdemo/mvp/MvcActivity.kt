package com.example.mvcmvpmvvmdemo.mvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvcmvpmvvmdemo.R
import kotlinx.android.synthetic.main.login_view.*

class MvcActivity : AppCompatActivity(), Presenter.IView {

    private val mPresenter by lazy {
        Presenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter.getData()
    }

    override fun showData(data: List<String>) {
        mLoginView.showData(data)
    }
}