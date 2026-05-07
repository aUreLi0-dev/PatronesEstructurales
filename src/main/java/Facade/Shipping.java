package Facade;

import java.util.List;

public class Shipping {
    public float calcularShipping(List<Item> items){
        float costoEnvio = 2f;

        return items.size() * costoEnvio;
    }
}
