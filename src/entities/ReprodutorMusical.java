package entities;

public class ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocar música");
    }
    public void pausar() {
        System.out.println("PAusar música");
    }
    public void selecionarMusica(String musica) {
        System.out.printf("Selecionar musica \"%s\"%n", musica);
    }
}
