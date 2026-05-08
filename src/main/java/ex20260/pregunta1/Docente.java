package ex20260.pregunta1;

public class Docente {
    private String email;
    private String telefono;

    public Docente(String email, String telefono) {
        this.email = email;
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String generarMensaje(String tarea, String fecha) {
        return "Docente: nueva tarea publicada " + tarea +
                " en la fecha " + fecha;
    }
}
