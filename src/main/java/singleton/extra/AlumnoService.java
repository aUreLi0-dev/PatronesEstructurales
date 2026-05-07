package singleton.extra;

public class AlumnoService {
    private Logger logger = Logger.getInstance();

    public void registrarAlumno(String nombre) {
        logger.log("Alumno registrado: " + nombre);
    }
}
