package com.example.mvcmvpmvvmdemo.mvvm

class StringAttr {

    var value: String? = null

    set(value) {
        // 先给内部设置
        field = value
        // 通知外部发生改变
        onChangeListener?.onChange(value)
    }

    var onChangeListener: OnChangeListener? = null

    interface OnChangeListener{
       fun onChange(newValue: String?)
    }
}