package com.jcsb.romannumber.converter

class RomanNumToStrConverter {

    companion object {


        fun convert(num: Int): String {

            var nAux = num
            var result = ""

            while (nAux > 0) {

                if (nAux >= 1000) {
                    result += "M"
                    nAux -= 1000
                } else if (nAux >= 500) {
                    result += "D"
                    nAux -= 500
                } else if (nAux >= 100) {
                    result += "C"
                    nAux -= 100
                } else if (nAux >= 50) {
                    result += "L"
                    nAux -= 50
                } else if (nAux >= 10) {
                    result += "X"
                    nAux -= 10
                } else if (nAux >= 5) {
                    result += "V"
                    nAux -= 5
                } else if (nAux >= 1) {
                    result += "I"
                    nAux -= 1
                } else {
                    nAux = -1
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