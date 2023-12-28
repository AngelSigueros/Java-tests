import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        List<String> frutas = Arrays.asList("manzana", "banana", "cereza");
        boolean b = frutas.stream().allMatch(f -> f.length() > 6);
        System.out.println(b);

        List<String> lista = new ArrayList<>();
        b = lista.stream().noneMatch(e -> e.isEmpty());
        System.out.println(b);

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        b =  numeros.stream().noneMatch(n -> n > 0);
        System.out.println(b);

        public String getNombreSeguro(Persona persona) {
            return persona.getCoche()
                    .flatMap(Coche::getSeguro)
                    .map(Seguro::getNombre)
                    .orElse("Desconocido");
        }


    }
}