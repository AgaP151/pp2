public class Main {
    public static void main(String[] args) {
        MyData.info();

        System.out.println("'switch' jako instrukcja\n(z przekazywaniem sterowania)");
        int numLetters;
         var seasonName = "Wiosna".toLowerCase();
       // var seasonName = "lato";
        // var seasonName = "latooo";
        // var seasonName = "jesień";
        // var seasonName = "zima";
         switch (seasonName) {
         case "wiosna":
         System.out.println("Wiosna wiosna wiosna ach to ty");
         case "jesień":
         numLetters = 6;
         break;
         case "lato", "zima":
         numLetters = 4;
         break;
         default:
         numLetters = -1;
         } // koniec instrukcji 'switch'
         System.out.println(numLetters); }
}
