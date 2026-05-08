package ex20260.pregunta1;

public class EmailAdapter implements Notificador{
    EmailAPI emailAPI;

    public EmailAdapter() {
        this.emailAPI = new EmailAPI();
    }

    @Override
    public void send(String receptor, String mensaje) {
        emailAPI.sendEmail(receptor,mensaje);
    }
}
