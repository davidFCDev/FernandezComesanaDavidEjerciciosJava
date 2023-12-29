package ejercicio2.models;

import ejercicio2.exceptions.InventarioException;
import java.util.ArrayList;
import java.util.List;

public class GestionInventario {
    private final List<Producto> inventario;

    public GestionInventario() {
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(String nombre, double precio, int cantidadDisponible) throws InventarioException {

        // Validacion de los datos del producto
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new InventarioException("El nombre del producto no puede estar vacío");
        }

        if (precio <= 0) {
            throw new InventarioException("El precio del producto debe ser mayor que cero");
        }

        if (cantidadDisponible < 0) {
            throw new InventarioException("La cantidad disponible no puede ser negativa");
        }

        Producto nuevoProducto = new Producto(nombre, precio, cantidadDisponible);
        inventario.add(nuevoProducto);
    }

}

