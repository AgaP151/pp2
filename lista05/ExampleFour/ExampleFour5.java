public class ExampleFour5 {
    public static void main(String[] args) {
        System.out.println("switch' jako wyrażenie\n(z przekazywaniem sterowania)");
        String seasonName = "Wiosna".toLowerCase();

        // var seasonName = "lato";
        // var seasonName = "jesień";
        // var seasonName = "zima";

        int numLetters = 0xA * switch(seasonName){
            case "wiosna":
                System.out.println("Wiosna wiosna wiosna ach to ty");
            case "jesień":
                yield 6;
            case "lato", "zima":
                yield 4;
            default:
                yield -1;

        };
        System.out.println(numLetters);
    }
}
