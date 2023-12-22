package org.example.ejercicio2;

import java.util.List;
import org.example.ejercicio2.models.Platillo;
import org.example.ejercicio2.persistence.ControladoraPersistencia;

public class Ejercicio2 {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();

        // Creamos un nuevo platillo
        Platillo plato1 = new Platillo(1, "Arroz con leche", "Blanqueamos el arroz. Cocinamos el arroz con la leche. Añadimos azúcar y retiramos", 6.50);
        controlPersis.añadirPlatillo(plato1);

        // Creamos dos nuevos platillos
        Platillo plato2 = new Platillo(2, "Flan de huevo", "Mezclamos los ingredientes. Colamos y enmoldamos. Cocinamos 30' al baño maría", 4.80);
        Platillo plato3 = new Platillo(3, "Natillas", "Mezclamos los ingredientes. Llevamos al fuego hasta que cuaje. Enfriamos", 5.20);
        controlPersis.añadirPlatillo(plato2);
        controlPersis.añadirPlatillo(plato3);
        
        // Borramos un platillo
        controlPersis.borrarPlatillo(2);
        
        // Editamos un platillo
        plato1.setNombre("Leche con arroz");
        controlPersis.modificarPlatillo(plato1);
        
        // Mostrar los platos en la base de datos
        List<Platillo> listaPlatillos = controlPersis.traerPlatillos();
        
        System.out.println("-----Lista de platillos-----");
        for (Platillo plato : listaPlatillos) {
            System.out.println(plato.toString());
        }
    }
}
