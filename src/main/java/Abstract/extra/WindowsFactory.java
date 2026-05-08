package Abstract.extra;

public class WindowsFactory extends GUIFactory{
    @Override
    public Boton crearBoton() {
        return new WindowsBoton();
    }

    @Override
    public Checkbox crearCheckBox() {
        return new WindowsCheckbox();
    }
}
