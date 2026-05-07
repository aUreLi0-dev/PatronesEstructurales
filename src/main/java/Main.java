
import adapter.*;
import factory.Aplicacion;
import factory.Documento;
import factory.HojaCalculo;
import factory.ProcesadorTexto;

import javax.print.Doc;


public class Main {
    public static void adapter(){
        MonitoringSystem monitor = new MonitoringSystem();
        EmailService emailService = new EmailService();
        Notificator email = new EmailAdapter(emailService);

        FastSMS libreriaExterna = new FastSMS();
        Notificator sms = new FastSMS_Adapter(libreriaExterna);

        monitor.processAlerts(email, "yo", "miedo");
        monitor.processAlerts(sms, "yo", "miedo");
    }

    public static void factory(){
        Aplicacion app = new ProcesadorTexto();
        Documento doc = app.crear();

        doc.abrir();
        doc.cerrar();


    }

    public static void decorator(){

    }

    static void main() {
        //adapter();
        factory();



    }
}
