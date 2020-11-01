package com.example.mvcmvpmvvmdemo.mvvm

import android.text.TextUtils
import android.widget.EditText
import androidx.core.widget.doAfterTextChanged

class ViewBinder {

    companion object {

        /**
         * 双向绑定
         * 防止循环通知
         * 添加额外判断，不一样再改变
         */
        fun bind(editText: EditText, stringAttr: StringAttr) {
            // 绑定就是监听
            editText.doAfterTextChanged {
                if (!TextUtils.equals(stringAttr.value, it)) {
                    stringAttr.value = it.toString()
                    println("表现数据通知内存了")
                }
            }
            stringAttr.onChangeListener = object : StringAttr.OnChangeListener {
                override fun onChange(newValue: String?) {
                    if (!TextUtils.equals(newValue, editText.text)) {
                        editText.setText(newValue)
                        println("内存通知表现数据了")
                    }
                }
            }
        }
    }
}