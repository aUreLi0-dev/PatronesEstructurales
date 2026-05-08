package Abstract.extra;

public class Main {
    static void main() {
        GUIFactory guiFactory = new MacFactory();
        Cliente cliente = new Cliente(guiFactory);
        cliente.renderizar();
    }
}

