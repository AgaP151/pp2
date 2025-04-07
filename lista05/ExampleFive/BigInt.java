import java.math.BigInteger;

public class BigInt {
static BigInteger factorial(int n){
    BigInteger f = BigInteger.TWO;

    for(int i = 3; i <= n; i++)
        f= f.multiply(BigInteger.valueOf(i));
    return f;
}
// zwraca wynik porównania

    static int compBigInt(BigInteger bint1, BigInteger bint2){
    int res = bint1.compareTo(bint2);
    return res;
    }
}
