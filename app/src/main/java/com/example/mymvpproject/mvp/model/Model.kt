package com.example.mymvpproject.mvp.model

class Model {
    private val counters = mutableListOf(0, 0, 0)

    fun getCurrent(index: Int) = counters[index]

    fun set(index: Int, value: Int) {
        counters[index] = value
    }

    fun next(index: Int): Int {
        val nextValue = ++counters[index]
        counters[index] = nextValue
        return nextValue
    }
}