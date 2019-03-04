package com.jcsb.romannumber.validator

class RomanCharSmallerPositionValidator : IStructureValidator {


    private var previousChar: Char = ' '

    override fun isValid(currentChar: Char): Boolean {

        var rtn = true

        when (previousChar) {
            'I' -> rtn = currentChar == 'I' || currentChar == 'V' || currentChar == 'X'
            'X' -> rtn = currentChar == 'I' || currentChar == 'V' || currentChar == 'X' || currentChar == 'L' || currentChar == 'C'
            'C' -> rtn = currentChar == 'I' || currentChar == 'V' || currentChar == 'X' || currentChar == 'L' || currentChar == 'C' || currentChar == 'D' || currentChar == 'M'
        }


        previousChar = currentChar

        return rtn

    }
}