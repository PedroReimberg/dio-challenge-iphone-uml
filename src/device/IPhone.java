package device;

import internet.NavegadorInternet;
import media.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class IPhone {
    private NavegadorInternet navegadorInternet;
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;

    public IPhone () {
        this.navegadorInternet = new NavegadorInternet();
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }
}
