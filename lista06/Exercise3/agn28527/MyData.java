package agn28527;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.net.InetAddress;

class MyData {
    public static void info() {
        String name = "Agnieszka Piotrowska, 28527";	    // <= WSTAW SWOJE DANE
        System.out.println(name);

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf =
                DateTimeFormatter.ofPattern("dd MMMM, HH:mm:ss");
        String formatDateTime = ldt.format(dtf);
        System.out.println(formatDateTime);

        String jver = System.getProperty("java.version");
        System.out.println(jver);

        String uname = System.getProperty("user.name");
        System.out.println(uname);

        String osname = System.getProperty("os.name");
        System.out.println(osname);

        try {
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println(addr.getHostAddress());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
