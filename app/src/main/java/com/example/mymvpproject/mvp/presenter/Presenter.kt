package com.example.mymvpproject.mvp.presenter

import com.example.mymvpproject.mvp.model.Model
import com.example.mymvpproject.mvp.view.MainView

private const val FIRST_ELEMENT = 0
private const val SECOND_ELEMENT = 1
private const val THIRD_ELEMENT = 2

class Presenter(private val mainView: MainView) {
    private val model: Model = Model()

    fun counterClickOne() {
        val nextValue = model.next(FIRST_ELEMENT)
        mainView.setButtonOneText(nextValue.toString())
    }

    fun counterClickTwo() {
        val nextValue = model.next(SECOND_ELEMENT)
        mainView.setButtonTwoText(nextValue.toString())
    }

    fun counterClickThree() {
        val nextValue = model.next(THIRD_ELEMENT)
        mainView.setButtonThreeText(nextValue.toString())
    }

}