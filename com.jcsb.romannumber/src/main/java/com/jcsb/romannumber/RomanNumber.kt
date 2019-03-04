package com.jcsb.romannumber

import com.jcsb.romannumber.converter.*
import com.jcsb.romannumber.validator.NumeralRangeValidator
import com.jcsb.romannumber.validator.RomanStructureValidator
import com.jcsb.romannumber.exceptions.*
import java.lang.Exception


class RomanNumber {

    var stringValue: String = ""
    var numericValue: Int = 0

    private var isValidRoman: Boolean = false
    private var exception: Exception? = null

    constructor(stringValue: String) {
        if (!RomanStructureValidator.isValid(stringValue))
            return

        this.stringValue = stringValue

        this.numericValue = RomanStringToNumConverter.convert(stringValue)
    }

    constructor(numericValue: Int) {
        val validator = NumeralRangeValidator()

        if (!validator.isValid(numericValue)) {
            this.exception = InvalidNumberToRomanException("O número deve ser entre 1 e 4999")
            this.isValidRoman = false
        } else
            this.isValidRoman = true

        this.numericValue = numericValue

        if(isValidRoman)
            this.stringValue = RomanNumToStrConverter.convert(numericValue)

    }

    operator fun plus(increment: RomanNumber): RomanNumber {
        return RomanNumber(this.numericValue + increment.numericValue)

    }

    operator fun minus(decrement: RomanNumber): RomanNumber? {
        return RomanNumber(this.numericValue - decrement.numericValue)

    }

    operator fun times(times: RomanNumber): RomanNumber? {
        return RomanNumber(this.numericValue * times.numericValue)

    }

    operator fun div(div: RomanNumber): RomanDivResult? {
        val q = this.numericValue / div.numericValue
        val r = this.numericValue % div.numericValue

        val result: RomanNumber?
        val quotient: RomanNumber?

        result = RomanNumber(r)

        quotient = RomanNumber(q)

        return RomanDivResult(quotient, result)

    }
}