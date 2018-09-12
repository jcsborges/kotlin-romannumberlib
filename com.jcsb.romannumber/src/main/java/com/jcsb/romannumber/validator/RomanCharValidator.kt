package com.jcsb.romannumber.validator

class RomanCharValidator : IStructureValidator {
    override fun isValid(currentChar: Char): Boolean {
        return RomanCharValidator.isValid((currentChar))
    }


    companion object {

        val validRoman = arrayOf('I', 'V', 'X', 'L', 'C', 'D', 'M')

        fun isValid(romanChar: Char): Boolean {


            //verifica se todos os caracteres sao validos
            val r = validRoman.filter { s -> s == romanChar }


            if (r.isEmpty())
                return false

            return true
        }
    }


}