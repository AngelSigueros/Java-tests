import java.time.LocalTime;

public class MainLocalTime {
    public static void main(String[] args) {
        LocalTime hEntrada = LocalTime.now();
        LocalTime hSalida = hEntrada.plusHours(7);

        System.out.println("Hora Entrada: " + hEntrada);
        System.out.println("Hora Salida: " + hSalida);

        System.out.println(hSalida.minusHours(hEntrada.getHour()));
    }
}
