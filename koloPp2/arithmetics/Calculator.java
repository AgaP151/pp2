import java.lang.System;
public class Calculator {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Błąd! POdaj dwie liczby");
            return;
        }
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);

        System.out.printf("Liczby: %.2f, %.2f\n", a, b);


    System.out.printf("Suma: %.2f\n ", (a + b));
    System.out.printf("Różnica: %.2f\n", (a - b));
    System.out.printf("Iloczyn: %.2f\n", (a * b));
    System.out.println(b != 0 ? "Iloraz: " + (a / b) : "Błąd! nie można dzielić przez 0!");
    System.out.println(a < 0 || b < 0 ? "Błąd! Nie można obliczyć pierwiastka z liczby ujemnej" :
            "Pierwiastek liczby a i b: " + Math.sqrt(a) + " i " + +Math.sqrt(b));
    System.out.printf("Potęgowanie: %.2f, %.2f\n", Math.pow(a, 2),  Math.pow(b, 2));

}catch (Exception e){
    System.out.println("Błąd! Podaj poprawne liczby");
}
    }
}
