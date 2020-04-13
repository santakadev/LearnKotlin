package dev.santaka

import java.lang.IllegalArgumentException

data class Distance(val value: Double) {
    init {
        if (value < 0.0) {
            throw IllegalArgumentException("Distance must have positive value, but $value given")
        }
    }
}