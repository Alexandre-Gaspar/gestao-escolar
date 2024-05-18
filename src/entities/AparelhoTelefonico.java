package entities;

public class AparelhoTelefonico {

    NavegadorDeInternet navegadorDeInternet;

    public AparelhoTelefonico(NavegadorDeInternet navegadorDeInternet) {
        this.navegadorDeInternet = navegadorDeInternet;
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correiro");
    }
}
