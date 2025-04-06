import static java.lang.String.valueOf;

public class ExampleThree1 {
    public static void main(String[] args) {
        String str1 = "Ala ma kota. Ola ma Asa, Alfa i Kumę";
        String regex = "[,\\.\\s]";
        String[] myArr = str1.split(regex);
        for (String s : myArr){
            System.out.println(s);
        }
        int len1 = myArr.length;
        for (int i = 0; i < len1; i++){
            System.out.println(valueOf(i)+":"+myArr[i]);
        }
        char[] arr = {'a', 'b', 'c'};
        System.out.println(valueOf(arr));
        System.out.println(valueOf('A'));
        System.out.println(valueOf(true));
        System.out.println(valueOf(4.5f));
        System.out.println(valueOf(5.2));
        System.out.println(valueOf(012));
        System.out.println(valueOf(12));
        System.out.println(valueOf(0X12));
        System.out.println(valueOf(0x1500L));
    }

}
