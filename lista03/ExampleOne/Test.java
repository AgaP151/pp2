import java.util.Scanner;

    public class Test {
        public static void main(String[] args) {
            MyData.info();

            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("\nPodaj imię: ");
                String name = sc.nextLine();

                System.out.println("Podajc wzrost(m): ");
                float height = Float.parseFloat(sc.nextLine());
                System.out.println("Podaj masę(kg): ");
                int weight = Integer.parseInt(sc.nextLine());

                BMICalculator calc1 = new BMICalculator(name, weight, height);

                calc1.calculateBMI();

                System.out.print(calc1.getName() + "-twoje BMI: ");
                System.out.format("%.2f\n", calc1.getBMI());
                System.out.println("Nadwaga: " + calc1.isOverweight());

                System.out.print("\nPodaj imię: ");
                name = sc.nextLine();
                System.out.print("Podaj wzrost(m): ");
                height = Float.parseFloat(sc.nextLine());
                System.out.print("Podaj masę(kg): ");
                weight = Integer.parseInt(sc.nextLine());

                BMICalculator calc2 = new BMICalculator(name, weight, height);

                calc2.calculateBMI();
                System.out.print(calc2.getName() + "-twoje BMI: ");
                System.out.format("%.2f\n", calc2.getBMI());
                System.out.println("Nadwaga: " + calc2.isOverweight());

                sc.close();
            } catch (Exception e) {
                System.out.println("Niepoprawne dane we: " + e.getMessage());
            }
        }}


