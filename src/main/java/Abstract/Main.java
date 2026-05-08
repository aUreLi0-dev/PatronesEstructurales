package Abstract;

public class Main {
    static void main() {

        System.out.println("=== USANDO VISA ===");
        RedPago visa = new VisaFactory();
        SistemaBanco sistemaBancoVisa = new SistemaBanco(visa);
        sistemaBancoVisa.usar();

        System.out.println();

        System.out.println("=== USANDO MASTERCARD ===");
        RedPago mastercard = new MastercardFactory();
        SistemaBanco sistemaBancoMastercard = new SistemaBanco(mastercard);
        sistemaBancoMastercard.usar();
    }
}
