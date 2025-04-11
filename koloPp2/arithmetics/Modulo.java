import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

          while (number != 0) {
              try {
              System.out.println("Podaj liczbę (wpisz 0, aby zakończyć): ");
              number = scanner.nextInt();
          if(number == 0){
              System.out.println("Program zakończony");
              break;
          }
          if( number % 2 == 0 && number % 3 == 0 ){
              System.out.println("Liczba jest podzielna przez 2 i 3");
          } else if(number % 2 == 0){
              System.out.println("Liczba jest podzielna przez 2");
          } else if( number % 3 == 0){
              System.out.println("Liczba jest podzielna przez 3");
          } else {
              System.out.println("Liczba nie jest podzielna ani przez 3 ani przez 2");
          }

      }catch (Exception e){
          System.err.println("Błąd! Wprowadź poprawna liczbę!");
          scanner.nextLine();

      }}
        scanner.close();
    }

}
