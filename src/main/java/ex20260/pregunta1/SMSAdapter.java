package ex20260.pregunta1;

public class SMSAdapter implements Notificador{
    SMSAPI smsapi;

    public SMSAdapter() {
        this.smsapi = new SMSAPI();
    }

    @Override
    public void send(String receptor, String mensaje) {
        smsapi.enviarSMS(receptor,mensaje);
    }
}
