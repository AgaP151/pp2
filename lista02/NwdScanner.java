import java.util.Scanner;

public class NwdScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prośba o wprowadzenie dwóch liczb
            System.out.print("Podaj pierwszą liczbę: ");
            int a = scanner.nextInt();

            System.out.print("Podaj drugą liczbę: ");
            int b = scanner.nextInt();

            // Wywołanie metody obliczającej NWD
            int nwd = obliczNwd(a, b);
            System.out.println("NWD (" + a + ", " + b + ") = " + nwd);
        } catch (Exception e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        } finally {
            scanner.close();  // Zamknięcie zasobu scanner
        }
    }

    // Metoda obliczająca NWD
    public static int obliczNwd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

