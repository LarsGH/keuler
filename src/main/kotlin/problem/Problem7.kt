package problem

import EulerProblem
import java.math.BigDecimal

/**
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */
class Problem7 : EulerProblem {

    var primes : MutableList<Long> = mutableListOf(2,3,5,7,11,13)

    override fun getResult(): BigDecimal {
        while (primes.size < 10_001) {
            val lastPrime = primes.last()
            var next = lastPrime +2
            while(!isPrime(next)) {
                next +=2
            }
            primes.add(next)
        }
        return primes.last().toBigDecimal()
    }

    private fun isPrime(num: Long): Boolean {
        for(prime in primes) {
            if(num % prime == 0L) {
                return false
            }
        }
        return true
    }


}