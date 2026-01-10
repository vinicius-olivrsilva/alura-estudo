package elementosunicos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EventosMain {
    public static void main(String[] args) {
        List<String> eventos = new ArrayList<>();

        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        System.out.println("Lista de eventos: " + eventos);

        Set<String> eventosUnicos = new HashSet<>(eventos);
        System.out.println(eventosUnicos);
    }
}
