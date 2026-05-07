package adapter;

public class MonitoringSystem{
    public void processAlerts(Notificator notificator, String recipient, String content){
        notificator.send(recipient, content);
    }
}
