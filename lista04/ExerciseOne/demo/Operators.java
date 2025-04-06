public class Operators {
    public static void relLogOthers(){
        System.out.println("\n1 - operatory równy|różny, relacji, logiczne");
    int a = 5, b = 6, c = 2, d = 4, e = 1;
        System.out.println(((a == b - 1) && (b != c))? true : false);
        System.out.println(((a >= a) || (b < c))?true:false);
        System.out.println(((c == e) && (b > c))?true:false);
        System.out.println(!(a == d)?true:false);
if(a != 0 && ++b>=7) System.out.println("Priorytet oper. równy|różny wyższy od oper. relacji");
    }
    public static void tenarny(){
        System.out.println("\n2 - operator tenarny");
    int a, b;
    a = 10;
    b = (a == 1)?20:30;
        System.out.println("Wartość b to: " + b);
    b = (a == 10)?20:30;
        System.out.println("Wartośc b to: " +b);
    }
public static void bits(){
    System.out.println("\n3 - operatory bitowe:");
    int a = 60;
    int b = 13;
    int c = 0;

    // bitowy AND
    c = a & b;
    System.out.printf("a & b =\t%h\n", c);

    //bitowy OR
    c = a | b;
    System.out.printf("a | b =\t%h\n", c);

    //bitowy XOR (różnica symetryczna)
    c = a ^ b;
    System.out.printf("a ^ b =\t%h\n", c);

    c = a;
    System.out.printf("a =\t%h\n", c);

}
}

