import java.io.UnsupportedEncodingException;

public class StringExample {
    public static void main(String[] args) {
String s1 = new String("Cześć!");
int len1 = s1.length();
        System.out.println(len1);

        int len2 = "Cześć!".length();
        System.out.println(len2);
        int i = 0x1F601;
        var s3 = new String(Character.toChars(i));
        int len3 = s3.length();
        System.out.println(len3);

        char ch = s1.charAt(0);
        System.out.println(ch);
        ch = s1.charAt(4);
        System.out.println(ch);
        ch = s1.charAt(5);
        System.out.println(ch);

        //liczba bajtów łańcucha zależy od formatowania
        int cp = 0x1D54F;
        String st1 = new String(Character.toChars(cp));
        String st2 = "Witaj Świecie" + st1;
        System.out.printf("%s\n", st2);
        System.out.printf("%S\n", st2);

        try{
            byte[] arr = st2.getBytes("UTF8");
            System.out.println(arr.length);

            arr = st2.getBytes("UTF16");
            System.out.println(arr.length);
            arr = st2.getBytes("UTF32");
            System.out.println(arr.length);
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();  //metoda getBytes zgłasza wyjątek
               }
String s = "Cześć";
        System.out.println(s.substring(0, 3));
        System.out.println(s.substring(3, s.length()));

        // sout(3, 2) -- wyrzuci wyjatek

        // konkatenacja i powtórzenia
        var str = "Adam" + "i Ewa";
        System.out.println(str);
        str = "Romeo".concat("i Julia");
        System.out.println(str);
        str= String.join("", "Helioza", "i", "Abelard");
        System.out.println(str);
        String rep = "Yeas!".repeat(3);
        System.out.println(rep);

        //Sprawdzenie równości łańcuchów
        String sa = "Cześć!";
        String sb = "Cześć!";
        System.out.println(sa.equals(sb));
        System.out.println(sa.equalsIgnoreCase("cześć!"));
        System.out.println(sa.compareTo("cześć!") == 0);

        String sc = "";
        String sd = null;
        System.out.println(sc.length() ==0);
        System.out.println(sd == null);

        sd = "Jakiś Łańcuch";
        System.out.println((str != null) && (str.length() != 0));
    }
}
