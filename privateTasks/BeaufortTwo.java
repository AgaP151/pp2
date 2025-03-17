package privateTasks;

import java.util.Locale;
import java.util.Scanner;

class BeaufortTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.);
        System.out.println("Podaj swój wiek ");
        int age = scan.nextInt();
        System.out.println("Podaj swoją wypłatę");
        double payment = scan.nextDouble();
        scan.nextLine();
        System.out.println("Podaj swoje imię");
        String name = scan.nextLine();
        System.out.println("Cześć " + name);
        System.out.println("Twój wiek to " + age);
        System.out.println("Twoja wypłata to " + payment);
    }
}