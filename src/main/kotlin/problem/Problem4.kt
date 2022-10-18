package problem
import EulerProblem
import java.math.BigDecimal

/**
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Problem4 : EulerProblem {

    override fun getResult(): BigDecimal {
        var palindrome = 0
        for (a in 100 .. 999) {
            for (b in 100 .. 999) {
                val num = a * b
                if(isPalindrome(num) && num > palindrome) {
                    palindrome = num
                }
            }
        }
        return palindrome.toBigDecimal()
    }

    fun isPalindrome(num: Int): Boolean {
        val str = num.toString();
        return str == str.reversed()
    }

}