package Abstract.extra;

public class MacFactory extends GUIFactory{
    @Override
    public Boton crearBoton() {
        return new MacBoton();
    }

    @Override
    public Checkbox crearCheckBox() {
        return new MacCheckbox();
    }
}
