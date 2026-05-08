package adapter.extra;

public class Main {
    static void main() {
        PagosLib adapter = new PasarelaAdapter(new PasarelaExterna());
        SistemaPagos sistemaPagos =  new SistemaPagos(adapter);
        sistemaPagos.pagar(250);
    }
}
