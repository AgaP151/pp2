import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingModeTest {
    public static void main(String[] args) {
        BigDecimal A = new BigDecimal("0.3");
        BigDecimal B = new BigDecimal("0.2");

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
        System.out.println(A.divide(B));
        System.out.println((A.divide(B, 2, RoundingMode.HALF_UP)));
        System.out.println((A.divide(B, 3, RoundingMode.HALF_UP)));
    }
}
