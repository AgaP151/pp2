
import java.util.Scanner;

public class TestThree {

    public static void intData() {

        System.out.printf("\n--- Cechy typu int ---\n");
        System.out.printf("Integer.MIN_VALUE: %d (0x%08X)%n", Integer.MIN_VALUE, Integer.MIN_VALUE);
        System.out.printf("Integer.MAX_VALUE: %d (0x%08X)%n", Integer.MAX_VALUE, Integer.MAX_VALUE);
        System.out.printf("Integer.BYTES: %d%n", Integer.BYTES);
        System.out.printf("Integer.SIZE: %d%n", Integer.SIZE);
    }

    public static void floatData() {

        System.out.printf("\n--- Cechy typu float ---\n");
        System.out.printf("Float.MIN_VALUE: %e%n", Float.MIN_VALUE);
        System.out.printf("Float.MIN_NORMAL: %e%n", Float.MIN_NORMAL);
        System.out.printf("Float.MAX_VALUE: %e%n", Float.MAX_VALUE);
        System.out.printf("Float.BYTES: %d%n", Float.BYTES);
        System.out.printf("Float.SIZE: %d%n", Float.SIZE);
        System.out.printf("Float.MIN_EXPONENT: %d%n", Float.MIN_EXPONENT);
        System.out.printf("Float.MAX_EXPONENT: %d%n", Float.MAX_EXPONENT);
    }

    public static void main(String[] args) {

        MyDataThree.info();

        intData();
        floatData();


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nPodaj imię: ");
            String name = sc.nextLine();

            System.out.println("Podaj wzrost (m): ");
            float height = Float.parseFloat(sc.nextLine());
            System.out.println("Podaj masę (kg): ");
            int weight = Integer.parseInt(sc.nextLine());

            BMICalculator calc1 = new BMICalculator(name, weight, height);

            calc1.calculateBMI();

            System.out.print(calc1.getName() + " - Twoje BMI: ");
            System.out.format("%.2f\n", calc1.getBMI());
            System.out.println("Nadwaga: " + calc1.isOverweight());


            sc.close();
        } catch (Exception e) {
            System.out.println("Niepoprawne dane: " + e.getMessage());
        }
    }
}