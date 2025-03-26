import java.util.Scanner;
public class RootsOne {
    public static double[] getRoots(double a, double b, double c){
        double[] roots = new double[3]; // obiekt tablicy
        double delta = b*b-4*a*c;
        if (delta<0){
            roots[0] = 0;
        }else{
            roots[0] = (delta==0)?1:2;
            roots[1] = (-b+Math.sqrt(delta))/(2*a);
            roots[2] = (-b-Math.sqrt(delta))/(2*a);
        }
        return roots; // zwraca tablicę
    } // koniec metody getRoots

    public static void main(String[] args){
        try{
            var in = new Scanner(System.in);
            System.out.println("\nRozwiązywanie równania kwadratowego");
            System.out.print("\nPodaj a = ");
            double a = in.nextDouble();
            System.out.print("Podaj b = ");
            double b = in.nextDouble();
            System.out.print("Podaj c = ");
            double c = in.nextDouble();
            if(a==0){
                System.out.println(

                        "\nNieprawid\u0142owe dane!\na nie może być równe 0");

                in.close();
                return;
            }
            double[] results = getRoots(a, b, c); // wywoł. metody i zwrot wyników
            String[] sa = {"\nLiczba rzeczywistych pierwiastków: ", "x1 = ", "x2 = "};
            for(int i=0; i<results[0]+1; i++)
                System.out.println(sa[i] + results[i]);
            in.close();
        }
        catch (Exception e) {
            System.out.println("Wyjątek: " + e);
        }
    } // koniec metody main
}