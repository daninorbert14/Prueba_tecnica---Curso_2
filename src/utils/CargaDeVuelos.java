package utils;

// Clase con metodo para simular la carga de una pagina web
public class CargaDeVuelos extends Thread {
    @Override
    public void run() {
        try {
            System.out.print("\nBuscando vuelos");
            sleep(1000);
            System.out.print(".");
            sleep(1000);
            System.out.print(".");
            sleep(1000);
            System.out.print(".");
            sleep(1000);
            System.out.println(" 🔄");
            sleep(1000);
            System.out.println("Vuelos encontrados!! 🎉\n");
            sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
