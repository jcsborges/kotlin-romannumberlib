package com.jcsb.romannumber.converter

class RomanStringToNumConverter {

    companion object {
        fun convert(romanStr: String): Int {
            val arr = romanStr.toCharArray()

            val arrN = arr.map { it: Char -> RomanCharToNumConverter.convert(it) }

            var previous = -1
            var result = 0

            arrN.forEach { it: Int ->

                if (previous > 0) {
                    if (previous < it)
                        result -= previous
                    else
                        result += previous
                }

                previous = it
            }

            result += previous

            return result
        }
    }
}