import java.sql.SQLOutput;
import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {
        var arr = new int[10];
        for(int i = 0; i < arr.length; i++)
        arr[i] = i;

        int[] arr2 = arr;
        System.out.println(arr[5]);
        arr2[5]=13;
        System.out.println(arr[5]);

        int[] arr3 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3.length);

        int[] arr4 = Arrays.copyOf(arr, 2 * arr.length);
        System.out.println(Arrays.toString(arr4));
        System.out.println(arr4.length);

        String[] names = {"Agata", "Karol", "Karolina", "Daniel", "Edgar", "Witold"};
        String[] names2 = Arrays.copyOf(names, names.length + 2);
        System.out.println(Arrays.toString(names2));
        System.out.println(names2.length);

        for(String elem : names2){
            System.out.printf("%-11s",elem);
        }
    }
}
