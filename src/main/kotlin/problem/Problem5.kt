package problem

import EulerProblem
import java.math.BigDecimal

/**
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
class Problem5 : EulerProblem {

    override fun getResult(): BigDecimal {
        for(num in 20 .. Int.MAX_VALUE step 2) {
            if(isDivisibleByAllNumbersTo20(num)) {
                return num.toBigDecimal()
            }
        }
        return Int.MIN_VALUE.toBigDecimal()
    }

    fun isDivisibleByAllNumbersTo20(num: Int): Boolean {
        for(i in 1 .. 20) {
            if (num % i != 0) {
                return false
            }
        }
        return true
    }

}