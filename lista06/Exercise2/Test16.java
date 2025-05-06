import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj rozmiar tablicy: ");
        int arraySize = scanner.nextInt();
        int[] intArray = new int[arraySize];
        BigInteger[] bigArray = new BigInteger[arraySize];
        String[] strArray = new String[arraySize];


        System.out.println("Podaj elementy tablicy Integer: ");
        for (int item = 0; item < intArray.length; item++) {
            intArray[item] = scanner.nextInt();
        }
        scanner.nextLine();

        System.out.println("Podaj elementy tablicy BigInteger: ");
        for (int item = 0; item < bigArray.length; item++) {
            bigArray[item] = new BigInteger(scanner.nextLine());
        }

        System.out.println("Podaj elementy tablicy String: ");
        for (int item = 0; item < strArray.length; item++) {
            strArray[item] = scanner.nextLine();
        }


        Arrays.sort(intArray);
        Arrays.sort(bigArray);
        Arrays.sort(strArray);


        System.out.println("\nPosortowane tablice:");
        printArrays(intArray, bigArray, strArray);


        reverseInt(intArray);
        reverseBig(bigArray);
        reverseStr(strArray);


        System.out.println("\nOdwrócone tablice:");
        printArrays(intArray, bigArray, strArray);
    }


    private static void printArrays(int[] intArr, BigInteger[] bigArr, String[] strArr) {
        System.out.println("intArray: " + Arrays.toString(intArr));
        System.out.print("for-each: ");
        for (int num : intArr) System.out.print(num + " ");

        System.out.println("\n\nbigArray: " + Arrays.toString(bigArr));
        System.out.print("for-each: ");
        for (BigInteger num : bigArr) System.out.print(num + " ");

        System.out.println("\n\nstrArray: " + Arrays.toString(strArr));
        System.out.print("for-each: ");
        for (String s : strArr) System.out.print(s + " ");
        System.out.println("\n");
    }


    public static void reverseInt(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void reverseBig(BigInteger[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            BigInteger temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void reverseStr(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
