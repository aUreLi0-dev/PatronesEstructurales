package Decorator;

public class Main {
    static void main() {
        Beverage cafe = new Espresso("Cafe");
        Beverage cafeConLeche = new Milk("Leche", cafe);
        Beverage cafeconLecheChocolatada = new Chocolate("Chocolate", cafeConLeche);

        System.out.println(cafeconLecheChocolatada.cost());
        System.out.println(cafeConLeche.cost());
        System.out.println(cafe.cost());

        System.out.println(cafeConLeche.getDescription());

        System.out.println(
                new Chocolate("Chocolate", new Espresso("Simple")).cost()
        );

    }
}
