import java.math.BigInteger;
import java.util.Scanner;


class Test5 {

    public static void main(String[] args) {
        int n;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("n = ");
            n = sc.nextInt();
            sc.close();
            System.out.printf("%d! = %d\n", n, BigInt.factorial(n));
        } catch (Exception e){
            System.err.println("Nieoczekiwany błąd i koniec demo!");
            System.exit(0);
        }
        var b1 = BigInteger.valueOf(123_456_789);
        var b2 = new BigInteger("123456789");
        var b3 = new BigInteger("123456788");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        int result;
        result = BigInt.compBigInt(b1, b2);
        System.out.println("porównanie b1-b2: " + result);
        result = BigInt.compBigInt(b2, b3);
        System.out.println("porównanie b2-b3: " + result);

        //demo dzielenia i reszty
        BigInteger[] barr = new BigInteger("12345678901234567890").divideAndRemainder(BigInteger.valueOf(1009));
        System.out.println("iloraz:\t" + barr[0]);
        System.out.println("reszta:\t" + barr[1]);
        //demo NWD
        var b4 = new BigInteger("012345678901234567890").gcd(BigInteger.valueOf(1008));
        //demo liczba pierwsza
        var b5 = new BigInteger("12345678901234567890").nextProbablePrime();
        System.out.println("prime?:\t" + b5);
    }
}
