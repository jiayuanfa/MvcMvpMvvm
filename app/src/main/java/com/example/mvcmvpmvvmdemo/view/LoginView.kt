package com.example.mvcmvpmvvmdemo.view

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.login_view.view.*

class LoginView(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    fun showData(data: List<String>) {
        mUserNameTv.setText(data[0])
        mPasswordTv.setText(data[1])
    }

}