package problem

import EulerProblem
import java.math.BigDecimal
import java.util.stream.IntStream
import kotlin.math.pow

/**
The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is,

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
class Problem6 : EulerProblem {
    override fun getResult(): BigDecimal {
        val sumOfSquares = (1..100).sumOf { n -> n.toDouble().pow(2) }
        val squareOfSum = (1..100).sum().toDouble().pow(2)
        val result = squareOfSum - sumOfSquares
        return result.toBigDecimal()
    }
}