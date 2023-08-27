package com.example.android.codelab.animation

/**
 * countdown from given number
 * count(4) - [4, 3, 2, 1, 0]
 */
fun main() {
    countDownNumbers(7)
}

fun countDownNumbers(input: Int) {
    input.downTo(0).forEach { num -> println(num) }
}
