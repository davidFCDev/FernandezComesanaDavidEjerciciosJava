
package ejercicio1.models;

import ejercicio1.exceptions.ReservaInvalidaException;
import java.time.LocalDate;

public class Reserva {
    private String nombre;
    private String destino;
    private LocalDate fecha;
    private int numeroAsientosDisponibles;

    public Reserva() {
    }

    public Reserva(String nombre, String destino, LocalDate fecha, int numeroAsientos) {
        this.nombre = nombre;
        this.destino = destino;
        this.fecha = fecha;
        this.numeroAsientosDisponibles = numeroAsientos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getNumeroAsientos() {
        return numeroAsientosDisponibles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientosDisponibles = numeroAsientos;
    }
    
    public void reservarVuelo(int cantidadPasajeros) throws ReservaInvalidaException {
        if (cantidadPasajeros <= 0) {
            throw new ReservaInvalidaException("La cantidad de pasajeros debe ser mayor a cero.");
        }

        if (cantidadPasajeros > numeroAsientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles para la reserva.");
        }

        numeroAsientosDisponibles -= cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre + ", destino=" + destino + ", fecha=" + fecha + ", numeroAsientos=" + numeroAsientosDisponibles + '}';
    }
    
}
