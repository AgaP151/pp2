import java.time.LocaleDateTime;
import java.time.format.DateTimeFormatter;
import java.net.InetAdrress;

public class MyData {
public static void info(){
    var bioData = "Jan Maria Janowski, 12345";
    System.out.println(bioData);

    LocaleDateTime Idt = LocaleDateTime.now();
    DateTimeFormatter dtf = dateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
    String formatDateTime = Idt.format(dtf);
    System.out.println(formatDateTime);

    String uname = System.getProperty("user.name");
    System.out.println(uname);

    String osname = System.getProperty("os.name");
    System.out.println("osname");;
    try{
        string ipAddress = InetAddress.getLocaleHost().getHostAddress();
        System.out.println(ipAddress);
}
    catch (Exception e) {
        System.err.println(e.getMessage());
    }
    }
}
