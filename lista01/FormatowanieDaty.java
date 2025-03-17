import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatowanieDaty {

    public static void main(String[] args) {
        LocalDateTime teraz = LocalDateTime.now();

        Locale[] ustawieniaRegionalne = {
                Locale.US,
                Locale.UK,
                Locale.GERMANY,
                Locale.FRANCE,
                Locale.JAPAN,
                Locale.CHINA
        };

        for (Locale lokalizacja : ustawieniaRegionalne) {
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM) // Użyj MEDIUM zamiast FULL
                    .withLocale(lokalizacja);
            System.out.println("Data i czas w " + lokalizacja.getDisplayCountry() + ": " + teraz.format(formatter));
        }

        Locale polski = new Locale("pl", "PL");
        DateTimeFormatter formatterNazwy = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy HH:mm", polski);
        System.out.println("Data i czas po polsku: " + teraz.format(formatterNazwy));
    }
}