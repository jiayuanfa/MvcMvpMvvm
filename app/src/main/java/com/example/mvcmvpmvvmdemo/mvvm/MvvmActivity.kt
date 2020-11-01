package com.example.mvcmvpmvvmdemo.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvcmvpmvvmdemo.R
import kotlinx.android.synthetic.main.login_view.*

class MvvmActivity : AppCompatActivity() {

    private val mViewModel: ViewModel by lazy {
        ViewModel(mUserNameTv, mPasswordTv)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel.init()
    }
}