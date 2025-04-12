import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj miesiąc i rok: ");
        String input = scanner.nextLine();

        String[] parts = input.split("/");
        try {
            int month = Integer.parseInt(parts[0]);
            int year = Integer.parseInt(parts[1]);

            if(month < 1 || month > 12){
                System.out.println("Niepoprawne dane. Numer miesiąca poza zakresem.");

                return;
            }
            if(year < 1900 || year > 2100){
                System.out.println("Niepoprawne dane.");
                return;
            }
            Checker.countDays1(month, year);
            Checker.countDays2(month, year);

        } catch(Exception e){
            System.out.println("Niepoprawne dane. Użyj formatu miesiąc/rok.");
        }

    }
}
