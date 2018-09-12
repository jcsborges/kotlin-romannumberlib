package com.jcsb.romannumber.validator

class RomanCharSmallerPositionValidator : IStructureValidator {


    private var previousChar: Char = ' '

    override fun isValid(currentChar: Char): Boolean {

        var rtn = true

        if (previousChar == 'I')
            rtn = currentChar == 'I' || currentChar == 'V' || currentChar == 'X'
        else if (previousChar == 'X')
            rtn = currentChar == 'I' || currentChar == 'V' || currentChar == 'X' || currentChar == 'L' || currentChar == 'C'
        else if (previousChar == 'C')
            rtn = currentChar == 'I' || currentChar == 'V' || currentChar == 'X' || currentChar == 'L' || currentChar == 'C' || currentChar == 'D' || currentChar == 'M'


        previousChar = currentChar

        return rtn

    }
}