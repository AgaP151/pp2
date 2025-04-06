
    import java.io.*;
import java.util.Scanner;

    public class DistanceCalculators {
        private static final double WARSAW_LAT = 52.234982;
        private static final double WARSAW_LON = 21.008490;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            File file = new File("C:\\Users\\Agnieszka\\Desktop\\Studia\\pp 2\\EarthRadiusVincent.txt");

            try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                while (true) {
                    System.out.print("Punkt docelowy (nazwa, lat, lon) lub ENTER aby zakończyć: ");
                    String line = sc.nextLine().trim();
                    if (line.isEmpty()) break;

                    String[] parts = line.split(",");
                    if (parts.length != 3) {
                        System.out.println("Niepoprawny format. Wprowadź: nazwa, lat, lon");
                        continue;
                    }

                    String city = parts[0].trim();
                    double lat = Double.parseDouble(parts[1].trim());
                    double lon = Double.parseDouble(parts[2].trim());

                    double distance = VincentyDistance.distance(WARSAW_LAT, WARSAW_LON, lat, lon);

                    String result = String.format("Punkt docelowy: %s\nOdległość Warszawa - %s: %.2f km\n",
                            city, city, distance);
                    System.out.print(result);
                    writer.print(result);
                }
            } catch (IOException e) {
                System.out.println("Błąd zapisu do pliku: " + e.getMessage());
            }

            // Wyświetlanie zawartości pliku
            System.out.println("\nZawartość pliku C:\\Users\\Agnieszka\\Desktop\\Studia\\pp 2\\EarthRadiusVincent.txt");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Błąd odczytu z pliku: " + e.getMessage());
            }
        }
    }

    class VincentyDistance {
        private static final double a = 6378137.0;
        private static final double f = 1 / 298.257223563;
        private static final double b = (1 - f) * a;

        public static double distance(double lat1, double lon1, double lat2, double lon2) {
            double phi1 = Math.toRadians(lat1);
            double phi2 = Math.toRadians(lat2);
            double L = Math.toRadians(lon2 - lon1);

            double U1 = Math.atan((1 - f) * Math.tan(phi1));
            double U2 = Math.atan((1 - f) * Math.tan(phi2));

            double sinU1 = Math.sin(U1), cosU1 = Math.cos(U1);
            double sinU2 = Math.sin(U2), cosU2 = Math.cos(U2);

            double lambda = L;
            double lambdaPrev;
            double sinLambda, cosLambda, sinSigma, cosSigma, sigma, sinAlpha, cos2Alpha, cos2SigmaM, C;

            int iterLimit = 100;
            do {
                sinLambda = Math.sin(lambda);
                cosLambda = Math.cos(lambda);
                sinSigma = Math.sqrt(Math.pow(cosU2 * sinLambda, 2) +
                        Math.pow(cosU1 * sinU2 - sinU1 * cosU2 * cosLambda, 2));
                if (sinSigma == 0) return 0;

                cosSigma = sinU1 * sinU2 + cosU1 * cosU2 * cosLambda;
                sigma = Math.atan2(sinSigma, cosSigma);
                sinAlpha = cosU1 * cosU2 * sinLambda / sinSigma;
                cos2Alpha = 1 - sinAlpha * sinAlpha;

                if (cos2Alpha == 0) cos2SigmaM = 0;
                else cos2SigmaM = cosSigma - 2 * sinU1 * sinU2 / cos2Alpha;

                C = f / 16 * cos2Alpha * (4 + f * (4 - 3 * cos2Alpha));
                lambdaPrev = lambda;
                lambda = L + (1 - C) * f * sinAlpha *
                        (sigma + C * sinSigma * (cos2SigmaM + C * cosSigma *
                                (-1 + 2 * Math.pow(cos2SigmaM, 2))));
            } while (Math.abs(lambda - lambdaPrev) > 1e-12 && --iterLimit > 0);

            if (iterLimit == 0) {
                throw new RuntimeException("Vincenty's formula failed to converge");
            }

            double uSq = cos2Alpha * (a * a - b * b) / (b * b);
            double A = 1 + uSq / 16384 * (4096 + uSq * (-768 + uSq * (320 - 175 * uSq)));
            double B = uSq / 1024 * (256 + uSq * (-128 + uSq * (74 - 47 * uSq)));

            double deltaSigma = B * sinSigma * (cos2SigmaM + B / 4 *
                    (cosSigma * (-1 + 2 * Math.pow(cos2SigmaM, 2)) -
                            B / 6 * cos2SigmaM * (-3 + 4 * sinSigma * sinSigma) *
                                    (-3 + 4 * Math.pow(cos2SigmaM, 2))));

            double s = b * A * (sigma - deltaSigma);
            return s / 1000.0; // w kilometrach
        }
    }


