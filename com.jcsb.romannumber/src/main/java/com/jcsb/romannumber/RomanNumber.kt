package com.jcsb.romannumber

import com.jcsb.romannumber.converter.*
import com.jcsb.romannumber.validator.RomanStructureValidator

class RomanNumber {

    var stringValue: String = ""
    var numericValue: Int = 0


    constructor(stringValue: String) {
        if (!RomanStructureValidator.isValid(stringValue))
            return

        this.stringValue = stringValue

        this.numericValue = RomanStringToNumConverter.convert(stringValue)
    }

    constructor(numericValue: Int) {
        this.numericValue = numericValue

        this.stringValue = RomanNumToStrConverter.convert(numericValue)

    }

    operator fun plus(increment: RomanNumber): RomanNumber {
        return RomanNumber(this.numericValue + increment.numericValue)
    }

    operator fun minus(decrement: RomanNumber): RomanNumber {
        return RomanNumber(this.numericValue - decrement.numericValue)
    }

    operator fun times(times: RomanNumber): RomanNumber {
        return RomanNumber(this.numericValue * times.numericValue)
    }

    operator fun div(div: RomanNumber): RomanDivResult {
        val q = this.numericValue / div.numericValue
        val r = this.numericValue % div.numericValue

        return RomanDivResult(RomanNumber(q), RomanNumber(r))

    }
}