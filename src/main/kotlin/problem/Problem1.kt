package problem

import EulerProblem
import java.math.BigDecimal

/**
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem1 : EulerProblem {

    override fun getResult(): BigDecimal {
        var sum = 0
        for (n in 3 until 1000 step 3) {
            sum += n
        }
        for (n in 5 until 1000 step 5) {
            sum += n
        }
        return sum.toBigDecimal()
    }
}