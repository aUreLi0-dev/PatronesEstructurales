package adapter;

public class FastSMS_Adapter implements Notificator{
    public FastSMS SMS;

    public FastSMS_Adapter(FastSMS SMS) {
        this.SMS = SMS;
    }

    @Override
    public void send(String recipient, String content) {
        SMS.sendInstantMessange(recipient,content);
    }
}
