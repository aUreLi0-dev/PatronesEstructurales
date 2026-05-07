package Facade;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    static void main() {

        List<Item> itemsAComprar = new ArrayList<>();
        itemsAComprar.add(new Item("PS5",1,3599f));
        itemsAComprar.add(new Item("PS5",1,3599f));
        itemsAComprar.add(new Item("PS5",1,3599f));
        itemsAComprar.add(new Item("PS5",1,3599f));
        itemsAComprar.add(new Item("PS5",1,3599f));
        itemsAComprar.add(new Item("PS5",1,3599f));
        itemsAComprar.add(new Item("PS5",1,3599f));
        itemsAComprar.add(new Item("PS5",1,3599f));
        itemsAComprar.add(new Item("PS5",1,3599f));
        itemsAComprar.add(new Item("PS5",1,3599f));

        comprar(itemsAComprar);

    }

    public static void comprar(List<Item> items) {
        VentasManager ventasManager = VentasManager.getInstance();

        if(!ventasManager.validarStock(items)){
            return;
        }

        float desc = ventasManager.calcularDescuento(items);
        float ship = ventasManager.calcularShipping(items);

    }


}
