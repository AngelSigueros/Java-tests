import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainDateTimeFormatter {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();

        DateTimeFormatter formatter1;
        formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", new Locale("es", "Es"));

        System.out.println(hoy); // YYYY-MM-DD

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es", "ES"));
        Locale spainLocale = Locale.of("es", "ES");
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", spainLocale);

        String fechaFormateada = hoy.format(formatter);
        System.out.println(fechaFormateada);
    }
}
