import device.IPhone;

public class Main{
    public static void main(String[] args) {
        // Criação do iPhone de teste
        System.out.println("--- Criando iPhone para testes ---");
        IPhone testIPhone = new IPhone();
        System.out.println("iPhone criado (" + testIPhone + ")");

        // ReprodutorMusical
        System.out.println("\n--- Testando Reprodutor Musical ---");
        testIPhone.getReprodutorMusical().tocar();
        testIPhone.getReprodutorMusical().pausar();
        testIPhone.getReprodutorMusical().selecionarMusica("Snow - Red Hot Chilli Peppers");

        // AparelhoTelefonico
        System.out.println("\n--- Testando Aparelho Telefônico ---");
        testIPhone.getAparelhoTelefonico().ligar("4002-8922");
        testIPhone.getAparelhoTelefonico().atender();
        testIPhone.getAparelhoTelefonico().iniciarCorreioVoz();

        // NavegadorInternet
        System.out.println("\n--- Testando Navegador na Internet ---");
        testIPhone.getNavegadorInternet().exibirPagina("https://github.com/PedroReimberg");
        testIPhone.getNavegadorInternet().adicionarNovaAba();
        testIPhone.getNavegadorInternet().atualizarPagina();
    }
}
