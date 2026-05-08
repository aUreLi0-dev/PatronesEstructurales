package ex20260.pregunta1;

import java.util.ArrayList;

public class PlataformaEducativa {
    private static PlataformaEducativa instance = null;

    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Docente> docentes;

    private Notificador emailService;
    private Notificador smsService;

    public static PlataformaEducativa getInstance(){
        if (instance == null){
            instance = new PlataformaEducativa();
        }
        return instance;
    }

    private PlataformaEducativa() {
        estudiantes = new ArrayList<>();
        docentes = new ArrayList<>();

        emailService = new EmailAdapter();
        smsService = new SMSAdapter();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void agregarDocente(Docente d) {
        docentes.add(d);
    }

    public void publicarTarea(String tarea, String fecha) {

        for (Estudiante e : estudiantes) {
            String mensaje = e.generarMensaje(tarea);
            emailService.send(e.getEmail(), mensaje);
            smsService.send(e.getTelefono(), mensaje);
        }

        for (Docente d : docentes) {
            String mensaje = d.generarMensaje(tarea, fecha);
            emailService.send(d.getEmail(), mensaje);
            smsService.send(d.getTelefono(), mensaje);
        }
    }
}
