package com.example.tugas4

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CallViewModel : ViewModel() {

    var count = mutableIntStateOf(0)
        private set

    fun up() {
        count.intValue++
    }

    fun down() {
        count.intValue--
    }

    fun reset() {
        count.intValue = 0
    }
}