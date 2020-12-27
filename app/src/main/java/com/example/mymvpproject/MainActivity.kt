package com.example.mymvpproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mymvpproject.mvp.presenter.Presenter
import com.example.mymvpproject.mvp.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

private const val FIRST_ELEMENT = 0
private const val SECOND_ELEMENT = 1
private const val THIRD_ELEMENT = 2

class MainActivity : AppCompatActivity(), MainView {

    private val counters = mutableListOf(0, 0, 0)
    private lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = Presenter(this)

        btn_counter1.text = counters[FIRST_ELEMENT].toString()
        btn_counter2.text = counters[SECOND_ELEMENT].toString()
        btn_counter3.text = counters[THIRD_ELEMENT].toString()

        btn_counter1.setOnClickListener(View.OnClickListener {
            presenter.counterClickOne()
        })
        btn_counter2.setOnClickListener(View.OnClickListener {
            presenter.counterClickTwo()
        })
        btn_counter3.setOnClickListener(View.OnClickListener {
            presenter.counterClickThree()
        })
    }

    override fun setButtonOneText(text: String) {
        btn_counter1.text = text
    }

    override fun setButtonTwoText(text: String) {
        btn_counter2.text = text
    }

    override fun setButtonThreeText(text: String) {
        btn_counter3.text = text
    }
}
