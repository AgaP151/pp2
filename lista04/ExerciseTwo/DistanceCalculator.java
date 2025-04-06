import java.io.*;
// import java.io.IOException;
import java.util.Scanner;

public class DistanceCalculator {
    private static final double EARTH_RADIUS = 6371.0;
private static final double WARSAW_LAT = 52.234982;
private static final double WARSAW_LON = 21.008490;

public static double distance(double lat1, double lon1, double lat2, double lon2) {
    double dLat = Math.toRadians(lat2 - lat1);
    double dLon = Math.toRadians(lon2 - lon1);
    lat1 = Math.toRadians(lat1);
    lat2 = Math.toRadians(lat2);

    double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.sin(dLon / 2) * Math.sin(dLon / 2) * Math.cos(lat1) * Math.cos(lat2);
    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    return EARTH_RADIUS * c;
}

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Agnieszka\\Desktop\\Studia\\pp 2\\EarthRadius.txt";

        try(Scanner sc = new Scanner(System.in);
        PrintWriter wr = new PrintWriter(new FileWriter(filePath, true))) {

            while (true) {
                System.out.println("Punkt docelowy (nazwa, lat, lon): ");
                String line = sc.nextLine();
                if (line.strip().isEmpty()) {
                    break;
                }
                try {
                    String[] parts = line.split(",");
                    if (parts.length != 3) {
                        System.out.println("Nieprawidłowy format. Użyj: Nazwa, lat, lon");
                        continue;
                    }
                    String city = parts[0].strip();
                    double lat = Double.parseDouble(parts[1].strip());
                    double lon = Double.parseDouble(parts[2].strip());

                    double dist = distance(WARSAW_LAT, WARSAW_LON, lat, lon);
                    String result = String.format("Odległość Warszawa - %s: %.2f km", city, dist);
                    System.out.println(result);
                    wr.println(result);

                } catch (NumberFormatException e) {
                    System.out.println("Nieprawidłowe współrzędne – muszą być liczbami.");
                }
            }
        } catch (IOException e) {
            System.err.println("Błąd zapisu do pliku: " + e.getMessage());
            return;
        }
                System.out.println("\nZawartość pliku: C:\\Users\\Agnieszka\\Desktop\\Studia\\pp 2\\EarthRadius.txt");
                try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Agnieszka\\Desktop\\Studia\\pp 2\\EarthRadius.txt"))){
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.err.println("Błąd odczytu pliku: "+ e.getMessage());
                }
            }
        }


