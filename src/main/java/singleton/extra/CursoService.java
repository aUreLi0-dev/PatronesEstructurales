package singleton.extra;

public class CursoService {
    private Logger logger = Logger.getInstance();

    public void crearCurso(String curso) {
        logger.log("Curso creado: " + curso);
    }
}
