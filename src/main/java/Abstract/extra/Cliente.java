package Abstract.extra;

public class Cliente {
    private Boton boton;
    private  Checkbox checkbox;

    public Cliente(GUIFactory guiFactory) {
        this.boton = guiFactory.crearBoton();
        this.checkbox = guiFactory.crearCheckBox();
    }

    public void renderizar(){
        boton.render();
        checkbox.pintar();
    }
}
