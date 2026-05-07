package adapter;

public class EmailAdapter implements Notificator{
    public EmailService emailService;

    public EmailAdapter(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void send(String recipient, String content) {
        emailService.sendEmail(recipient, "Tengo miedo", content);
    }
}
