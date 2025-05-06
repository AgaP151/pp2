package agn28527;

class Test {
    public static void main(String[] args) {
        MyData.info();

        String city1 = "Warszawa";
        double lat1 = 52.17057;
        double lon1 = 20.96350;

        // Poprawione pobieranie argumentów
        String city2 = args[1];
        double lat2 = Double.parseDouble(args[2]);
        double lon2 = Double.parseDouble(args[3]);

        double distance = Distance.distance(lat1, lon1, lat2, lon2);
        System.out.printf("\n%s - %s: %.2f km\n", city1, city2, distance);

        System.out.println(args[0]);
    }
}
