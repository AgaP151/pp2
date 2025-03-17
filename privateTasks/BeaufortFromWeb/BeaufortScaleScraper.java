package BeaufortFromWeb;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Scanner;

public class BeaufortScaleScraper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int predkoscKMH = -1;

        // Pobranie prędkości od użytkownika
        while (predkoscKMH < 0) {
            System.out.print("Podaj prędkość wiatru (km/h): ");
            if (scanner.hasNextInt()) {
                predkoscKMH = scanner.nextInt();
                if (predkoscKMH < 0) {
                    System.out.println("Prędkość nie może być ujemna. Spróbuj ponownie.");
                }
            } else {
                System.out.println("Błędne dane! Wprowadź liczbę.");
                scanner.next(); // Usunięcie błędnego wpisu
            }
        }

        scanner.close();

        try {
            // Pobieranie strony
            Document doc = Jsoup.connect("https://pl.wikipedia.org/wiki/Skala_Beauforta")
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
                    .get();

            System.out.println("\nPołączono ze stroną");

            // Pobranie pierwszej tabeli z klasą "wikitable"
            Element tabela = doc.select("table.wikitable").first();

            if (tabela != null) {
                Elements wiersze = tabela.select("tr");
                boolean znaleziono = false;

                String stopien = "";
                String zakresPredkosciKMH = "";
                String opis= "";
                String stanMorza= "";
                for (Element wiersz : wiersze) {
                    Elements naglowki = wiersz.select("th");
                    Elements komorki = wiersz.select("td");
                    if (naglowki.size() > 4 ){
                         stopien = naglowki.get(0).text().trim();
                         zakresPredkosciKMH = naglowki.get(4).text().trim();
                    }

                    if (komorki.size() > 4) {  // Sprawdzamy, czy wiersz ma wystarczającą liczbę komórek
                         opis = komorki.get(1).text().trim();
                         stanMorza = komorki.get(2).text().trim();
                    }

                    if (komorki.size() > 4 && naglowki.size() >4 )
                    {
                         // Pobieramy zakres z kolumny km/h


                        // Sprawdzenie, czy podana prędkość mieści się w zakresie
                        if (czyPredkoscPasuje(predkoscKMH, zakresPredkosciKMH)) {
                            System.out.println("\n✅ Znaleziono pasujący stopień Beauforta:");
                            System.out.println("Stopień: " + stopien);
                            System.out.println("Opis wiatru: " + opis);
                            System.out.println("Stan morza: " + stanMorza);
                            System.out.println("Zakres prędkości (km/h): " + zakresPredkosciKMH);
                            znaleziono = true;
                            break; // Znaleźliśmy pasujący wynik, nie ma potrzeby szukać dalej
                        }
                    }
                }

                if (!znaleziono) {
                    System.out.println("\n❌ Nie znaleziono stopnia Beauforta dla tej prędkości.");
                }
            } else {
                System.out.println("❌ Nie znaleziono tabeli!");
            }
        } catch (Exception e) {
            System.out.println("⚠ Błąd pobierania danych: " + e.getMessage());
        }
    }

    // Metoda do sprawdzania, czy prędkość pasuje do zakresu podanego w tabeli
    private static boolean czyPredkoscPasuje(int predkosc, String zakres) {
//        // Zamiana myślnika „–” (en-dash) na klasyczny "-"
//        zakres = zakres.replace("–", "-");
//
//        // Zamiana przecinków na kropki (dla liczb typu 0,2 zamiast 0.2)
//        zakres = zakres.replace(",", ".");
//
//        // Usuwamy wszelkie zbędne znaki (np. ≥)
//        zakres = zakres.replaceAll("[^0-9.-]", "").trim();

        if (zakres.contains("-")) { // Jeśli zakres jest w formie np. "50-61"
            String[] granice = zakres.split("-");
            try {
                int min = Integer.parseInt(granice[0].trim());
                int max = Integer.parseInt(granice[1].trim());
                return predkosc >= min && predkosc <= max;
            } catch (NumberFormatException e) {
                System.out.println("⚠ Błąd parsowania zakresu: " + zakres);
                return false;
            }
        } else { // Jeśli jest pojedyncza wartość np. "117+"
            try {
                return predkosc >= Integer.parseInt(zakres.replace("+", "").trim());
            } catch (NumberFormatException e) {
                System.out.println("⚠ Błąd parsowania wartości: " + zakres);
                return false;
            }
        }
    }
}
