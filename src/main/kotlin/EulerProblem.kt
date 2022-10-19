import java.math.BigDecimal

interface EulerProblem {
    fun getResult(): BigDecimal;

    fun getPrettyResult(): String {
        return getResult().toPlainString()
    }
}