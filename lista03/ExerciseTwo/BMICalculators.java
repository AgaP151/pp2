import java.util.Scanner;
import java.lang.System;

public class BMICalculators {
    public static void main(String[] args) {
        Double[] bmiThresholds = {16.0, 17.0, 18.5, 25.0, 30.0, 35.0, 40.0, Double.MAX_VALUE};
        String[] categories = {"wygłodzenie", "wychudzenie", "niedowaga", "pożądana masa ciała", "nadwaga", "otyłość I stopnia", "otyłość II stopnia", "otyłość III stopnia" };
        String[] descriptions = {"niedowaga", "niedowaga", "niedowaga", "optimum", "nadwaga", "otyłość", "otyłość", "otyłość"};
        String[] diseaseRisk = {
                "minimalne, ale zwiekszony poziom wystąpienia innych problemów zdrowotnych",
                "minimalne, ale zwiekszony poziom wystąpienia innych problemów zdrowotnych",
                "minimalne, ale zwiekszony poziom wystąpienia innych problemów zdrowotnych",
                "minimalne",
                "średnie",
                "wysokie",
                "bardzo wysokie",
                "ekstremalny poziom ryzyka",
                };

        Scanner userInput = new Scanner(System.in);

        double usersWeight = -1;
        double userHeight = -1;


        while (usersWeight <= 0) {
            System.out.print("Podaj masę ciała(w kg):");
            usersWeight = userInput.nextDouble();
        }
        while (userHeight <= 0) {
            System.out.print("Podaj wzrost (w metrach):");
            userHeight = userInput.nextDouble();
        }
        double bmi = usersWeight / (userHeight * userHeight);
        int currentLevel = 0;

        while (currentLevel < bmiThresholds.length && bmi > bmiThresholds[currentLevel]) {
            currentLevel++;
        }
        System.out.printf("\nTwoje BMI: %.2f\n", bmi);
        System.out.println("Kategoria: " + categories[currentLevel]);
        System.out.println("Opis: " + descriptions[currentLevel]);
        System.out.println("Ryzyko chorób: " + diseaseRisk[currentLevel]);

        userInput.close();
    }
}