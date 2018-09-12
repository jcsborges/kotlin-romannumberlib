package com.jcsb.romannumber.converter

class RomanCharToNumConverter {

    private data class RomanNumberData(val romanChar: Char, val romanNumber: Int)


    companion object {

        private val validRomanNumbers = arrayOf(
                RomanNumberData('I', 1),
                RomanNumberData('V', 5),
                RomanNumberData('X', 10),
                RomanNumberData('L', 50),
                RomanNumberData('C', 100),
                RomanNumberData('D', 500),
                RomanNumberData('M', 1000)
        )

        fun convert(romanChar: Char): Int {

            val result = validRomanNumbers.find { c -> c.romanChar == romanChar }


            if (result != null)
                return result.romanNumber
            else
                return 0

        }
    }
}