import entities.Vuelo;
import utils.CargaDeVuelos;
import utils.UtilsVuelos;

import java.time.*;
import java.util.*;

// Clase para UI/Consola.
public class SistemaVuelos {
    static LocalDate fechaInicio;
    static LocalDate fechaFin;
    private static CargaDeVuelos cargarVuelos = new CargaDeVuelos();

    public static void main(String[] args) {
        List<Vuelo> listaVuelos = List.of(
                new Vuelo(47629387, "TOK001-V", "Iberia", "Barcelona", "Tokio", LocalDate.of(2026, 8, 24), LocalDate.of(2026, 9, 6)),
                new Vuelo(36482602, "PLS001-V", "Air Mauritius", "Madrid", "Port-Louis", LocalDate.of(2027, 7, 20), LocalDate.of(2027, 8, 18)),
                new Vuelo(46392749, "BIL001-V", "Ryanair", "Madrid", "Bilbao", LocalDate.of(2026, 6, 5), LocalDate.of(2026, 6, 10)),
                new Vuelo(82764068, "BDP001-V", "Swiss Airlines", "Berlín", "Budapest", LocalDate.of(2026, 10, 11), LocalDate.of(2026, 10, 19)),
                new Vuelo(93716283, "TNF001-V", "Iberia", "Bilbao", "Tenerife", LocalDate.of(2026, 4, 23), LocalDate.of(2026, 4, 28)),
                new Vuelo(17384629, "NYK001-V", "Air Europa", "Madrid", "Nueva York", LocalDate.of(2027, 6, 16), LocalDate.of(2026, 6, 26)),
                new Vuelo(68262839, "BGT001-V", "Avianca", "Madrid", "Bogotá", LocalDate.of(2026, 7, 10), LocalDate.of(2026, 7, 20)),
                new Vuelo(37283946, "PAR001-V", "British Airways", "Londres", "París", LocalDate.of(2026, 11, 11), LocalDate.of(2026, 11, 15)),
                new Vuelo(28465937, "NAI001-V", "Iberia", "Madrid", "Nairobi", LocalDate.of(2027, 9, 3), LocalDate.of(2026, 9, 17)),
                new Vuelo(54027305, "BSA001-V", "LATAM Airlines", "Brasilia", "Buenos Aires", LocalDate.of(2026, 5, 6), LocalDate.of(2026, 5, 9))
        );

        imprimirVuelos(listaVuelos);
        System.out.println("\n🔜 FECHA DE INICIO:");
        fechaInicio = UtilsVuelos.introducirFecha();
        System.out.println("\n🔚 FECHA DE FIN:");
        fechaFin = UtilsVuelos.introducirFecha();

        cargarVuelos.run();
        UtilsVuelos.filtrarVuelos(listaVuelos, fechaInicio, fechaFin);
    }

    // Metodo que imprime la lista completa de vuelos.
    private static void imprimirVuelos(List<Vuelo> listaVuelos) {
        System.out.println("--- LISTA DE VUELOS ✈️ ---");

        listaVuelos.forEach(System.out::println);
    }
}
