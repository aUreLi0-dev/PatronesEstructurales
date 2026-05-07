package Abstract.extra;

public class Main {
    static void main() {
        String sistema = "windows";

        Boton boton;
        Checkbox checkBox;

        if (sistema.equals("windows")) {
            boton = new WindowsBoton();
            checkBox = new WindowsCheckbox();
        } else {
            boton = new MacBoton();
            checkBox = new MacCheckbox();
        }

        boton.render();
        checkBox.pintar();
    }
    }

