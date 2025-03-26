public class NwdArgumenty {
    public static void main(String[] args) {
        try {
            // Sprawdzamy, czy są odpowiednie argumenty
            if (args.length != 2) {
                throw new IllegalArgumentException("Podaj dwie liczby jako argumenty.");
            }

            // Parsujemy argumenty na liczby całkowite
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            // Wywołanie metody obliczającej NWD
            int nwd = obliczNwd(a, b);
            System.out.println("NWD (" + a + ", " + b + ") = " + nwd);
        } catch (NumberFormatException e) {
            System.out.println("Błąd: Podano nieprawidłowe liczby. " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
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

