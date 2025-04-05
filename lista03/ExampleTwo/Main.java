public class Main {
    public static void main(String[] args) {
        double d = Double.MIN_NORMAL;
        System.out.println(d);

        d = Double.MIN_VALUE;
        System.out.println(d);

        d = Double.MAX_VALUE;
        System.out.println(d);

        // typ całkowity bezznakowy długi
        long val1 = Long.parseUnsignedLong("123456789012345678");
        System.out.println(++val1);
        int s = Long.BYTES;
        System.out.println(s);

        // code points powyzej 007F, ale w obszarze BMP --> wymagany UTF-8
        char ch = 'Ą';
        System.out.println(ch);
        ch ='\u03C0';
        System.out.println(ch);


/*znaki  o współrzednej kodowej powyzej U+FFFF najlepiej zamienic na łańcuch z uzyciem
    metody toChars() klasy Character*/
    int i = 0x1F601;
    String st = new String(Character.toChars(i));
        System.out.println(st);   // drukuj łąńcuch pojedynczy symbol

        boolean b = true;
        System.out.println(b);


    }

}
