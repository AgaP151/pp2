import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;

public class Okrąglenie {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("3");

        BigDecimal result = a.divide(b, new MathContext(6, RoundingMode.DOWN));
        BigDecimal result0 = a.divide(b,new MathContext(1, RoundingMode.UP));
        BigDecimal result1 = a.divide(b, MathContext.DECIMAL32);
        BigDecimal result2 = a.divide(b, MathContext.DECIMAL64);
        BigDecimal result3 = a.divide(b, MathContext.DECIMAL128);

        System.out.println(result);
        System.out.println(result0);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        try{
            var result4 = a.divide(b);
            System.out.println(result4);
        } catch (Exception e) {
            System.out.println("Iloraz a/b nie jest" + "ułamkiem dziesiętnym skończonym");
        }
    }

}
