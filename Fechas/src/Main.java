import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();
        LocalDate fInicio = LocalDate.of(2004,3,14);
        LocalDate fOut = LocalDate.of(2004,3,15);

        System.out.println(hoy);
        System.out.println(fInicio);
        System.out.println(fOut);

        boolean isBefore = fInicio.isBefore(fOut);
        System.out.println(isBefore);

        boolean isAfter = fInicio.isAfter(fOut);
        System.out.println(isAfter);

        System.out.println(hoy.getDayOfWeek());
        System.out.println(hoy.getDayOfYear());
        System.out.println(hoy.getMonth());
        System.out.println(hoy.getYear());

        LocalDate iSubs = LocalDate.now();
        LocalDate fSubs = iSubs.plusWeeks(1);
        System.out.println(iSubs);
        System.out.println(fSubs);

    }
}