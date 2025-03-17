package lista01;

import java.util.Scanner;

public class BeaufortApp {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int predkosc;

System.out.println("Podaj prędkość wiatru (km/h): ");
try {
    predkosc = scanner.nextInt();
} catch (Exception e){
System.out.println("Błędne dane! Wprowadź liczbę.");
return;
}
    SkalaBeauforta stopien = SkalaBeauforta.znajdzDlaPredkosci(predkosc);
if (stopien != null) {
System.out.println("Stopień Beauforta: " + stopien.getStopien());
    System.out.println("Opis wiatru: " + stopien.getOpisWiatru());
System.out.println("Stan morza: " + stopien.getStanMorza());
} else {
System.out.println("Podano błędną wartość!");

//    System.out.pr

}
    scanner.close();
}}