package factory.extra;

public class TicketFactory extends ComprobanteFactory{
    @Override
    public Comprobante crear() {
        return new Ticket();
    }
}
