package utils;

import entities.Vuelo;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

// Clase para lógica CRUD.
public class UtilsVuelos {
    private static Scanner sc = new Scanner(System.in);
    public static final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Metodo para hacer el filtrado de vuelos segun las fechas introducidas y una lista de vuelos dada.
    public static void filtrarVuelos(List<Vuelo> listaVuelos, LocalDate fechaInicio, LocalDate fechaFin) {
        List<Vuelo> vuelosfiltrados = listaVuelos.stream()
                // Filtra los vuelos cubriendo los 4 posibles casos repartidos por las posibilidades de las dos fechas y unidas por el "&&".
                .filter(vuelo ->
                        (fechaInicio == null || !vuelo.getFechaSalida().isBefore(fechaInicio)) &&
                                (fechaFin == null || !vuelo.getFechaSalida().isAfter(fechaFin)))
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))    // Ordeno los vuelos filtrados según su fechaSalida.
                .toList();

        // Segun el valor de las fechas introducidas imprime un mensaje distinto.
        if (fechaInicio == null && fechaFin == null)
            System.out.println("--- VUELOS DESDE " + LocalDate.now().format(formatoFecha) + " (Por fecha de salida) ---");
        else if (fechaInicio == null)
            System.out.println("--- VUELOS DESDE " + LocalDate.now().format(formatoFecha) + " HASTA " + fechaFin + " (Por fecha de salida) ---");
        else if (fechaFin == null)
            System.out.println("--- VUELOS DESDE " + fechaInicio + " (Por fecha de salida) ---");
        else
            System.out.println("--- VUELOS DESDE " + fechaInicio + " HASTA " + fechaFin + " (Por fecha de salida) ---");

        vuelosfiltrados.forEach(System.out::println);
    }

    // Metodo para leer fechas por Scanner.
    public static LocalDate introducirFecha() {
        while (true) {
            try {
                System.out.println("Introduzca una fecha (dd/mm/yyyy) o pulse Enter para dejar el campo vacío:");
                String fecha = sc.nextLine();

                if (fecha.isEmpty()) return null;
                else return LocalDate.parse(fecha, formatoFecha); // Devuelve la fecha casteada, pero con el formato ordenado.

            } catch (DateTimeException exception) {
                System.out.println("Error ❌: La fecha introducida no es válida, utilice el siguiente formato ➡️ dd/mm/yyyy.\n");
            }
        }
    }
}
