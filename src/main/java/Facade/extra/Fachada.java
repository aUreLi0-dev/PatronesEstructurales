package Facade.extra;

public class Fachada {
    private AlumnoValidator alumnoValidator;
    private CursoService cursoService;
    private DeudaService deudaService;
    private HorarioService horarioService;

    public Fachada() {
        this.alumnoValidator = new AlumnoValidator();
        this.cursoService = new CursoService();
        this.deudaService = new DeudaService();
        this.horarioService = new HorarioService();
    }

    /*public boolean validarAlumno(String codigo){
        alumnoValidator.validar(codigo);
        return true;
    }

    public void registrarCurso(){
        cursoService.registrarCursos();
    }

    public boolean verificarDeuda(String codigo){
        deudaService.tieneDeuda(codigo);
        return true;
    }

    public void generarHorario(){
        horarioService.generarHorario();
    }
*/
    public void matricular(String codigo) {

        if (alumnoValidator.validar(codigo)) {

            if (!deudaService.tieneDeuda(codigo)) {

                cursoService.registrarCursos();
                horarioService.generarHorario();

                System.out.println("Matrícula completada");
            }
        }
    }
}
