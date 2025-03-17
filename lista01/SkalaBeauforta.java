package lista01;

public enum SkalaBeauforta {
    STOPIEN_0(0, 0, 1, "Cisza", "Morze gładkie jak lustro"),
    STOPIEN_1(1, 2, 5, "Powiew", "Zmarszczki na powierzchni morza"),
    STOPIEN_2(2, 6, 11, "Słaby wiatr", "Małe fale, ale bez piany"),
    STOPIEN_3(3, 12, 19, "Łagodny wiatr", "Małe fale z białymi grzywami"),
    STOPIEN_4(4, 20, 28, "Umiarkowany wiatr", "Fale do 1 metra, częste białe grzywy"),
    STOPIEN_5(5, 29, 38, "Dość silny wiatr", "Fale do 2 metrów, piana"),
    STOPIEN_6(6, 39, 49, "Silny wiatr", "Wielkie fale, rozpylona piana"),
    STOPIEN_7(7, 50, 61, "Bardzo silny wiatr", "Morze wzburzone, piania"),
    STOPIEN_8(8, 62, 74, "Sztorm", "Fale do 5,5 metra, bryzgi piany"),
    STOPIEN_9(9, 75, 88, "Silny sztorm", "Fale do 7 metrów, silna piana"),
    STOPIEN_10(10, 89, 102, "Bardzo silny sztorm", "Fale do 9 metrów, ograniczona widoczność"),
    STOPIEN_11(11, 103, 117, "Huraganowy sztorm", "Fale powyżej 11 metrów, bardzo ograniczona widoczność"),
    STOPIEN_12(12, 118, Integer.MAX_VALUE, "Huragan", "Gigantyczne fale, ekstremalne warunki");

    private final int stopien;
    private final int minPredkosc;
    private final int maxPredkosc;
    private final String opisWiatru;
    private final String stanMorza;


    SkalaBeauforta(int stopien, int minPredkosc, int maxPredkosc, String opisWiatru, String stanMorza) {
        this.stopien = stopien;
        this.minPredkosc = minPredkosc;
        this.maxPredkosc = maxPredkosc;
        this.opisWiatru = opisWiatru;
        this.stanMorza = stanMorza;
    }

    public int getStopien() { return stopien; }
    public String getOpisWiatru() { return opisWiatru; }
    public String getStanMorza() { return stanMorza; }

    public static SkalaBeauforta znajdzDlaPredkosci(int predkosc) {
        for (SkalaBeauforta stopien : values()) {
            if (predkosc >= stopien.minPredkosc && predkosc <= stopien.maxPredkosc) {
                return stopien;
            }
        }
        return null;
    }
}

