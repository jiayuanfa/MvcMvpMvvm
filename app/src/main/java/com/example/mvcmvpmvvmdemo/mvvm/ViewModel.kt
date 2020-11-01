package com.example.mvcmvpmvvmdemo.mvvm

import android.view.View
import android.widget.EditText
import com.example.mvcmvpmvvmdemo.data.DataCenter

class ViewModel(val data1View: EditText, val data2View: EditText) {

    var data1: StringAttr = StringAttr()
    var data2: StringAttr = StringAttr()

    init {
        ViewBinder.bind(data1View, data1)
        ViewBinder.bind(data2View, data2)
    }

    fun init() {
        // 取数据
        val data = DataCenter.getData()
        data1.value = data[0]
        data2.value = data[1]
    }
}