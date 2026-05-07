package Facade;

import java.util.List;

public class VentasManager {
    private static VentasManager instance = null;

    private Descuento descuento;
    private Inventario inventario;
    private Shipping shipping;

    private VentasManager() {
        this.descuento = new Descuento();
        this.inventario = new Inventario();
        this.shipping = new Shipping();

        inventario.addItem(new Item("Switch Lite",10,759f));
        inventario.addItem(new Item("PSVita",20,359f));
    }

    public static VentasManager getInstance(){
        if(instance==null){
            instance = new VentasManager();
        }
        return instance;
    }

    public boolean validarStock(List<Item> items){
        for(Item i:items){
            if(!inventario.validarStock(i)){
                return false;
            }
        }
        return true;
    }

    public float calcularDescuento(List<Item> items){
        return descuento.aplicarDescuento(items);
    }

    public float calcularShipping(List<Item> items){
        return shipping.calcularShipping(items);

    }
}
