package ex20260.pregunta1;

public class Main {
    static void main() {

        PlataformaEducativa plataforma =
                PlataformaEducativa.getInstance();

        Estudiante e1 =
                new Estudiante("juan@gmail.com", "999111222");

        Docente d1 =
                new Docente("profe@gmail.com", "988777666");

        plataforma.agregarEstudiante(e1);
        plataforma.agregarDocente(d1);

        plataforma.publicarTarea(
                "Patrones de Diseño",
                "07/05/2026"
        );
    }
}
