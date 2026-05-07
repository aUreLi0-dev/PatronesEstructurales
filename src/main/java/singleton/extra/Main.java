package singleton.extra;

public class Main {
    static void main() {
        AlumnoService a = new AlumnoService();
        CursoService c = new CursoService();

        a.registrarAlumno("Carlos");
        c.crearCurso("Patrones");

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        System.out.println(l1 == l2);
    }
}
