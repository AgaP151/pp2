import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        System.out.println("Demo metody sort z klasą arrays\n");
        if(args.length == 0){
            System.err.println("Brak parametrów wiersza poleceń");
            System.exit(0);
        }
        System.out.println("Tablica nieposortowana: ");
        System.out.println(Arrays.toString(args));
        System.out.println("Tablica posortowana: ");
        Arrays.sort(args);
        System.out.println(Arrays.toString(args));

        int[] arr = {10, 2, 9, 1, -2, 7, -5, 5, 0, 3};
        System.out.println("\nTablica nieposortowana: ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
