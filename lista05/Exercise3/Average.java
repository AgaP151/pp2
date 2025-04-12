import java.math.BigDecimal;

public class Average {

    public static BigDecimal calculateAverage(BigDecimal num1, BigDecimal num2, BigDecimal num3, int scale){
       // return BigDecimal.ZERO;
        BigDecimal sum = num1.add(num2).add(num3);
        BigDecimal average = sum.divide(BigDecimal.valueOf(3), scale, BigDecimal.ROUND_HALF_UP);
        return average;
    }
}
