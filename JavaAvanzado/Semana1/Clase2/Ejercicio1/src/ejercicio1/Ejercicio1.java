package ejercicio1;

import ejercicio1.models.Agente;

public class Ejercicio1 {

    public static void main(String[] args) {


     Agente agente1 = new Agente("David");
     Agente agente2 = new Agente("Manuel");
     Agente agente3 = new Agente("Sofía");

     agente1.start();
     agente2.start();
     agente3.start();

    }

}
