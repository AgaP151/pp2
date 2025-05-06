import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("Tablica dwuwymiarowa = tablica tablic jednowymiarowych");
        int[][] tab = {
                {13, 17, 2, 18},
                {15, 7, 4},
                {12, 10, 2, 5, 11}
        };
        System.out.println("Zagnieżdzone pętle for");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%d", tab[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nSortowanie wierszy tablicy dwuwymiarowej");
        for (int i = 0; i < tab.length; i++) {
            Arrays.sort(tab[i]);
        }

        System.out.println("Tablica wynikowa - widok 1");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%4d", tab[i][j]);
            }

            System.out.println();
        }
        System.out.println("\nTablica wynikowa - widok 2");
        System.out.println(Arrays.deepToString(tab));
        System.out.println("\n\nTablica dwuwymiarowa z obiektami String");
        String[][] names = {
                {"Karol", "Karolina", "Jacek", "Agata"},
                {"Ewa", "Adam", "Aga"},
                {"Ola", "Ala", "Jaś", "Ula"}
                        };
        System.out.println("Zagnieżdżone petle for");
        for(int i = 0; i < names.length; i++){
            for(int j = 0; j < names[i].length; j++){
                System.out.printf("%11s", names[i][j]);
                            }
            System.out.println();
                    }
        System.out.println("\nSortowanie wierszy tablicy dwuwymiarowej");
        for(int i = 0; i < names.length; i++){
            Arrays.sort(names[i]);
        }
        System.out.println("Tablica wynikowa - widok 1");
        for(int i = 0; i < names.length; i++){
            for(int j = 0; j < names[i].length; j++){
                System.out.printf("%11s", names[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nTablica wynikowa - widok 2");
        System.out.println(Arrays.deepToString(names));
    }
}