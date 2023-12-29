package ejercicio2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.Executors;

public class Ejercicio2 {

    private static final int NUMERO_ESTACIONES = 3;
    private static final int NUMERO_TRABAJADORES = 5;

    private static final Semaphore semaforo = new Semaphore(NUMERO_ESTACIONES, true);

    public static void main(String[] args) {
        ExecutorService ejecutor = Executors.newFixedThreadPool(NUMERO_TRABAJADORES);

        for (int i = 1; i <= NUMERO_TRABAJADORES; i++) {
            ejecutor.execute(new Trabajador("Trabajador " + i));
        }

        ejecutor.shutdown();
    }

    static class Trabajador implements Runnable {

        private String nombre;

        public Trabajador(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public void run() {
            try {
                semaforo.acquire();

                System.out.println(nombre + ": Ensamblando productos");
                System.out.println(nombre + ": Realizando control de calidad");
                System.out.println(nombre + ": Embalando productos");

                semaforo.release();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }
}
