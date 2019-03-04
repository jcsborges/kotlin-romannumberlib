package com.jcsb.romannumber.validator

import com.jcsb.romannumber.converter.RomanCharToNumConverter

class RomanCharPositionValidator : IStructureValidator {

    private var previousNum: Int = 999999
    private var countSmaller: Int = 0
    private var countEqual: Int = 0

    override fun isValid(currentChar: Char): Boolean {
        //verifica se tem mais de 1 caractere de menor valor a esquerda de um valor maior

        val currentNum = RomanCharToNumConverter.convert(currentChar)

        when {
            previousNum < currentNum -> countSmaller++
            previousNum == currentNum -> countEqual++
            else -> {
                countSmaller = 0
                countEqual = 0
            }
        }

        val aux = countSmaller + countEqual

        if (aux > 1 && countSmaller > 0) {
            return false
        }

        previousNum = currentNum



        return true

    }


}