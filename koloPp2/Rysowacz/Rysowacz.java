//public class Rysowacz {
//    public void rysuj(int szerokość,int wysokość){
//        for (int i = 0; i < wysokość; i++) {
//            linia(szerokość);
//        }
//
//    }
//
//    private void linia(int szerokość) {
//        for (int i = 0; i < szerokość; i++) {
//            System.out.print("*");
//
//        }
//            System.out.println();
//        }
//
//
//    }


public class Rysowacz {
    // Metoda publiczna do rysowania prostokąta
    public void rysuj(int szerokosc, int wysokosc) {
        for (int i = 0; i < wysokosc; i++) {
            if (i == 0 || i == wysokosc - 1) {
                // Pierwszy lub ostatni wiersz (pełna linia gwiazdek)
                pelnaLinia(szerokosc);
            } else {
                // Środkowe wiersze (ramka z pustym środkiem)
                ramkaLinia(szerokosc);
            }
        }
    }

    // Metoda prywatna do rysowania pełnej linii gwiazdek
    private void pelnaLinia(int szerokosc) {
        for (int i = 0; i < szerokosc; i++) {
            System.out.print("*");
        }
        System.out.println(); // Przejście do nowej linii
    }

    // Metoda prywatna do rysowania linii ramki (gwiazdki na brzegach)
    private void ramkaLinia(int szerokosc) {
        System.out.print("*"); // Gwiazdka na początku
        for (int i = 1; i < szerokosc - 1; i++) {
            System.out.print(" "); // Puste miejsca w środku
        }
        if (szerokosc > 1) {
            System.out.print("*"); // Gwiazdka na końcu (jeśli szerokość > 1)
        }
        System.out.println(); // Przejście do nowej linii
    }
}
