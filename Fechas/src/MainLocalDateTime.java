import java.time.LocalDateTime;

public class MainLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();
        LocalDateTime fEvento = LocalDateTime.of(2024, 4, 20, 12, 30);

        System.out.println(hoy);
        System.out.println(fEvento);

        String fecha = "2024-02-03T10:15:30";
        LocalDateTime fConvertida = LocalDateTime.parse(fecha);

        System.out.println(fecha);
        System.out.println(fConvertida);

    }
}
