package ejercicio1.models;

public class Agente extends Thread {

    private static int contadorLlamadas = 1;
    private String nombre;
    private int numeroLlamada;

    public Agente() {
        this.numeroLlamada = contadorLlamadas++;
    }

    public Agente(String nombre) {
        this.nombre = nombre;
        this.numeroLlamada = contadorLlamadas++;
    }

    @Override
    public void run() {
        System.out.println(nombre + ": Recibiendo llamada " + numeroLlamada);
        System.out.println(nombre + ": Resolviendo la consulta");
        System.out.println(nombre + ": Guardando información");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}
