package com.example.mvcmvpmvvmdemo.mvp

import com.example.mvcmvpmvvmdemo.data.DataCenter

/**
 * 视图层交互
 */
class Presenter(private val view: IView) {

    fun getData() {
        view.showData(DataCenter.getData())
    }

    interface IView {
       fun showData(data: List<String>)
    }
}