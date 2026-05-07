package factory.lab03;

public class Main {
    static void main() {
        GameFactory fpsFactory = new FPSFactory();
        fpsFactory.jugar();

        GameFactory rpgFactory = new RPGFactory();
        rpgFactory.jugar();
    }

}
