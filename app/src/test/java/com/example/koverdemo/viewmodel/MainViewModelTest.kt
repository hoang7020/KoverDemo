package com.example.koverdemo.viewmodel

import org.junit.Test
import org.junit.runner.RunWith

class MainViewModelTest {

    var vm = MainViewModel()

    @Test
    fun test() {
        vm.sum(5, 5)
    }
}