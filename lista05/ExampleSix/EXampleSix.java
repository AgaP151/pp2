import java.math.BigDecimal;


    public class EXampleSix {
        public static void main(String[] args) {
            BigDecimal A = new BigDecimal(0.2f); // inicjowanie float
            BigDecimal B = new BigDecimal(0.2); // inicjowanie double
            BigDecimal C = new BigDecimal("0.2"); // inicjowanie String
            BigDecimal D = new BigDecimal("0.200"); // inicjowanie String
            BigDecimal E = new BigDecimal("0.3217"); // inicjowanie String
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
            System.out.println(D);
            System.out.println(E);
        }
    }