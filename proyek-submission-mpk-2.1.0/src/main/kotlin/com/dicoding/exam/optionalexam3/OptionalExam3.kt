package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val regex = "\\d+".toRegex()
    val match = regex.find(str)
    return if (match != null) {
        val number = match.value.toInt()
        val resultNumber = number * int
        str.replace(match.value, resultNumber.toString())
    } else {
        str + int
    }
}
