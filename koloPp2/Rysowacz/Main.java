import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj szerokość prostokąta: ");
        int szerokość = scanner.nextInt();
        System.out.println("Podaj wysokość prostokąta: ");
        int wysokość = scanner.nextInt();

        Rysowacz rysowacz = new Rysowacz();
        rysowacz.rysuj(szerokość, wysokość);



    }

}
