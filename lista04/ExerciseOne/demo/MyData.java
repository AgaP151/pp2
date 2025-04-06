import javax.print.DocFlavor;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyData {
    public static void info() {
        String name = "Iks Iksiński, 1234567";
        System.out.println(name);

        LocalDateTime Idt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM, HH:mm:ss");
        String formatDateTime = Idt.format(dtf);
        System.out.println(formatDateTime);

        String jver = System.getProperty("java.version");
        System.out.println(jver);

        String uname = System.getProperty("user.name");
        System.out.println(uname);

        String osname = System.getProperty("os.name");
        System.out.println(osname);

        try{
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println(addr.getHostAddress());
        } catch (Exception e) {
            System.err.println((e.getMessage()));

        }
    }
}
