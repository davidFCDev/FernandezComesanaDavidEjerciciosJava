
package org.example.ejercicio2;

import java.time.LocalDate;
import org.example.ejercicio2.models.Event;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Ejercicio2 {

    public static void main(String[] args) {
        List<Event> eventList = Arrays.asList(
                new Event("Conferencia sobre Blockchain parte 1", LocalDate.of(2024, 4, 5), "Conferencia"),
                new Event("Reunión sobre importancia en las finanzas", LocalDate.of(2024, 4, 8), "Reunión"),
                new Event("Taller sobre Economía parte 1", LocalDate.of(2024, 1, 15), "Taller"),
                new Event("Conferencia sobre Blockchain parte 2", LocalDate.of(2024, 6, 25), "Conferencia"),
                new Event("Taller sobre Economía parte 2", LocalDate.of(2024, 4, 5), "Taller")
        );
        
        // Filtrado de eventos por fecha específica
        LocalDate specificDate = LocalDate.of(2024, 4, 5);
        
        List<Event> specificDateEvents = eventList.stream()
                .filter(e -> e.getDate().equals(specificDate))
                .collect(Collectors.toList());
        System.out.println("Eventos que ocurren en " + specificDate + " :");
        specificDateEvents.forEach(System.out::println);
        System.out.println("---------------------------------------------");
        
        // Agrupado de eventos por categoría y número de eventos en cada una
        Map<String, Long> eventsByCategory = eventList.stream()
                .collect(Collectors.groupingBy(Event::getCategory, Collectors.counting()));
        
        System.out.println("Eventos por categoría: " + eventsByCategory);
        System.out.println("---------------------------------------------");
        
        // Encontrar el evento más próximo empleando Optionals
        Optional<Event> nearestEvent  = eventList.stream()
                .min(Comparator.comparing(Event::getDate));
        nearestEvent.ifPresentOrElse(
                evento -> System.out.println("Evento más próximo: " + evento.getName()),
                () -> System.out.println("No hay eventos próximos en la agenda.")
        );
    }
}
