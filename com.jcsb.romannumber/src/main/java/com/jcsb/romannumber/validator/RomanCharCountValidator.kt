package com.jcsb.romannumber.validator


class RomanCharCountValidator : IStructureValidator {

    private var previousChar: String = ""
    private var count: Int = 0

    override fun isValid(currentChar: Char): Boolean {

        //verifica a estrutura - nao pode ter XXXX ou IIII
        if (previousChar == currentChar.toString())
            count++
        else
            count = 1

        previousChar = currentChar.toString()

        //V, L ou D nao podem duplicar, pq X, C e M representam o valor duplicado
        if ((previousChar == "V" || previousChar == "L" || previousChar == "D") && count > 1)
            return false
        else if (count > 3)
            return false


        return true
    }


}