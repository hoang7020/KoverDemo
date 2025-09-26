package com.example.koverdemo.viewmodel

class MainViewModel {

    fun sum(a: Int?, b: Int?): Int {
        var tempA = 0
        var tempB = 0
        a?.let {
            tempA = a
        }
        b?.let {
            tempB = b
        }
        return tempA + tempB
    }

}