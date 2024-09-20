package media;

public class ReprodutorMusical {
    public void tocar(){
        System.out.println("Tocando Musica");
    }

    public void pausar() {
        System.out.println("Musica Pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }
}
