import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
try{
    System.out.println("Podaj trzy liczby oddzielone spacją: ");
    String input = scanner.nextLine();

    String[] parts = input.split(" ");
    BigDecimal num1 = new BigDecimal(parts[0]);
    BigDecimal num2 = new BigDecimal(parts[1]);
    BigDecimal num3 = new BigDecimal(parts[2]);

    System.out.println("Podaj oczekiwana liczbe miejsc po przecinku: ");
    int scale = scanner.nextInt();

    BigDecimal result = Average.calculateAverage(num1, num2, num3, scale);

    System.out.println("Średnia arytmetyczna wynosi: " + result);

    } catch (Exception e){
    System.out.println("Nieporawny format! Podaj 3 liczby oddzielone spacją");
    }

    }
}
