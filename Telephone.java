import interfaces.TelephoneInterface;
import modelos.NumberTelephone;

public class Telephone implements TelephoneInterface {

    @Override
    public void ligar(NumberTelephone numberTelephone) {

        System.out.println("Ligando para" + numberTelephone.getTelephoneNumber());
    }

    @Override
    public void atender() {
        System.out.println("Atendendo.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Inicnaido correio de voz");
    }
}
