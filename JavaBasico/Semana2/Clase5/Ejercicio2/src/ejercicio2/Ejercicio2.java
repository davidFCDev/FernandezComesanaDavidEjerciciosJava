package ejercicio2;

import ejercicio2.models.Hat;
import ejercicio2.models.Jeans;
import ejercicio2.models.Outfit;
import ejercicio2.models.Shirt;
import ejercicio2.models.Shoe;

public class Ejercicio2 {

    public static void main(String[] args) {
        Outfit[] myOutfit = new Outfit[9];

        // Zapatos
        myOutfit[0] = new Shoe("Cotton", "Laces", 1, "Nike Air Max", 159.99, "Nike", 44, "White");
        myOutfit[1] = new Shoe("Cotton", "Laces", 2, "Vans - Ward", 59.99, "Vans", 42, "Black");
        myOutfit[2] = new Shoe("Cotton", "Slip on", 3, "Adidas Skateboarding", 59.99, "Adidas", 43, "Gray");
        
        // Pantalones
        myOutfit[3] = new Jeans("Shorts", "Cotton and polyester", 11, "Blue Jeans", 79.99, "Levi's", 44, "Blue");
        myOutfit[4] = new Jeans("Long pants", "Cotton and polyester", 12, "Season Jeans", 89.99, "Cimarron", 42, "Blue");
        myOutfit[5] = new Jeans("Long pants", "Cotton and polyester", 13, "Black Pants", 49.99, "Oggi", 45, "Black");
        
        // Camisetas
        myOutfit[6] = new Shirt("Short sleeve", "Mao neck", 21, "Summer shirt", 29.99, "Ripcurl", 42, "White");
        myOutfit[7] = new Shirt("Long sleeve", "Normal neck", 22, "Winter shirt", 19.99, "Pull&Bear", 44, "Blue and white");
        
        //Sombrero
        myOutfit[8] = new Hat("Beisbol Style hat", 'M', 31, "New Era Yankee Hat", 29.99, "New Era", 40, "Green palid");
        
         for (Outfit item : myOutfit) {
            System.out.println(item.showBrand());
            System.out.println("------------------------------");
        }
    }

     
}
