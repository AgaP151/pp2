public class Roots {
    public static double[] getRoots(double a, double b, double c) {
        double[] roots = new double[3]; // operator new – tworzy obiekt tablicy
        double delta = b * b - 4 * a * c; // typowe operatory arytmetyczne
        if (delta < 0) {
            roots[0] = 0;
        } else {
            roots[0] = (delta == 0) ? 1 : 2; // ? : – instrukcja warunkowa, jak w C
            roots[1] = (-b + Math.sqrt(delta)) / (2 * a); // sqrt – met. statyczna klasy Math
            roots[2] = (-b - Math.sqrt(delta)) / (2 * a);
        }
        return roots; // metoda getRoots zwraca obiekt tablicy
    } // koniec metody getRoots
    public static void main(String[] args){
        try{
            double a=Double.parseDouble(args[0]); // parsowanie łańcucha a
            if(a==0){
                System.out.println("Nieprawid\u0142owe dane");
                return;
            }
            double b=Double.parseDouble(args[1]); // parsowanie łańcucha b
            double c=Double.parseDouble(args[2]); // parsowanie łańcucha c
            double[] results = getRoots(a, b, c);
            String[] sa = {"Liczba rzeczywistych pierwiastków: ", "x1 = ", "x2 = "};
            for(int i=0; i<results[0]+1; i++)
                System.out.println(sa[i] + results[i]); // budowanie i wyprowadzenie odpowiedzi
        }
        catch (Exception e) {
            System.out.println("Wyjątek: " + e);
        }
    } // koniec metody main

}