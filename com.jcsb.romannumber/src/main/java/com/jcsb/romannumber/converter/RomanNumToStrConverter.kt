package com.jcsb.romannumber.converter

class RomanNumToStrConverter {

    companion object {


        fun convert(num: Int): String {

            var nAux = num
            var result = ""

            while (nAux > 0) {

                when {
                    nAux >= 1000 -> {
                        result += "M"
                        nAux -= 1000
                    }
                    nAux >= 500 -> {
                        result += "D"
                        nAux -= 500
                    }
                    nAux >= 100 -> {
                        result += "C"
                        nAux -= 100
                    }
                    nAux >= 50 -> {
                        result += "L"
                        nAux -= 50
                    }
                    nAux >= 10 -> {
                        result += "X"
                        nAux -= 10
                    }
                    nAux >= 5 -> {
                        result += "V"
                        nAux -= 5
                    }
                    nAux >= 1 -> {
                        result += "I"
                        nAux -= 1
                    }
                    else -> nAux = -1
                }

            }

            result = result.replace("IIII", "IV")
            result = result.replace("VIV", "IX")
            result = result.replace("XXXX", "XL")
            result = result.replace("LXL", "XC")
            result = result.replace("CCCC", "CD")
            result = result.replace("DCD", "CM")


            return result

        }
    }
}