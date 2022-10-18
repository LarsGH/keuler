package problem

import EulerProblem
import java.math.BigDecimal

/**
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
class Problem3 : EulerProblem {

    private var primes: MutableList<Long> = mutableListOf(2,3);

    fun isPrime(num: Long): Boolean {
        for (prime in primes) {
            if (num % prime == 0L) {
                return false
            }
        }

        for (maybeNewPrime in primes.last() .. num step 2) {
            val isDevisableByPrime = primes.any { maybeNewPrime % it == 0L }
            if(!isDevisableByPrime) {
                primes.add(maybeNewPrime)
                if (num % maybeNewPrime == 0L) {
                    return false
                }
            }
        }
        return true
    }

    override fun getResult(): BigDecimal {
        var rest = 600851475143L

        while (!isPrime(rest)) {
            for (prime in primes) {
                if(rest % prime == 0L) {
                    rest /= prime
                }
            }
        }

        return primes.last().toBigDecimal()
    }
}