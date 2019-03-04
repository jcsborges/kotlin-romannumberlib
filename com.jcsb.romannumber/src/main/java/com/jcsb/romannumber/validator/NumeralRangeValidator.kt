package com.jcsb.romannumber.validator

class NumeralRangeValidator: INumeralValidator {
    override fun isValid(number: Int): Boolean {
        return number in 1..4999
    }
}