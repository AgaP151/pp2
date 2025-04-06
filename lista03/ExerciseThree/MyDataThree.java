
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.net.InetAddress;

public class MyDataThree {
    public static void info(){
        var bioData = "Jan Maria Janowski, 12345";
        System.out.println(bioData);

        LocalDateTime Idt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
        String formatDateTime = Idt.format(dtf);
        System.out.println(formatDateTime);

        String uname = System.getProperty("user.name");
        System.out.println(uname);

        String osname = System.getProperty("os.name");
        System.out.println("osname");;
        try{
            String ipAddress = InetAddress.getLocalHost().getHostAddress();
            System.out.println(ipAddress);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
