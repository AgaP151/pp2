public class ExampleFour {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();   //utworzenie za pomocą StringBuilder()
        str1.append("Witaj Świecie");
        str1.appendCodePoint(0x1F601);
        System.out.println("String1 = " +str1);

        StringBuilder str2 = new StringBuilder("alfaBetaGamma");    //StringBuilder(CharSequence)
        System.out.println("String2 = " + str2);

        StringBuilder revStr2 = str2.reverse();
        System.out.println("String2rev = " + revStr2.toString());

        // utworzenie obiektu przy użyciu // konstruktora StringBuilder(capacity)
        StringBuilder str3 = new StringBuilder(15);
        System.out.println("String3 / pojemość = " + str3.capacity());

        // utworzenie obiektu przy użyciu // konstruktora StringBuilder(String)
        StringBuilder str4 = new StringBuilder(str1.toString());
        System.out.println("String4 = " + str4);

        //Odczytaj wiadomosc
        int capacity = str4.capacity();
        System.out.println("String4 / pojemność = " + capacity);

        str4.insert(6, "Mój");
        System.out.println("String4 / pojemność = " + capacity);

    }
}
