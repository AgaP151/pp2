public class ExampleOne {
    public static void main(String[] args) {
     int size = args.length;

     if (size == 0) {
         System.out.println("Brak danych");
         return;
              }
    if(args[0].equals("-z")){
        for(int i=1; i<size; i++)
            System.out.println("Żegnaj " + args[i]+'!');
    }
    else {
        for (int i = 0; i < size; i++)
            System.out.println("Witaj " + args[i] +"\u263A");
    }
    }
}
