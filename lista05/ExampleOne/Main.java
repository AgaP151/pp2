public class Main {
    public static void main(String[] args) {
        MyData.info();

        System.out.println("Switch jako instrukcja\n(bez przekazywania sterowania)");
        int numLetters;

      //  String seasonName = "Wiosna".toLowerCase();
        String seasonName = "Przedwiośnie".toLowerCase();
        switch (seasonName) {
            case "wiosna" ->{
                System.out.println("Wiosa wiosna wiosna ach to ty");
                numLetters = 6;
            }
            case "lato","zima"-> numLetters=4;
            case "jesień"-> numLetters=6;
            default -> numLetters = -1;
        }
        System.out.println(numLetters);
    }
}
