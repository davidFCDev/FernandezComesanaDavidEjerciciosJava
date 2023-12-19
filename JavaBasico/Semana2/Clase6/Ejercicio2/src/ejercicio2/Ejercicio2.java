package ejercicio2;

import ejercicio2.models.Product;
import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Creamos los objetos de los productos
        Product phone = new Product(1, "Phone", "Samsung", "Smartphone", 200.0, 400.0, 20);
        Product laptop = new Product(2, "Laptop", "HP", "Portatil", 800.0, 1200.0, 15);
        Product earphones = new Product(3, "Earphones", "Sony", "Inhalambric", 50.0, 80.0, 30);
        Product charger = new Product(4, "Charger", "Apple", "Accessory", 15.0, 25.0, 50);
        Product tablet = new Product(5, "Tablet", "Lenovo", "Tablet", 150.0, 250.0, 10);
        Product smartwatch = new Product(6, "Smartwatch", "Xiaomi", "Wearable", 80.0, 120.0, 25);
        Product printer = new Product(7, "Printer", "Epson", "Peripheral", 150.0, 200.0, 12);
        Product speakers = new Product(8, "Speakers", "Logitech", "Audio", 40.0, 60.0, 18);
        Product monitor = new Product(9, "Monitor", "Dell", "Monitor", 200.0, 300.0, 8);
        Product keyboard = new Product(10, "Keyboard", "Corsair", "Peripheral", 30.0, 50.0, 22);
        System.out.println("Se han creado los objetos.");

        // Creamos el ArrayList y añadimos los productos
        ArrayList<Product> products = new ArrayList<>();
        products.add(phone);
        products.add(laptop);
        products.add(earphones);
        products.add(charger);
        products.add(tablet);
        products.add(smartwatch);
        products.add(printer);
        products.add(speakers);
        products.add(monitor);
        products.add(keyboard);
        System.out.println("Se ha creado el ArrayList y se han añadido los objetos.");
        System.out.println("----------------------------------");
        System.out.println("La lista de productos es: ");
        for (Product product : products) {
            System.out.println(product.toString());
        }
        System.out.println("----------------------------------");

        // Recorremos ArrayList y obtenemos el producto con mayor precio de venta
        Product expensiveSellProduct = products.get(0);

        for (Product product : products) {
            if (product.getSellPrice() > expensiveSellProduct.getSellPrice()) {
                expensiveSellProduct = product;
            }
        }

        System.out.println("El producto con el precio de venta más elevado es el " + expensiveSellProduct.getName());

        // Recorremos Arraylist y obtenemos el producto con menor precio de coste
        Product cheaperCostProduct = products.get(0);

        for (Product product : products) {
            if (product.getCostPrice() < cheaperCostProduct.getCostPrice()) {
                cheaperCostProduct = product;
            }
        }

        System.out.println("El producto con el precio de coste más bajo es el " + cheaperCostProduct.getName());

        // Eliminar el producto en la posicion 5 del ArrayList
        products.remove(5);
        System.out.println("Se ha eliminado el producto en la posición 5.");
        System.out.println("----------------------------------");
        System.out.println("La nueva lista de productos es: ");
        for (Product product : products) {
            System.out.println(product.toString());
        }
        System.out.println("----------------------------------");

        // Obtenemos producto con mayor stock, descontamos 3 unidades y actualizamos el registro
        Product maxStockProduct = products.get(0);

        for (Product product : products) {
            if (product.getStock() > maxStockProduct.getStock()) {
                maxStockProduct = product;
            }
        }

        System.out.println("El producto con mayor stock es el " + maxStockProduct.getName());
        System.out.println("El stock es de: " + maxStockProduct.getStock() + " productos.");

        restStock(products, maxStockProduct, 3);
        
        System.out.println("Quedan " + maxStockProduct.getStock() + " productos.");

    }

    public static void restStock(ArrayList<Product> products, Product product, int quantityToDiscount) {
        if (products.contains(product)) {
            int newStock = product.getStock() - quantityToDiscount;
            product.setStock(newStock);
            System.out.println("Se descontaron 3 unidades del total.");
        }
    }

}
