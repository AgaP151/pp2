import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] ints = {1, 8, 2, 16, 32, 4, 7, 5, 8};
        int i = Arrays.binarySearch(ints, 7);
        System.out.println(i);

        Arrays.sort(ints);
        int index = Arrays.binarySearch(ints, 7);
        System.out.println(index);
        System.out.println(ints[index]);

        String[] names1 = {"Jan", "Magda", "Adam", "Ewa", "Jaś"};
        String[] names2 = {"Jan", "Magda", "Adam", "Ewa", "Jaś"};
        String[] names3 = { "Magda", "Jan", "Adam", "Ewa", "Jaś"};
        String[] names4 = { "Magda", "Ewa", "Jan",  "Magda", "Jaś"};

        boolean result12 = Arrays.equals(names1, names2);
        boolean result13 = Arrays.equals(names1, names3);

        System.out.println(result12);
        System.out.println(result13);

        Arrays.sort(names1);
        boolean result = Arrays.equals(names1, names4);
        System.out.println(result);
    }
}
