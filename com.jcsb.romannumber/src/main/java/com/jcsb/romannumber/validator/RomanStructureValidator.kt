package com.jcsb.romannumber.validator

class RomanStructureValidator {

    companion object {

        var validators = arrayListOf<IStructureValidator>()

        internal fun create() {

            validators = arrayListOf()

            validators.add(RomanCharValidator())
            validators.add(RomanCharCountValidator())
            validators.add(RomanCharPositionValidator())
            validators.add(RomanCharSmallerPositionValidator())

        }

        fun isValid(stringValue: String): Boolean {

            //if(validators == null || validators.count() == 0)
            create()

            stringValue.forEach { it: Char ->

                validators.forEach { itV: IStructureValidator ->

                    if (!itV.isValid(it))
                        return false

                }
            }

            return true

        }


    }
}