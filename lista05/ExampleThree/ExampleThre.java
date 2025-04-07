public class ExampleThre {
    public static void main(String[] args) {

        System.out.println("switch' jako wyrażenie\n(bez przekazywania sterowania)");

        String seasonName = "Wiosna".toLowerCase();
        // var seasonName = "lato";
        // var seasonName = "jesień";
        // var seasonname = "zima";

        int numLetters = switch(seasonName){
            case "wiosna"->
            {
                System.out.println("Wiosna wiosna wiosna ach to ty");
                yield 6;
            }
            case "lato", "zima" ->4;
            case "jesień" -> 6;
            default -> -1;
        } *2;
        System.out.println(numLetters);
        }
}
