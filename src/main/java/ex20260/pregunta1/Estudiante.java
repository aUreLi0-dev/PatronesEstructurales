package ex20260.pregunta1;

public class Estudiante {
    private String email;
    private String telefono;

    public Estudiante(String email, String telefono) {
        this.email = email;
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String generarMensaje(String tarea) {
        return "Estudiante: se realizo la tarea " + tarea;
    }
}
