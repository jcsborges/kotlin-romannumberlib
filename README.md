# kotlin-romannumberlib
Lib for do operations with roman numbers using Kotlin programming language

This lib is for study purpose only. Feel free to contribute.

The main class is <code> com.jcsb.romannumber.RomanNumber </code>, you can pass the Roman number as string and the class will translate to number, or you can pass a number and the class will translate to Roman string.

Ex.:

<code>
val rn = RomanNumber(10)

println(rn.stringValue) // result will be "X"
</code>

Or, you can pass the Roman Number

<code>
val rn = RomanNumber("X")

println(rn.numericValue.toString()) // result will be "10"
</code>

You can do operation to

<code>
val rn = RomanNumber("X") - RomanNumber("II")

println(rn.stringValue) // result will be "VIII"
</code>

Cool huh?
